package UE04_BookStack;

public class Node {
    // *** Membervariablen ***
    private final String bookTitle;
    private Node next;

    // *** Konstruktor ***
    public Node(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Node " + "bookTitle: " + bookTitle;
    }

    // *** Getter- und Setter-Methoden ***
    public String getBookTitle() {
        return bookTitle;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
