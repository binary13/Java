import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by justin on 3/16/2016.
 */
public class ISavableMain {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        List<Monster> monsters = new ArrayList<>();

        menu(players, monsters);

    }

    public static void menu(List<Player> players, List<Monster> monsters) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while(!quit) {
            System.out.println("Main menu");
            System.out.println("Please make a selection: \n" +
                    "1. Create a Player \n" +
                    "2. Create a Monster \n" +
                    "3. Print characters \n" +
                    "4. Save characters to disk \n" +
                    "5. Load characters from disk \n" +
                    "0. Quit");

            int choice;
            String line = scanner.nextLine();
            try {
                choice = Integer.parseInt(line);
            }
            catch(NumberFormatException|InputMismatchException ex){
                choice = 0;
            }


            switch (choice) {
                case 1:
                    Player newPlayer = new Player();
                    System.out.println("Enter the player's name: ");
                    newPlayer.setName(scanner.nextLine());
                    System.out.println("Enter the player's starting health: ");
                    newPlayer.setHealth(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter the player's strength: ");
                    newPlayer.setStrength(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter the player's weapon: ");
                    newPlayer.setWeapon(scanner.nextLine());
                    players.add(newPlayer);
                    continue;
                case 2:
                    Monster newMonster = new Monster();
                    System.out.println("Enter the monster's name: ");
                    newMonster.setName(scanner.nextLine());
                    System.out.println("Enter the monsters's starting health: ");
                    newMonster.setHealth(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter the monsters's strength: ");
                    newMonster.setStrength(Integer.parseInt(scanner.nextLine()));
                    monsters.add(newMonster);
                    continue;
                case 3:
                    System.out.println("Players: ");
                    for(Player player : players) {
                        System.out.println(player.toString());
                    }

                    System.out.println("");

                    System.out.println("Monsters: ");
                    for(Monster monster : monsters) {
                        System.out.println(monster.toString());
                    }
                    continue;
                case 4:
                    saveObjects(players, monsters);
                    continue;
                case 5:
                    players = loadPlayers();
                    monsters = loadMonsters();
                    continue;
                case 0:
                    quit = true;
                    continue;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    public static void saveObjects(List<Player> players, List<Monster> monsters) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("players.txt"));

            for(Player player : players) {
                writer.write(player.write());
                writer.newLine();
            }
            writer.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("monsters.txt"));
            for(Monster monster : monsters) {
                writer.write(monster.write());
                writer.newLine();
            }
            writer.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static List<Player> loadPlayers() {
        List<Player> players = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("players.txt"));
            String line = "";
            while((line = reader.readLine()) != null) {
                Player player = new Player();
                player.read(line);
                players.add(player);
            }
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        return players;
    }

    public static List<Monster> loadMonsters() {
        List<Monster> monsters = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("monsters.txt"));
            String line = "";
            while((line = reader.readLine()) != null) {
                Monster monster = new Monster();
                monster.read(line);
                monsters.add(monster);
            }
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        return monsters;
    }
}
