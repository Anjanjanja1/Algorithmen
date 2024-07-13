package AA_Sheet;

//-------------------------------NODE CLASS-------------------------------
class Node_DLL {
    int data;
    Node_DLL next;
    Node_DLL prev;

    Node_DLL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node_DLL getNext() {
        return next;
    }

    public void setNext(Node_DLL next) {
        this.next = next;
    }

    public Node_DLL getPrev() {
        return prev;
    }

    public void setPrev(Node_DLL prev) {
        this.prev = prev;
    }
}

//-------------------------------LINKED LIST CLASS-------------------------------
class A02_DoubleLinkedList {
    Node_DLL first;
    Node_DLL last;

//-------------------------------INSERT AT THE BEGINNING: O(1)-------------------------------
    public void insertAtBeginning(int data) {
        Node_DLL newNode = new Node_DLL(data);
        //If the list is empty
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        //When not empty...
        else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

//-------------------------------INSERT AT THE END: O(1)-------------------------------
    public void insertAtEnd(int data) {
        Node_DLL newNode = new Node_DLL(data);
        // If the list is empty
        if (last == null) {
            first = newNode;
            last = newNode;
        }
        // When not empty...
        else {
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

//-------------------------------SEARCH: O(n)-------------------------------
    public boolean search(int key) {
        Node_DLL current = first;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

//-------------------------------DELETE BY KEY: O(1)-------------------------------
    public void deleteByKey(int key) {
        Node_DLL current = first;
        while (current != null) {
            if (current.data == key) {
                // Node to be deleted is the first node
                if (current == first) {
                    first = current.getNext();
                    if (first != null) {
                        first.setPrev(null);
                    }
                }
                // Node to be deleted is the last node
                else if (current == last) {
                    last = current.getPrev();
                    if (last != null) {
                        last.setNext(null);
                    }
                }
                // Node to be deleted is in the middle
                else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }
                return;
            }
            current = current.getNext();
        }
    }

//-------------------------------DELETE FROM LAST POSITION: O(1)-------------------------------
    void deleteFromLastPos() {
        //Fall 1 : List is empty
        if (first == null) {
            return;
        } else if (first == last) {
            first = null;
            last = null;
        }
        //Fall 2 : List is NOT empty
        else {
            last = last.getPrev();
            last.setNext(null);
        }
    }

//-------------------------------DELETE FROM FIRST POSITION: O(1)-------------------------------
    public void deleteFromFirstPos() {
        // Case 1: List is empty
        if (first == null) {
            return;
        } else if (first == last) {
            first = null;
            last = null;
        }
        // Case 2: List is NOT empty
        else {
            first = first.getNext();
            first.setPrev(null);
        }
    }

    public void display() {
        Node_DLL current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

class test2 {
    public static void main(String[] args) {
        A02_DoubleLinkedList list = new A02_DoubleLinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);
        list.insertAtBeginning(5);
        list.deleteFromLastPos();
        list.display();
        //OUTPUT: 5 4 3 2 1

        System.out.println("----------");
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.deleteFromFirstPos();
        list.display();
        //OUTPUT: 1 2 3 4 5

        System.out.println("----------");
        list.deleteByKey(1);
        list.display();

        System.out.println("Element found in the list: " + list.search(3));
        list.display();
    }
}