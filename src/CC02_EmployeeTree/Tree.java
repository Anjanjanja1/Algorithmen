package CC02_EmployeeTree;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void addNewEmployeeId(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
        }
    }
}
