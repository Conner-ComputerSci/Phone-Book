public class PBNode {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String city;
    public String address;
    public PBNode next;

    public PBNode(){
        this.next = null;
    }

    public PBNode(PBNode next_node, String firstName, String lastName, String phoneNumber, String city, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.address = address;
        this.next = next_node;
    }

    public String toString()
    {
        return("("+this.firstName + " " + this.lastName + " | "+this.phoneNumber + " | " + this.city + ", " + this.address+")");
    }
}



//public int size() {return size;}