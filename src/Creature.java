import java.util.Random;

public abstract class Creature {

    private String name;
    private double weight;
    private int maxPerLocation;
    private int speed;
    private int hunger;
    private boolean isAlive;
    private int x;
    private int y;

    public abstract void eat();

    public abstract void move();

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
}

class CreatureFactory {

    public Creature createRandomCreature() {
        String[] creatureList = {"Pegasus", "Satyr", "GoldenRam", "Dryad", "SacredCow", "CretanElephant", "MythicalDeer", "ArcadianHare", "TempleMouse",
                "SacredBull", "NemeanLion", "Hydra", "Chimera", "Cyclops", "Griffin"};
        int index = new Random().nextInt(creatureList.length);
        String type = creatureList[index];

        switch (type) {
            case "Pegasus" -> {
                return new Pegasus("Pegasus", 300.0, 5, 4, 50, true);
            }
            case "Satyr" -> {
                return new Satyr("Satyr", 80.0, 10, 3, 15, true);
            }
            case "GoldenRam" -> {
                return new GoldenRam("GoldenRam", 100.0, 7, 2, 25, true);
            }
            case "Dryad" -> {
                return new Dryad("Dryad", 40.0, 12, 2, 10, true);
            }
            case "SacredCow" -> {
                return new SacredCow("SacredCow", 400.0, 5, 2, 60, true);
            }
            case "CretanElephant" -> {
                return new CretanElephant("CretanElephant", 700.0, 2, 1, 100, true);
            }
            case "MythicalDeer" -> {
                return new MythicalDeer("MythicalDeer", 250.0, 6, 4, 40, true);
            }
            case "ArcadianHare" -> {
                return new ArcadianHare("ArcadianHare", 3.0, 30, 3, 5, true);
            }
            case "TempleMouse" -> {
                return new TempleMouse("TempleMouse", 0.2, 60, 2, 1, true);
            }
            case "SacredBull" -> {
                return new SacredBull("SacredBull", 500, 3, 2, 80, true);
            }
            case "NemeanLion" -> {
                return new NemeanLion("NemeanLion", 250.0, 4, 3, 45, true);
            }
            case "Hydra" -> {
                return new Hydra("Hydra", 800.0, 1, 2, 120, true);
            }
            case "Chimera" -> {
                return new Chimera("Chimera", 600.0, 2, 3, 90, true);
            }
            case "Cyclops" -> {
                return new Cyclops("Cyclops", 500.0, 2, 2, 70, true);
            }
            case "Griffin" -> {
                return new Griffin("Griffin", 350.0, 4, 4, 50, true);
            }
            default -> throw new IllegalArgumentException("Unknown creature type: " + type);
        }
    }
}

class Pegasus extends Creature{

    public Pegasus(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Satyr extends Creature{

    public Satyr(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class GoldenRam extends Creature{

    public GoldenRam(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Dryad extends Creature{

    public Dryad(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class SacredCow extends Creature{

    public SacredCow(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class CretanElephant extends Creature{

    public CretanElephant(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class MythicalDeer extends Creature{

    public MythicalDeer(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class ArcadianHare extends Creature{

    public ArcadianHare(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class TempleMouse extends Creature{

    public TempleMouse(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class SacredBull extends Creature{

    public SacredBull(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class NemeanLion extends Creature{

    public NemeanLion(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Hydra extends Creature{

    public Hydra(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Chimera extends Creature{

    public Chimera(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Cyclops extends Creature{

    public Cyclops(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}

class Griffin extends Creature{

    public Griffin(String name, double weight, int maxPerLocation, int speed, int hunger, boolean isAlive) {
        this.setName(name);
        this.setWeight(weight);
        this.setMaxPerLocation(maxPerLocation);
        this.setSpeed(speed);
        this.setHunger(hunger);
        this.setAlive(isAlive);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}


