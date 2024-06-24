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
        } else {
            Node currentNode = root;
            while (true) {
                //THE NEW VALUE IS SMALLER THAN ROOT
                if (newNode.getId() < currentNode.getId()) {
                    //If there is already a Node on the left
                    if (currentNode.getLeft() != null) {
                        currentNode = currentNode.getLeft();
                    }
                    //When there is no Node on the left, then setLeft to newNode
                    else {
                        currentNode.setLeft(newNode);
                        break;
                    }
                    //THE NEW VALUE IS BIGGER THAN ROOT
                } else {
                    //If there is already a Node on the right
                    if (currentNode.getRight() != null) {
                        currentNode = currentNode.getRight();
                        //When there is no Node on the right, then setLeft to newNode
                    } else {
                        currentNode.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }
}
