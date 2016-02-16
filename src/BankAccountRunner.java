/**
 * Created by justin on 2/11/2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccountRunner {

    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BankAccount myAccount = new BankAccount();

        myAccount.setAccNumber(24126);
        myAccount.setAccBalance(100);

        while(true) {
            System.out.println("***************************");
            System.out.println("Welcome to the Banking App.");
            System.out.println("***************************");
            System.out.println("Choose from the following options.");
            System.out.println("Would you like to:");
            System.out.println("1. View your account balance.");
            System.out.println("2. Make a deposit.");
            System.out.println("3. Make a withdrawal.");
            System.out.println("4. Exit.");

            String input = br.readLine();
            int i;

            try{
                i = Integer.parseInt(input);
            }catch(NumberFormatException nfe){
                System.err.println("Invalid input!");
                continue;
            }

            if(i == 1) {
                System.out.println(String.format("Your current account balance is $%.2f.", myAccount.getAccBalance()));
                System.out.println("Press Enter to continue.");
                br.readLine();
                continue;
            }
            if(i == 2) {
                System.out.println("Enter the amount of your deposit: ");
                input = br.readLine();
                double amount;
                try{
                    amount = Double.parseDouble(input);
                }catch(NumberFormatException nfe){
                    System.err.println("Invalid input!");
                    continue;
                }
                myAccount.makeDeposit(amount);
                System.out.println("Press Enter to continue.");
                br.readLine();
                continue;
            }
            if(i==3) {
                System.out.println("Enter the amount of your withdrawal: ");
                input = br.readLine();
                int amount;
                try{
                    amount = Integer.parseInt(input);
                }catch(NumberFormatException nfe){
                    System.err.println("Invalid input!");
                    continue;
                }
                myAccount.makeWithdrawal(amount);
                System.out.println("Press Enter to continue.");
                br.readLine();
                continue;
            }
            if(i==4) {
                System.out.println("Exiting the program...");
                break;
            }

            System.err.println("Invalid input!");
        }
    }
}
