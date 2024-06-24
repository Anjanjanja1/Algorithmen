package CC02_EmployeeTree;

public class Node {
    private int id;
    private Node left;
    private Node right;


    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
