import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Island {

    private int cols;
    private int rows;
    public List<Creature>[][] creatureList;
    public List<AmbrossiaGrass>[][] plantList;
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

    public Island (int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        this.creatureList = new List[rows][cols];
        this.plantList = new List[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                creatureList[i][j] = Collections.synchronizedList(new ArrayList<>());
                plantList[i][j] = Collections.synchronizedList(new ArrayList<>());
            }
        }
    }

    public void populateIsland() {
        spawnCreatures();
        spawnPlants(200);
    }

    public void spawnCreatures(){
        scheduler.scheduleAtFixedRate(() -> {

            try {

                boolean full = false;
                CreatureFactory factory = new CreatureFactory();

                for (String species : factory.getAllSpeciesTypes()) {

                    Creature template = factory.createCreature(species, 0, 0);

                    int spawnX = template.getSpawnX();
                    int spawnY = template.getSpawnY();
                    int maxPerLoc = template.getMaxPerLocation();

                    int count = countSpeciesAt(spawnX, spawnY, template.getClass());

                    if (count < maxPerLoc) {
                        Creature newCreature = factory.createCreature(species, spawnX, spawnY);
                        creatureList[spawnX][spawnY].add(newCreature);
                        System.out.println("⚡ " + species + " spawned at [" + spawnX + "," + spawnY + "]");
                    }
                    full = true;
                }

                if (!full){
                    System.out.println("✅ All species are at max capacity. Stopping spawn task.");
                    scheduler.shutdown();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }, 1, 2, TimeUnit.SECONDS);

    }

    public void spawnPlants(int max) {

            try {

                for (int i = 0; i < max; i++) {
                    int row = ThreadLocalRandom.current().nextInt(rows);
                    int col = ThreadLocalRandom.current().nextInt(cols);
                    AmbrossiaGrass grass = new AmbrossiaGrass(20, row, col);
                    plantList[row][col].add(grass);
                }

            } catch (Exception e) {
                e.printStackTrace();
        }
    }

    public void move(Creature creature){
        int row = creature.getX(); // stays the same
        int fromCol = creature.getY();
        int toCol = creature.getY() +

        // 1. Bounds check
        if (toCol < 0 || toCol >= cols) {
            return;
        }

        // 2. Check capacity at destination
        int countAtDestination = countSpeciesAt(row, toCol, creature.getClass());
        if (countAtDestination >= creature.getMaxPerLocation()) {
            return; // can't move there, location full
        }

        // 3. Remove from old location
        creatureList[row][fromCol].remove(creature);

        // 4. Update creature position
        creature.setPosition(row, toCol);

        // 5. Add to new location
        creatureList[row][toCol].add(creature);

        // 6. Optional: log move
        System.out.println("➡ " + creature.getName() + " moved from [" + row + "," + fromCol + "] to [" + row + "," + toCol + "]");

    }

    public void simulationLoop(List<Creature> allCreatures){



    }

    public int countSpeciesAt(int x, int y, Class<? extends Creature> type) {
        int count = 0;
        for (Creature c : creatureList[x][y]) {
            if (type.isInstance(c))
                count++;
        }
        return count;
    }
}




