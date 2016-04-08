package generics;

import java.util.ArrayList;
import java.util.Collections;

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

    public boolean addTeam(T team) {
        if(team != null && !teams.contains(team)) {
            teams.add(team);
            return true;
        }
        else return false;
    }

    public void printTable() {
        if(teams != null) {
            System.out.println("---------------------------------------------------");
            System.out.println("Highest Ranking Teams in League " + this.name);
            System.out.println("---------------------------------------------------");

            Collections.sort(teams);
            Collections.reverse(teams);

            int count = 1;
            String out = "";
            for (Team team : teams) {
                out = count + ": "+team.getName()+" with "+team.won+" wins, "+team.lost+" losses, "+team.tied+" tied.";
                System.out.println(out);
                count++;
            }
        }
    }

}
