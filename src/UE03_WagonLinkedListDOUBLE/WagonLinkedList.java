package UE03_WagonLinkedListDOUBLE;

public class WagonLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Methoden ***
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void insertWagonAtFirstPos(String wagonId) {
        Node newWagon = new Node();
        newWagon.setWagonId(wagonId);
        //If the list is empty
        if (first == null) {
            first = newWagon;
            last = newWagon;
        }
        //When not empty...
        else {
            newWagon.setNext(first);
            first.setPrev(newWagon);
            first = newWagon;
        }
    }

    void removeWagonFromLastPos() {
        //Fall 1 : List is empty
        if (first == null) {
            return;
        } else if (first == last){
            first = null;
            last = null;
        }
        //Fall 2 : List is NOT empty
        else {
            last = last.getPrev();
            last.setNext(null);
        }
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
