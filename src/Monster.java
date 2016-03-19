import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by justin on 3/17/2016.
 */
public class Monster implements ISavable {
    private String name;
    private int health;
    private int strength;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return name + ":" +
                "\n\t health: " + health +
                "\n\t strength: " + strength;
    }

    @Override
    public String write() {
        return (name + "," + health + "," + strength);
    }

    @Override
    public void read(String input) {
        List<String> savedValues = new ArrayList<>();
        String[] splitString = input.split(",");

        savedValues.addAll(Arrays.asList(splitString));

        /*
        for(String sString : splitString) {
            savedValues.add(sString);
        }
        */

        if(savedValues != null && savedValues.size()>0) {
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
        else System.out.println("Failed to load values. File may be empty or nonexistent.");
    }

}
