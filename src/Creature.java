import java.util.Random;

public abstract class Creature {

    protected String name;
    protected double weight;
    protected int maxSpeed;
    protected int minSpeed;
    protected int hunger;
    protected boolean isAlive;
    protected int x;
    protected int y;
    private static final Random rand = new Random();

    // Spawn control
    protected int maxPerLocation;
    protected int spawnX;
    protected int spawnY;

    public Creature(double weight, String name, int maxSpeed, int minSpeed, int hunger, boolean isAlive, int x, int y) {
        this.weight = weight;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.hunger = hunger;
        this.isAlive = isAlive;
        this.x = x;
        this.y = y;

    }

    public static int randInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }


    public abstract void eat();

    public abstract void moveMessage();

    public final void move(Creature c){

    }

    public abstract void reproduce();

    public abstract void die();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxPerLocation() {
        return maxPerLocation;
    }

    public void setMaxPerLocation(int maxPerLocation) {
        this.maxPerLocation = maxPerLocation;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setPosition(int newX, int newY){this.x = newX; this.y = newY;}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpawnX() {
        return spawnX;
    }

    public int getSpawnY() {
        return spawnY;
    }
}

class CreatureFactory {

    public Creature createCreature(String type, int x, int y) {
        switch (type) {
            case "Pegasus" -> {
                return new Pegasus("Pegasus", 300.0, 1, 4, 50, true, x, y);
            }
            case "Satyr" -> {
                return new Satyr("Satyr", 80.0, 3, 1, 15, true, x, y);
            }
            case "GoldenRam" -> {
                return new GoldenRam("GoldenRam", 100.0, 1,2,  25, true, x, y);
            }
            case "Dryad" -> {
                return new Dryad("Dryad", 40.0,1, 2, 10, true, x, y);
            }
            case "SacredCow" -> {
                return new SacredCow("SacredCow", 400.0, 1,2, 60, true, x, y);
            }
            case "CretanElephant" -> {
                return new CretanElephant("CretanElephant", 700.0, 1,1, 100, true, x, y);
            }
            case "MythicalDeer" -> {
                return new MythicalDeer("MythicalDeer", 250.0, 1,4, 40, true, x, y);
            }
            case "ArcadianHare" -> {
                return new ArcadianHare("ArcadianHare", 3.0, 1,3, 5, true, x, y);
            }
            case "TempleMouse" -> {
                return new TempleMouse("TempleMouse", 0.2, 1,2, 1, true, x, y);
            }
            case "SacredBull" -> {
                return new SacredBull("SacredBull", 500, 1,2, 80, true, x, y);
            }
            case "NemeanLion" -> {
                return new NemeanLion("NemeanLion", 250.0, 1,3, 45, true, x, y);
            }
            case "Hydra" -> {
                return new Hydra("Hydra", 800.0, 1, 2,120, true, x, y);
            }
            case "Chimera" -> {
                return new Chimera("Chimera", 600.0,1, 3, 90, true, x, y);
            }
            case "Cyclops" -> {
                return new Cyclops("Cyclops", 500.0, 1,2, 70, true, x, y);
            }
            case "Griffin" -> {
                return new Griffin("Griffin", 350.0, 1,4, 50, true, x, y);
            }
            default -> throw new IllegalArgumentException("Unknown creature type: " + type);
        }
    }

    public String[] getAllSpeciesTypes() {
        return new String[] {
                "Pegasus", "Satyr", "GoldenRam", "Dryad", "SacredCow",
                "CretanElephant", "MythicalDeer", "ArcadianHare", "TempleMouse",
                "SacredBull", "NemeanLion", "Hydra", "Chimera", "Cyclops", "Griffin"
        };
    }
}

class Pegasus extends Creature{

    private static final int MAX_PER_LOCATION = 5;
    private static final int SPAWN_X = 1;
    private static final int SPAWN_Y = 13;
    //Pegasus come out of a Mountain peak

    public Pegasus(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Satyr extends Creature{
    private static final int MAX_PER_LOCATION = 15;
    private static final int SPAWN_X = 4;
    private static final int SPAWN_Y = 4;
    //Satyrs come out of a Forest glade

    public Satyr(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class GoldenRam extends Creature{
    private static final int MAX_PER_LOCATION = 20;
    private static final int SPAWN_X = 9;
    private static final int SPAWN_Y = 12;
    //Golden Rams come out of a Sacred pasture

    public GoldenRam(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Dryad extends Creature{
    private static final int MAX_PER_LOCATION = 8;
    private static final int SPAWN_X = 3;
    private static final int SPAWN_Y = 6;
    //Dryads come out of an Ancient oak grove

    public Dryad(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class SacredCow extends Creature{
    private static final int MAX_PER_LOCATION = 12;
    private static final int SPAWN_X = 7;
    private static final int SPAWN_Y = 8;
    //Sacred Cows come out of a Temple courtyard

    public SacredCow(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class CretanElephant extends Creature{
    private static final int MAX_PER_LOCATION = 3;
    private static final int SPAWN_X = 13;
    private static final int SPAWN_Y = 10;
    //Cretan Elephants come out of Island plains

    public CretanElephant(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class MythicalDeer extends Creature{
    private static final int MAX_PER_LOCATION = 25;
    private static final int SPAWN_X = 11;
    private static final int SPAWN_Y = 4;
    //Mythical Deers come out of an Enchanted meadow

    public MythicalDeer(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class ArcadianHare extends Creature{
    private static final int MAX_PER_LOCATION = 60;
    private static final int SPAWN_X = 5;
    private static final int SPAWN_Y = 10;
    //Arcadian Hares come out of a Hidden burrow

    public ArcadianHare(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class TempleMouse extends Creature{
    private static final int MAX_PER_LOCATION = 500;
    private static final int SPAWN_X = 8;
    private static final int SPAWN_Y = 7;
    //Temple Mice come out of a Temple pantry

    public TempleMouse(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class SacredBull extends Creature{
    private static final int MAX_PER_LOCATION = 10;
    private static final int SPAWN_X = 2;
    private static final int SPAWN_Y = 2;
    //Sacred Bulls come out of a Shrine near a waterfall

    public SacredBull(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class NemeanLion extends Creature{
    private static final int MAX_PER_LOCATION = 2;
    private static final int SPAWN_X = 14;
    private static final int SPAWN_Y = 14;
    //Nemean Lions come out of a Rocky den

    public NemeanLion(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Hydra extends Creature{
    private static final int MAX_PER_LOCATION = 1;
    private static final int SPAWN_X = 0;
    private static final int SPAWN_Y = 6;
    //Hydras come out of a Swamp

    public Hydra(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Chimera extends Creature{
    private static final int MAX_PER_LOCATION = 2;
    private static final int SPAWN_X = 12;
    private static final int SPAWN_Y = 1;
    //Chimeras come out of a Volcanic ridge

    public Chimera(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Cyclops extends Creature{
    private static final int MAX_PER_LOCATION = 3;
    private static final int SPAWN_X = 6;
    private static final int SPAWN_Y = 0;
    //Cyclops come out of a Coastal cave

    public Cyclops(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Griffin extends Creature{
    private static final int MAX_PER_LOCATION = 4;
    private static final int SPAWN_X = 7;
    private static final int SPAWN_Y = 14;
    //Griffins come out of a High cliff

    public Griffin(String name, double weight, int minSpeed, int maxSpeed, int hunger, boolean isAlive, int x, int y) {
        super(weight, name, minSpeed, maxSpeed, hunger, isAlive, x ,y);
        this.maxPerLocation = MAX_PER_LOCATION;
        this.spawnX = SPAWN_X;
        this.spawnY = SPAWN_Y;
    }
    @Override
    public void eat() {

    }

    @Override
    public void moveMessage() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}


