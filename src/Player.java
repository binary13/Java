import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by justin on 2/16/2016.
 */
public class Player implements ISavable {

    private String name;
    private int health;
    private int strength;
    private String weapon;


    public Player(String name, int health, int strength, String weapon) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.weapon = weapon;
    }

    public Player(){
        this.name = "Unknown";
        this.health = 20;
        this.strength = 20;
        this.weapon = "Wooden sword";
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return name + ":" +
                "\n\t health: " + health +
                "\n\t strength: " + strength +
                "\n\t weapon: " + weapon;
    }


    @Override
    public String write() {

        return (name + "," + health + "," + strength + "," + weapon);

    }

    @Override
    public void read(String input) {
        List<String> savedValues = new ArrayList<>();
        String[] splitString = input.split(",");

        for(String sString : splitString) {
            savedValues.add(sString);
        }

        if(savedValues != null && savedValues.size()>0) {
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
        else System.out.println("Failed to load values. File may be empty or nonexistent.");
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out.");
            // reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
