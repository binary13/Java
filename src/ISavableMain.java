import java.util.ArrayList;
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
                    "3. Print players \n" +
                    "4. Print monsters \n" +
                    "5. Save characters to disk \n" +
                    "6. Load characters from disk \n" +
                    "0. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

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
                    continue;
                case 4:
                    System.out.println("Monsters: ");
                    for(Monster monster : monsters) {
                        System.out.println(monsters.toString());
                    }
                    continue;
                case 5:
                    saveObjects(players, monsters);
                    continue;
                case 6:
                    players = loadPlayers();
                    monsters = loadMonsters();
                case 0:
                    quit = true;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    public static void saveObjects(List<Player> players, List<Monster> monsters) {
        for(Player player : players) {
            player.write();
        }

        for(Monster monster : monsters) {
            monster.write();
        }
    }

    public static List<Player> loadPlayers() {
        List<Player> players = new ArrayList<>();

        try {

        }
    }
}
