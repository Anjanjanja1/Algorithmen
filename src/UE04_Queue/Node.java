package UE04_Queue;

public class Node {
    // *** Membervariablen ***
    //Value(int, String, Object)
    private Person person;
    //Reference
    private Node next;

    // *** Konstruktor ***
    public Node(Person person) {
        this.person = person;
    }

    // *** Getter- und Setter-Methoden ***
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
