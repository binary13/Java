/**
 * Created by justin on 2/16/2016.
 */
public class Appliance {

    private String name;
    private int bulbs;
    private int watts;
    private boolean portable;

    public Appliance(String name, int bulbs, int watts, boolean portable) {
        this.name = name;
        this.bulbs = bulbs;
        this.watts = watts;
        this.portable = portable;
    }

    public Appliance(String name, int bulbs) {
        this.name = name;
        this.bulbs = bulbs;
        this.watts = bulbs * 60;
        this.portable = false;
    }

    public String getName() {
        return name;
    }

    public int getBulbs() {
        return bulbs;
    }

    public int getWatts() {
        return watts;
    }

    public boolean isPortable() {
        return portable;
    }
}
