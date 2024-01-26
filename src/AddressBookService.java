import java.util.Scanner;
public class AddressBookService {
    public String display(Person p){
        return p.getFirstName()+" "+p.getLastName()+" "+p.getCity()+" "+p.getState()+" "+ p.getEmail()+" "+p.getPhoneNumber()+ " "+p.getZip();
    }
    public void setValues(Person p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first = sc.next();
        p.setFirstName(first);
        System.out.println("Enter Last Name");
        String last = sc.next();
        p.setLastName(last);
        System.out.println("Enter City");
        String city = sc.next();
        p.setCity(city);
        System.out.println("Enter State");
        String state = sc.next();
        p.setState(state);
        System.out.println("Enter Email");
        String email = sc.next();
        p.setEmail(email);
        System.out.println("Enter Phone Number");
        int phoneNo = sc.nextInt();
        p.setPhoneNumber(phoneNo);
        System.out.println("Enter zip");
        int zip = sc.nextInt();
        p.setZip(zip);
    }
}
