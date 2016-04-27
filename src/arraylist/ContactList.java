package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by justin on 4/18/2016.
 */
public class ContactList {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        ContactList myPhone = new ContactList();
        boolean continueFlag = true;
        while(continueFlag) {
            System.out.println("*****************");
            System.out.println("**  Main Menu  **");
            System.out.println("*****************");
            System.out.println("1. Add contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Delete contact");
            System.out.println("4. List contacts");
            System.out.println("5. Find contact");
            System.out.println("6. Exit");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter new contact name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new contact number: ");
                    int newNum = scanner.nextInt();
                    System.out.println("Create new contact: " + newName + ", " + newNum + "? Y/N");
                    if(scanner.nextLine().toUpperCase().equals("Y")){
                        addContact(new Contact(newName, newNum));
                    } else {
                        System.out.println("Canceled.");
                    }
                    break;


                case 2:
                    System.out.println("Enter name of contact to edit: ");
                    String editName = scanner.nextLine();
                    Contact found = findContact(editName);
                    if(found.getName() == null){
                        System.out.println("Sorry, contact " + editName + " was not found.");
                    } else {
                        System.out.println("Found contact " + found.getName() + ": " + found.getPhoneNumber());
                    }
                    System.out.println("Enter new name: ");
                    newName = scanner.nextLine();
                    System.out.println("Enter new phone number: ");
                    newNum =scanner.nextInt();
                    Contact replacement = replaceContact(found, new Contact(newName, newNum));
                    System.out.println("Contact " + editName + " changed to: " + replacement.getName() + ": " + replacement.getPhoneNumber());
                    break;


                case 3:
                    System.out.println("Enter name of contact to delete: ");
                    String delName = scanner.nextLine();
                    found = findContact(delName);
                    if(found.getName() == null){
                        System.out.println("Sorry, contact " + delName + " was not found.");
                    } else {
                        System.out.println("Found contact " + found.getName() + ": " + found.getPhoneNumber());
                        System.out.println("Are you sure you want to delete " + found.getName() + "? (Y/N)");
                        String response = scanner.nextLine();
                        if (response.toUpperCase().equals("Y")) {
                            delContact(delName);
                            System.out.println("Deleted contact " + delName);
                        } else {
                            System.out.println("Delete cancelled.");
                        }
                    }
                    break;


                case 4:
                    printContacts();
                    break;


                case 5:
                    System.out.println("Enter name to search for: ");
                    String searchName = scanner.nextLine();
                    found = findContact(searchName);
                    if(found.getName() == null){
                        System.out.println("Sorry, contact " + searchName + " was not found.");
                    } else {
                        System.out.println("Found contact " + found.getName() + ": " + found.getPhoneNumber());
                    }
                    break;


                case 6:
                    continueFlag = false;
                    break;
            }
        }

        System.out.println("Goodbye");
    }

    public static boolean addContact(Contact newContact) {
        if(findContact(newContact.getName()).getName()!= null) {
            contacts.add(newContact);
            return true;
        }
        return false;
    }

    public static Contact findContact(String name) {
        for(Contact contact : contacts) {
            if(contact.getName() == name) {
                return new Contact(name, contact.getPhoneNumber());
            }
        }
        return new Contact(null, (Integer)null);
    }

    public static Contact replaceContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact.getName()).getName() != null) {
            contacts.remove(oldContact);
            contacts.add(newContact);
        } else {
            System.out.println("Contact not found!");
        }
        return(findContact(newContact.getName()));
    }

    public static boolean delContact(String delName) {
        Contact found = findContact(delName);
        if (found.getName() != null) {
            contacts.remove(found);
            return true;
        } else {
            return false;
        }
    }

    public static void printContacts() {
        for(Contact contact : contacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }


}
