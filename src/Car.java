/**
 * Created by justin on 2/14/2016.
 */
public class Car extends Vehicle {

    public Car (String make, String model, String engine) {
        super(make, model, engine);
    }

    public Car (String make, String model) {
        this(make, model, "Unknown");
    }

    public Car () {
        this("Unknown", "Unknown", "Unknown");
        System.out.println("Car constructor called with zero arguments");
    }

    public void speedUp(int mph) {
        super.speedUp(mph);
        System.out.println("Vroom!");
    }
}
