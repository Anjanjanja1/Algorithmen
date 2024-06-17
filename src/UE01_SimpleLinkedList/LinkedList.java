package UE01_SimpleLinkedList;

public class LinkedList {
    private Node first;
    private Node last;

    //method to add new Nodes at the end of the LinkedList
    public void addNodeOnLastPosition(String groceries) {

        Node newNode = new Node(groceries);

        //at the beginning first and last are NULL, call this as a first step; when the list is empty!
//        first = newNode;
//        last = newNode;

        //this was the 2. step to add additional grocery on the list
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void addNodeOnFirstPosition(String groceries) {
        Node newNode = new Node(groceries);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void deleteACertainIndex(int position) {
        Node current = first;

        //List is empty, there's nothing to delete
        if (first == null) {
            return;
        } else if (position == 0) {

            //When list contains of only one element
            if (first == last) {
                last = null;
            }

            //second element becomes the first
            first = current.getNext();
        } else {

            //Search for a certain position
            for (int i = 0; i < (position - 1); i++) {

                //Already reached the end of the LinkedList
                if (current == last) {
                    return;
                }

                //Jumping one Node
                current = current.getNext();
            }
            if (current.getNext().getNext() == null) {
                last = current;
            }

            //Change the reference
            current.setNext(current.getNext().getNext());


        }
    }

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

    @Override
    public String toString() {
        return "Linked list: " + first + " " + last;
    }
}
