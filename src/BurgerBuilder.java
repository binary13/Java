import java.io.*;
import java.util.ArrayList;

/**
 * Created by justin on 3/2/2016.
 */


class Burger {
    private String bunType;
    private int patties;
    private ArrayList<String> toppings;

    public Burger(String bunType, int patties) {
        this.bunType = bunType;
        this.patties = patties;
    }

    public String showToppings() {
        String rString = "";
        int i = 1;
        for(String topping : toppings) {
            rString += "\n" + i + topping;
            i++;
        }
        return rString;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public void showPrice() {

    }
}

class InputGetter {

    private BufferedReader br;

    public InputGetter()
    {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getInt() throws IOException {
        int i = 0;
        String input = this.br.readLine();
        try {
            i = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.err.println("Invalid input!");
            return -1;
        }
        return i;
    }

    public String getString() throws IOException {
        return this.br.readLine();
    }
}

class CustomBurgerMenu {

    public CustomBurgerMenu() throws IOException {
        InputGetter iGet = new InputGetter();
        System.out.println("What type of bun would you like?");
        String bun = iGet.getString();
        System.out.println("How many patties would you like?");
        int patties = iGet.getInt();

        Burger myBurger = new Burger(bun, patties);

        while (true) {
            System.out.println("Building a Custom Burger!");
            System.out.println("Your burger currently contains: " + myBurger.showToppings());
            System.out.println("You may add up to four toppings.");
            System.out.println("Choose from the following options.");
            System.out.println("Would you like to:");
            System.out.println("1. Add a topping.");
            System.out.println("2. Remove a topping.");
            System.out.println("3. Finish burger.");
            System.out.println("4. Go back.");

            int choice = iGet.getInt();

            if (choice == -1) { continue; }
            else {

            }
        }
    }

}

class VeggieBurgerMenu {}

class DeluxeComboMenu {}

public class BurgerBuilder {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("***************************");
            System.out.println("Welcome to Burger Builder!");
            System.out.println("***************************");
            System.out.println("Choose from the following options.");
            System.out.println("Would you like to:");
            System.out.println("1. Build a Custom Burger.");
            System.out.println("2. Build a Veggie Burger.");
            System.out.println("3. Build a Deluxe Combo.");
            System.out.println("4. Exit.");

            int i = 0;

            String input = br.readLine();
            try {
                i = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input!");
                continue;
            }

            if (i == 1) {


            }

        }
    }
}