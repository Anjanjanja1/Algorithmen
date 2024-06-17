package UE01_SimpleLinkedList;

public class Node {
    private String groceries; //=WERT
    private Node next; //=REFERENZ(shows to the next element)

    public Node(String groceries) {
        this.groceries = groceries;
        this.next = null; //don't have to do it, but CAN set it to null
    }

    public String getGroceries() {
        return groceries;
    }

    public void setGroceries(String groceries) {
        this.groceries = groceries;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return groceries;
    }
}
