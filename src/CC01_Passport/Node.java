package CC01_Passport;

public class Node {
    private String lastName;
    private Node next;

    public Node(String lastName) {
        this.lastName = lastName;
        this.next = null;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
