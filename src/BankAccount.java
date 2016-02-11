/**
 * Created by justin on 2/11/2016.
 */
public class BankAccount {

    private int accNumber = 0;
    private double accBalance = 0;
    private String customerName;
    private String customerEmail;
    private int customerPhone = 0;


    public void makeDeposit(double amount) {
        System.out.println(String.format("You are making a deposit of $%.2f to account #%d.", amount, this.accNumber));
        this.accBalance += amount;
        System.out.println(String.format("Deposit complete. Your account balance is now $%.2f.", this.accBalance));
    }

    public void makeWithdrawal(double amount) {
        if(this.accBalance >= amount) {
            System.out.println(String.format("You are making a withdrawal of $%.2f from account #%d.", amount, this.accNumber));
            this.accBalance -= amount;
            System.out.println(String.format("Withdrawal complete. Your account balance is now $%.2f.", this.accBalance));
        }
        else {
            System.out.println("Insufficient funds.");
        }
    }



    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }




}


