public class Main {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Address Book---------");
        Person p1 = new Person();
        AddressBookService s1 = new AddressBookService();
        //contact of 1 person
        s1.setValues(p1);
        System.out.println(s1.display(p1));
        AddressBook a1 = new AddressBook();
        a1.contactList.put(1,p1);
        System.out.println(a1.contactList);
        // contact of second person
        Person p2 = new Person();
        s1.setValues(p2);
        System.out.println(s1.display(p2));
        a1.contactList.put(2,p2);
        System.out.println(a1.contactList);
    }
}