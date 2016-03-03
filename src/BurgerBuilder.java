import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by justin on 3/2/2016.
 */


class Burger {
    private String bunType;
    private ArrayList<String> toppings;
    private boolean cheese;

    public Burger(String bunType, boolean cheese) {
        this.bunType = bunType;
        this.cheese = cheese;
    }

    public void showToppings() {
        int i = 1;
        for(String topping : toppings) {
            System.out.println(i + topping);
            i++;
        }
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

            String input = br.readLine();
            int i;

            try {
                i = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input!");
                continue;
            }

            if (i == 1) {

                Burger myBurger = new Burger();

                while (true) {
                    System.out.println("Building a Custom Burger!");
                    System.out.println("Your burger currently contains: " + myBurger.print());
                    System.out.println("You may add up to four toppings.");
                    System.out.println("Choose from the following options.");
                    System.out.println("Would you like to:");
                    System.out.println("1. Add a topping.");
                    System.out.println("2. Remove a topping.");
                    System.out.println("3. Finish burger.");
                    System.out.println("4. Go back.");

                    input = br.readLine();

                    try {
                        i = Integer.parseInt(input);
                    } catch (NumberFormatException nfe) {
                        System.err.println("Invalid input!");
                        continue;
                    }
                }
            }

        }
    }
}