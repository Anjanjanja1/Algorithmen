package AA_Sheet;

//-------------------------------NODE CLASS-------------------------------
class Node_S {
    int data;
    Node_S next;

    Node_S(int data) {
        this.data = data;
        this.next = null;
    }

    public Node_S getNext() {
        return next;
    }

    public void setNext(Node_S next) {
        this.next = next;
    }
}
class A03_Stack {
    private Node_S top;

    public A03_Stack() {
        this.top = null;
    }

//-------------------------------PUSH: O(1)-------------------------------
    public void push(int value) {
        Node_S newNode = new Node_S(value);
        newNode.setNext(top);
        top = newNode;
    }

//-------------------------------POP: O(1)-------------------------------
    public int pop() {
        Node_S currentNode = top;
        if (top == null) {
            return -1;
        } else {
            top = top.getNext();
            return currentNode.data;
        }
    }
//-------------------------------SEARCH: O(n)-------------------------------
    public boolean search(int value) {
        Node_S currentNode = top;
        while (currentNode != null) {
            if (currentNode.data == value) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node_S currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
class test3 {
    public static void main(String[] args) {
        A03_Stack stack = new A03_Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        //OUTPUT: 5 4 3 2 1

        System.out.println(stack.search(4));

        stack.pop();
        stack.display();
        //OUTPUT: 4 3 2 1

    }
}