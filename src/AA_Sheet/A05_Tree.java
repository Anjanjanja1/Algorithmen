package AA_Sheet;

class TreeNode {
    int data;
    protected TreeNode left;
    protected TreeNode right;

    public TreeNode(int item) {
        data = item;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class A05_Tree {
    TreeNode root;

    public A05_Tree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

//-------------------------------ADD: O(log n) for balanced, O(n) for unbalanced-------------------------------
    public void add(int key) {
        root = insertWithRecursion(root, key);
    }

    public TreeNode insertWithRecursion(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.data)
            root.setLeft(insertWithRecursion(root.getLeft(), key));
        else if (key > root.data)
            root.setRight(insertWithRecursion(root.getRight(), key));
        return root;
    }

    //-------------------------------SEARCH: O(log n) for balanced, O(n) for unbalanced-------------------------------
    //-------------------------------RECURSION-------------------------------
    public TreeNode search(int data) {
        return searchingWithRecursion(getRoot(), data);
    }

    public TreeNode searchingWithRecursion(TreeNode currentNode, int data) {
        if (currentNode == null) {
            return null;
        } else if (currentNode.getData() == data) {
            return currentNode;
        } else if (data < currentNode.getData()) {
            return searchingWithRecursion(currentNode.getLeft(), data);
        } else {
            return searchingWithRecursion(currentNode.getRight(), data);
        }
    }

    //-------------------------------LOOP-------------------------------
    public TreeNode searchingWithIteration(int data) {
        if (root == null) {
            return null;
        } else {
            TreeNode currentNode = root;
            while (currentNode != null) {
                if (data == currentNode.getData()) {
                    return currentNode;
                } else if (data < currentNode.getData()) {
                    currentNode = currentNode.getLeft();
                } else {
                    currentNode = currentNode.getRight();
                }
            }
        }
        return null;
    }

    //-------------------------------DELETE: O(log n) for balanced, O(n) for unbalanced-------------------------------
    public void delete(int key) {
        root = deleteWithRecursion(root, key);
    }

    TreeNode deleteWithRecursion(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.data)
            root.left = deleteWithRecursion(root.left, key);
        else if (key > root.data)
            root.right = deleteWithRecursion(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteWithRecursion(root.right, root.data);
        }
        return root;
    }

    int minValue(TreeNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public void display(TreeNode root) {
        TreeNode currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            if (currentNode.getLeft() != null) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        System.out.println();
    }
}

//-------------------------------Main Class-------------------------------
class test5 {
    public static void main(String[] args) {
        A05_Tree tree = new A05_Tree(null);

        // Add nodes to the tree
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);

        // Search for nodes in the tree
        TreeNode result1 = tree.search(2);
        if (result1 != null) {
            System.out.println("Found node with data: " + result1.getData());
        } else {
            System.out.println("Node with data 2 not found.");
        }

        TreeNode result2 = tree.searchingWithIteration(2);
        if (result2 != null) {
            System.out.println("Found node with data: " + result2.getData());
        } else {
            System.out.println("Node with data 2 not found.");
        }

        // Delete a node from the tree
        tree.delete(3);
        TreeNode result3 = tree.search(3);
        if (result3 != null) {
            System.out.println("Found node with data: " + result3.getData());
        } else {
            System.out.println("Node with data 3 not found.");
        }

        tree.display(tree.getRoot());
    }
}
