import java.util.concurrent.ThreadLocalRandom;

public class AmbrossiaGrass {
    private int energy;
    private int x;
    private int y;

    public AmbrossiaGrass(int energy, int x, int y) {
        this.energy = energy;
        this.x = x;
        this.y = y;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
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

    public void grow(){
        System.out.println("New ambrossia grass growing");
    }

}
