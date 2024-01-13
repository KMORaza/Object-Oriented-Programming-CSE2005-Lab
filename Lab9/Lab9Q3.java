package Lab9;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 15/12/2021
import java.util.HashMap;
import java.util.Map;
class Contact {
    private String name;
    private String mobileNumber;
    private String email;
    private String organization;
    public Contact(String name, String mobileNumber, String email, String organization) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.organization = organization;
    }
    public String getName() {
        return name;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getOrganization() {
        return organization;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Mobile Number: " + mobileNumber + ", Email: " + email + ", Organization: " + organization;
    }
}
class ContactManager {
    private Map<String, Contact> contacts = new HashMap<>();
    public void addContact(String key, Contact contact) {
        contacts.put(key, contact);
    }
    public void removeContact(String key) {
        contacts.remove(key);
    }
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }
    public Contact searchContact(String key) {
        return contacts.get(key);
    }
}
public class Lab9Q3 {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        // Adding contacts
        contactManager.addContact("John", new Contact("John", "1234567890", "john@email.com", "ABC Corp"));
        contactManager.addContact("Alice", new Contact("Alice", "9876543210", "alice@email.com", "XYZ Ltd"));
        // Displaying contacts
        System.out.println("All Contacts:");
        contactManager.displayContacts();
        // Searching for a contact
        String searchKey = "John";
        Contact searchedContact = contactManager.searchContact(searchKey);
        if (searchedContact != null) {
            System.out.println("\nSearch Result for '" + searchKey + "':");
            System.out.println(searchedContact);
        } else {
            System.out.println("\nContact '" + searchKey + "' not found.");
        }
        // Removing a contact
        String removeKey = "Alice";
        contactManager.removeContact(removeKey);
        // Displaying contacts after removal
        System.out.println("\nContacts after removing '" + removeKey + "':");
        contactManager.displayContacts();
    }
}
