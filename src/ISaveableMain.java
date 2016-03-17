import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by justin on 3/16/2016.
 */
public class ISaveableMain {
    public static void main(String[] args) {

        Player player = new Player();

        System.out.println(player.toString());

        loadObject(player);
        saveObject(player);

        System.out.println(player.toString());

    }

    public static ArrayList<String> readValues() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;

        while(!quit) {
            System.out.println("Main menu");
            System.out.println("Enter 1 to create a Player, 0 to quit.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the player's name: ");
                    values.add(scanner.nextLine());
                    System.out.println("Enter the player's beginning health: ");
                    values.add(scanner.nextLine());
                    System.out.println("Enter the player's strength: ");
                    values.add(scanner.nextLine());
                    System.out.println("Enter the player's weapon: ");
                    values.add(scanner.nextLine());
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
                    continue;
            }
        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
