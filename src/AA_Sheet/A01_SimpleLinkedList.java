package AA_Sheet;

//-------------------------------NODE CLASS-------------------------------
class Node_SLL {
    int data;
    Node_SLL next;

    Node_SLL(int data) {
        this.data = data;
        this.next = null;
    }

    public Node_SLL getNext() {
        return next;
    }

    public void setNext(Node_SLL next) {
        this.next = next;
    }
}

//-------------------------------LINKED LIST CLASS-------------------------------
class A01_SimpleLinkedList {
    Node_SLL first;
    Node_SLL last;


//-------------------------------INSERT AT THE BEGINNING: O(1)-------------------------------
    public void insertAtBeginning(int data) {
        Node_SLL newNode = new Node_SLL(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

//-------------------------------INSERT AT THE END: O(1)-------------------------------
    public void insertAtEnd(int data) {
        Node_SLL newNode = new Node_SLL(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

//-------------------------------SEARCH: O(n)-------------------------------
    public boolean search(int key) {
        Node_SLL current = first;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

//-------------------------------DELETE BY KEY: O(1)-------------------------------
    public void deleteACertainIndex(int position) {
        Node_SLL current = first;

        //List is empty, there's nothing to delete
        if (first == null) {
            return;
        } else if (position == 0) {
            //When list contains of only one element
            if (first == last) {
                last = null;
            }
            //Second element becomes the first
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

    public void display() {
        Node_SLL current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

class test1 {
    public static void main(String[] args) {
        A01_SimpleLinkedList list = new A01_SimpleLinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(6);
        list.insertAtBeginning(7);
        list.insertAtBeginning(8);
        list.insertAtBeginning(9);
        list.insertAtBeginning(10);
        list.display();

        list.deleteACertainIndex(1);
        list.display();

        System.err.println(list.search(3));
    }
}