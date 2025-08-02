import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Location <O> {

    public final int x;
    public final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    List<Creature> creatureList = Collections.synchronizedList(new ArrayList<>());
    List<O> list = Collections.synchronizedList(new ArrayList<>());

    public void addCreature(Creature creature){
        creatureList.add(creature);
    }

    public void removeCreature(Creature creature){
        creatureList.remove(creature);
    }

    public List<Creature> getCreatureList() {
        return creatureList;
    }

    @Override
    public String toString() {
        return "Creatures: " + creatureList.size();
    }

}
