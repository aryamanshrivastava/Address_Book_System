import java.util.HashMap;
import java.util.Scanner;
public class AddressBook {
    HashMap<Integer, Person> contactList = new HashMap<>();

    // Method to add a new person to the address book
    public void addPerson(AddressBookService addressBookService) {
        Person newPerson = new Person();
        addressBookService.setValues(newPerson); // Using the setValues method from AddressBookService
        int newContactId = contactList.size() + 1;
        contactList.put(newContactId, newPerson);
        System.out.println("Contact added successfully with ID: " + newContactId);
    }

    // This method is responsible for editing an existing contact by name
    public void editContactByName(AddressBookService addressBookService) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name of the person you want to edit:");
        String name = sc.next();

        for (Person person : contactList.values()) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                // person found, edit details using AddressBookService
                addressBookService.setValues(person);
                System.out.println("Contact details updated successfully.");
                return; // exit the method after updating
            }
        }

        // if person name not found
        System.out.println("Person with the given name not found in the address book.");
    }
}
