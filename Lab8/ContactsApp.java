package Lab8;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
import java.util.ArrayList;
import java.util.Scanner;

class Contacts {
    private String firstName;
    private String lastName;
    private String organization;
    private String mobileNumber;

    public Contacts(String firstName, String lastName, String organization, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOrganization() {
        return organization;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}

class ContactList {
    private ArrayList<Contacts> contactsList = new ArrayList<>();

    public void addContact(Contacts contact) {
        contactsList.add(contact);
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contactsList.size()) {
            contactsList.remove(index);
        } else {
            System.out.println("Invalid index. Contact not deleted.");
        }
    }

    public void displayContacts() {
        for (Contacts contact : contactsList) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Organization: " + contact.getOrganization());
            System.out.println("Mobile Number: " + contact.getMobileNumber());
            System.out.println("--------------------------");
        }
    }
}

public class ContactsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter Organization: ");
                    String organization = scanner.next();
                    System.out.print("Enter Mobile Number: ");
                    String mobileNumber = scanner.next();

                    Contacts newContact = new Contacts(firstName, lastName, organization, mobileNumber);
                    contactList.addContact(newContact);
                    break;
                case 2:
                    System.out.print("Enter the index to delete: ");
                    int indexToDelete = scanner.nextInt();
                    contactList.deleteContact(indexToDelete);
                    break;
                case 3:
                    contactList.displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
