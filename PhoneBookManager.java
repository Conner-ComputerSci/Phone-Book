import java.util.LinkedList;

public class PhoneBookManager{
    //LinkedList<PBNode> phoneBookList = new LinkedList<PBNode>();

    PBNode start_node;


    PhoneBookManager(){
        start_node = null;
    }

    public void addContact(String firstName, String lastName, String phoneNumber, String city, String address){
        if(isEmpty()){
            start_node = new PBNode(null, firstName, lastName, phoneNumber, city, address);
        } else {
            PBNode theNewNode = new PBNode(start_node, firstName, lastName, phoneNumber, city, address);
            start_node = theNewNode;
        }
    }

    private boolean isEmpty(){
        return start_node == null;
    }


    public void DisplayList(){
        PBNode currentNode = start_node;
        System.out.println("The start of the list");
        while(currentNode != null){
            System.out.println("The first name: " + currentNode.firstName);
            System.out.println("The last name " + currentNode.lastName);
            System.out.println("The phone number " + currentNode.phoneNumber);
            System.out.println("The city " + currentNode.city);
            System.out.println("The address " + currentNode.address);
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void DeleteContact(String contactToDelete){
        //PBNode currentNode = start_node;
        //currentNode = currentNode.next;
        boolean deletedContact = false;
        
        while(!deletedContact){
            if(currentNode.lastName == contactToDelete){
                currentNode.firstName = null;
                currentNode.lastName = null;
                currentNode.phoneNumber = null;
                currentNode.city = null;
                currentNode.address = null;
                deletedContact = true;
                System.out.println("Deleting " + contactToDelete);
            }else{
                currentNode = currentNode.next;
            }
        }

    }
}