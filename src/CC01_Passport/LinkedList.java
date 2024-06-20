package CC01_Passport;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void addNewPersonAtLastPos(String lastName) {
        Node newNode = new Node(lastName);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }
}
