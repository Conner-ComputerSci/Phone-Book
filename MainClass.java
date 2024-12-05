import java.util.*;
public class MainClass {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        PhoneBookManager phoneBook = new PhoneBookManager();
        int menu = 0;

        while(menu != 5){
            System.out.println();
            System.out.println("1. Add new contact");
            System.out.println("2. Delete contact || Coming Soon");
            System.out.println("3. Search contact || Coming Soon");
            System.out.println("4. Print contacts list");
            System.out.println("5. Exit");
            System.out.print("Please select your choice: ");
            String response = console.nextLine();
            menu = Integer.parseInt(response);






            switch (menu) {
                case 1: //adds contact
                    System.out.println("Please enter first name: ");
                    String firstName = console.nextLine();
    
                    System.out.println("Please enter last name: ");
                    String lastName = console.nextLine();
    
                    System.out.println("Please enter Phone Number: ");
                    String phoneNumber = console.nextLine();
    
                    System.out.println("Please enter city: ");
                    String city = console.nextLine();
    
                    System.out.println("Please enter Address: ");
                    String address = console.nextLine();
                    //console.nextLine();
                    phoneBook.addContact(firstName, lastName, phoneNumber, city, address);

                    break;
                case 2:
                    //System.out.println("Please enter the last name of the contact you want to delete: ");
                    //phoneBook.DeleteContact(console.nextLine());
                    break;
                case 3:
                    
                    break;
                case 4:
                    phoneBook.DisplayList();
                    break;
                default:
                    break;
            }
    

        }

    }
}