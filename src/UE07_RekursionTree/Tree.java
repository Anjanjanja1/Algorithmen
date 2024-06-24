package UE07_RekursionTree;

public class Tree {
    private Node root;


    public void add(int number) {
        Node newNode = new Node(number);

        //LOOP VARIANTE
        addLoop(newNode);
    }

    private void addLoop(Node newNode) {
        //When the tree is empty
        if (root == null) {
            root = newNode;
        }
        //When the tree has at least one root
        //Always when you want to add an element, you start from ROOT
        else {
            Node currentNode = root;
            while (true) {
                //THE NEW VALUE IS SMALLER THAN ROOT
                if (newNode.getNumber() < currentNode.getNumber()) {
                    //If there is already a Node on the left
                    if (currentNode.getLeft() != null) {
                        currentNode = currentNode.getLeft();
                    }
                    //When there is no Node on the left, then setLeft to newNode
                    else {
                        currentNode.setLeft(newNode);
                        newNode.setParent(currentNode); //SETTING THE PARENT TO NEWNODE
                        break;
                    }
                    //THE NEW VALUE IS BIGGER THAN ROOT
                } else {
                    //If there is already a Node on the right
                    if (currentNode.getRight() != null) {
                        currentNode = currentNode.getRight();
                        //When there is no Node on the left, then setLeft to newNode
                    } else {
                        currentNode.setRight(newNode);
                        newNode.setParent(currentNode); //SETTING THE PARENT TO NEWNODE
                        break;
                    }
                }
            }

        }

    }

    public void printTreeNodes(Node currentNode) {
        if (currentNode.getNumber() != 3){
            System.out.print(currentNode.getNumber() + " ");
        }
        if (currentNode.getLeft() != null){
            printTreeNodes(currentNode.getLeft());
        }
        if (currentNode.getRight() != null){
            printTreeNodes(currentNode.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
