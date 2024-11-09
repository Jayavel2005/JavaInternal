import java.util.HashMap;
import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Contact
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNo = scanner.nextLine();
                    addContact(phoneBook, name, phoneNo);
                    break;
                
                case 2: // Remove Contact
                    System.out.print("Enter contact name to remove: ");
                    name = scanner.nextLine();
                    removeContact(phoneBook, name);
                    break;
                
                case 3: // Search Contact
                    System.out.print("Enter contact name to search: ");
                    name = scanner.nextLine();
                    searchContact(phoneBook, name);
                    break;
                
                case 4: // Display Contacts
                    display(phoneBook);
                    break;
                
                case 5: // Exit
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addContact(HashMap<String, String> phoneBook, String name, String phoneNo) {
        phoneBook.put(name, phoneNo);
        System.out.println("Contact added: " + name + " - " + phoneNo);
    }

    public static void removeContact(HashMap<String, String> phoneBook, String name) {
        if (phoneBook.isEmpty()) {
            System.out.println("The phonebook is empty.");
        } else if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void searchContact(HashMap<String, String> phoneBook, String name) {
        if (phoneBook.isEmpty()) {
            System.out.println("The phonebook is empty.");
        } else if (phoneBook.containsKey(name)) {
            System.out.println("Phone number for " + name + ": " + phoneBook.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void display(HashMap<String, String> phoneBook) {
        if (phoneBook.isEmpty()) {
            System.out.println("The phonebook is empty.");
        } else {
            System.out.println("Contacts in the phonebook:");
            for (String name : phoneBook.keySet()) {
                System.out.println(name + " - " + phoneBook.get(name));
            }
        }
    }
}
