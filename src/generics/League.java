package generics;

import java.util.ArrayList;

/**
 * Created by justin on 4/5/16.
 */
public class League<T extends Team>
{
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public ArrayList<T> sort() {
        ArrayList<T> teamsSorted = new ArrayList<>();

        for(Team team : teams) {

        }
    }

    public void print() {

    }

}
