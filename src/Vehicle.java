/**
 * Created by justin on 2/14/2016.
 */
public class Vehicle {

    private String make;
    private String model;
    private String engine;
    private int wheels;
    private int doors;

    public Vehicle (String make, String model, String engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.wheels = 4;
        this.doors = 4;

        System.out.println(String.format("New %s created.", this.getClass().getSimpleName()));
        this.getMake();
        this.getModel();
        this.getEngine();
        this.getDoors();
        this.getWheels();
    }

    public Vehicle (String make, String model) {
        this(make, model, "Unknown");
    }

    public Vehicle () {
        this("Unknown", "Unknown", "Unknown");
    }

    public String getMake() {
        System.out.println("Make: " + this.make);
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        System.out.println("Model: " + this.model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        System.out.println("Engine: " + this.engine);
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        System.out.println("Wheels: "+ this.wheels);
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        System.out.println("Doors: " + this.doors);
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }



    public void steerRight(int degrees) {
        System.out.println(String.format("Steering %d degrees right.", degrees));
    }

    public void steerLeft(int degrees) {
        System.out.println(String.format("Steering %d degrees left.", degrees));
    }

    public void speedUp(int mph) {
        System.out.println(String.format("Speeding up to %d miles per hour.", mph));
    }

    public void slowDown(int mph) {
        System.out.println(String.format("Slowing down to %d miles per hour.", mph));
    }

    public void changeGears(int gear) {
        System.out.println(String.format("Changing gears to %s", ordinal(gear)));
    }

    public String ordinal (int num) {
        switch(num) {
            case 1: return "first";
            case 2: return "second";
            case 3: return "third";
            default: return num+"th";
        }
    }
}
