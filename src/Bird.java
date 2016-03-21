/**
 * Created by justin on 3/20/2016.
 */
public abstract class Bird extends Animal implements ICanFly {

    public Bird (String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, tweet!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings.");
    }
}
