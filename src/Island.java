import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Island <O> {

    private int cols;
    private int rows;
    private List<O> list = Collections.synchronizedList(new ArrayList<>());
    public List[][] island;
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

    public Island (int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        this.island = new List[3][3];
    }

    public List[][] getIsland() {
        return island;
    }
        public void populateIsland() {
            spawnCreatures();

    }

    public void spawnCreatures(){

        scheduler.scheduleAtFixedRate(() -> {

            try {

                CreatureFactory factory = new CreatureFactory();
                Creature creature = factory.createRandomCreature();
                int x = new Random().nextInt(rows);
                int y = new Random().nextInt(cols);
                creature.setX(x);
                creature.setY(y);
                list.add((O) creature);
                System.out.println("⚡ " + creature.getName() + " spawned at [" + x + "," + y + "]");

                } catch (Exception e) {
                e.printStackTrace();
                }
            }, 2, 2, TimeUnit.SECONDS);
        }

    public void createPlants(int max) {

        scheduler.scheduleAtFixedRate(() -> {

            try {

                for (int i = 0; i < max; i++) {
                    int row = ThreadLocalRandom.current().nextInt(rows);
                    int col = ThreadLocalRandom.current().nextInt(cols);

                    if (island[row][col] == null){
                        island[row][col] = Collections.singletonList(new AmbrossiaGrass(20, row, col));
                    } else {
                        i--;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 2, 2, TimeUnit.SECONDS);
    }
}


