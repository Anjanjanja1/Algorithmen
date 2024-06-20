package UE03_WagonLinkedListDOUBLE;

public class Node {
    // *** Membervariablen ***
    private String wagonId; //Stellt die Kennung des Wagons dar.
    private Node next; //Stellt die Referenz zum nächsten Wagon dar.
    private Node prev; //Stellt die Referenz zum vorherigen Wagon dar

    // *** Constructor ***


    // *** Getter- & Setter-Methoden ***
    public String getWagonId() {
        return wagonId;
    }

    public void setWagonId(String wagonId) {
        this.wagonId = wagonId;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
