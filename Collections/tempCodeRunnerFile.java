import java.util.HashMap;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        
        HashMap<String, String> Countries = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add Country");
            // System.out.println("2. Remove Country");
            System.out.println("2. Search Country");
            System.out.println("3. Display Country");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Contact
                    System.out.print("Enter country name: ");
                    String countryName = scanner.nextLine();
                    System.out.print("Enter capital number: ");
                    String capital = scanner.nextLine();
                    addContact(Countries, countryName, capital);
                    break;
                
                // case 2: // Remove Contact
                //     System.out.print("Enter contact countryName to remove: ");
                //     countryName = scanner.nextLine();
                //     removeContact(Countries, countryName);
                //     break;
                
                case 2: // Search Contact
                    System.out.print("Enter contact countryName to search: ");
                    countryName = scanner.nextLine();
                    searchContact(Countries, countryName);
                    break;
                
                case 3: // Display Contacts
                    display(Countries);
                    break;
                
                case 4: // Exit
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addContact(HashMap<String, String> Countries, String CountryName, String capitalName) {
        Countries.put(CountryName,capitalName);
        System.out.println("Country added: " + CountryName + " - " + capitalName);
    }

    

    public static void searchContact(HashMap<String, String> Countries, String name) {
        if (Countries.isEmpty()) {
            System.out.println("The Countries is empty.");
        } else if (Countries.containsKey(name)) {
            System.out.println("Phone number for " + name + ": " + Countries.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void display(HashMap<String, String> Countries) {
        if (Countries.isEmpty()) {
            System.out.println("The Countries is empty.");
        } else {
            System.out.println("Contacts in the Countries:");
            for (String name : Countries.keySet()) {
                System.out.println(name + " - " + Countries.get(name));
            }
        }
    }
}
