package CC02_BinaryTree;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public Book search(int bookId) {
        return searchingWithRecursion(getRoot(), bookId);
    }

    public Book searchingWithRecursion(Node currentNode, int bookId) {
        if (currentNode == null) {
            return null;
        } else if (currentNode.getBook().getId() == bookId) {
            return currentNode.getBook();
        } else if (bookId < currentNode.getBook().getId()) {
            return searchingWithRecursion(currentNode.getLeft(), bookId);
        } else {
            return searchingWithRecursion(currentNode.getRight(), bookId);
        }
    }

    //in the parameter is what we are searching for
    public Book searchingWithIteration(int bookId) {
        if (root == null) {
            return null;
        } else {
            //Use the helper to start the search by root
            Node currentNode = root;
            //Loop if the value is not found
            while (currentNode != null) {
                //If we find the root, we return it
                if (bookId == currentNode.getBook().getId()) {
                    return currentNode.getBook();
                }
                //Check the left side of the tree
                else if (bookId < currentNode.getBook().getId()) {
                    currentNode = currentNode.getLeft();
                }
                //Check the right
                else if (bookId > currentNode.getBook().getId()) {
                    currentNode = currentNode.getRight();
                }
            }
        }
        return null;
    }
}
