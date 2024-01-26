public class Main {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Address Book---------");

        AddressBookService addressBookService = new AddressBookService();
        AddressBook addressBook = new AddressBook();

        // Add a new person to the address book
        addressBook.addPerson(addressBookService);

        // Display the address book after adding the first person
        System.out.println("Address Book after adding the first person:");
        for (Person person : addressBook.contactList.values()) {
            System.out.println(addressBookService.display(person));
        }


        // Edit an existing contact by name
        addressBook.editContactByName(addressBookService);

        // Display the updated address book
        System.out.println("Address Book after editing a contact:");
        for (Person person : addressBook.contactList.values()) {
            System.out.println(addressBookService.display(person));
        }
    }
}
