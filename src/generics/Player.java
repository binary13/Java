package generics;

/**
 * Created by justin on 4/3/2016.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
