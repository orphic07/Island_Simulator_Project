public abstract class Plant {
    private int weight;
    private int maxPerLocation;

    public int getMaxPerLocation() {
        return maxPerLocation;
    }

    public void setMaxPerLocation(int maxPerLocation) {
        this.maxPerLocation = maxPerLocation;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void grow();

}

class AmbrossiaGrass extends Plant{

    public AmbrossiaGrass() {
        setWeight(1);
        setMaxPerLocation(200);
    }

    @Override
    public void grow() {

    }
}
