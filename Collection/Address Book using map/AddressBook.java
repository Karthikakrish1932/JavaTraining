import java.util.Scanner;
import java.util.TreeMap;

public class AddressBook {
    private TreeMap<String, String> contacts;

    public AddressBook() {
        contacts = new TreeMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added successfully.");
    }

    public void searchByName(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Name: " + name + ", Phone Number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("Contact List:");
            for (String name : contacts.keySet()) {
                System.out.println("Name: " + name + ", Phone Number: " + contacts.get(name));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search by Name");
            System.out.println("3. Delete Contact");
            System.out.println("4. Show Full Contact List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    addressBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    addressBook.searchByName(name);
                    break;
                case 3:
                    System.out.print("Enter name to delete: ");
                    name = scanner.nextLine();
                    addressBook.deleteContact(name);
                    break;
                case 4:
                    addressBook.displayAllContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
}
