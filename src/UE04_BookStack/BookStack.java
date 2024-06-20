package UE04_BookStack;

import java.util.Stack;

public class BookStack {
    // *** Membervariablen ***
    private Node top;
    private int count;

    public BookStack() {
        top = null;
        count = 0;
    }

    @Override
    public String toString() {
        return "BookStack " + "top: " + top + ", count: " + count;
    }

    // *** Getter- und Setter-Methoden ***
    public Node getTop() {
        return top;
    }

    public int getCount() {
        return count;
    }


    // *** Operationen ***
    public void push(String bookTitle) {
        Node newNode = new Node(bookTitle);
        count++;
        if (top == null) {
            top = newNode;
            top.setNext(null); //This does NOT have to be here
        } else {
            newNode.setNext(top);
            top = newNode;
        }
//THIS IS THE SAME AS THE CODE ABOVE
//        top = newNode;
//        if (top != null){
//            newNode.setNext(top);
//        }
//THE SHORTEST WAY TO DO THE PUSH -> SAME LOGIC:
//        newNode.setNext(top);
//        top = newNode;

    }

    public String pop() throws StackEmptyException {
        //Node currentNode = top;
        if (top == null) {
            throw new StackEmptyException("Stack is empty");
        } else {
            //top = currentNode.getNext();
            String bookTitle = top.getBookTitle();
            top = top.getNext();
            count--;
            return bookTitle;
        }
    }

    public void printAllBooks(){
        Node currentNode = top;
        while (currentNode != null) {
            System.out.println(currentNode.getBookTitle());
            currentNode = currentNode.getNext();
        }
    }
}
