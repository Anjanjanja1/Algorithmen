package UE08_AddAndSearch;

public class Node
{
    // *** Membervariablen ***
    private int number;
    private Node left;
    private Node right;
    private Node parent; //always optional

    // *** Konstruktor ***
    public Node(int number) {
        this.number = number;
    }


    // *** Getter- & Setter-Methoden ***
    public void setNumber(int number) {
        this.number = number;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getNumber() {
        return number;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getParent() {
        return parent;
    }
}
