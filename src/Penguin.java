/**
 * Created by justin on 3/20/2016.
 */
public class Penguin extends Bird {

    public Penguin (String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, how about we go for a swim instead?");
    }
}
