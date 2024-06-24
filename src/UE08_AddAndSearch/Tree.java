package UE08_AddAndSearch;

public class Tree {
    private Node root;

    public void add(int number) {
        Node newNode = new Node(number);

        //LOOP VARIANTE
        //addLoop(newNode);

        //REKURSION VARIANTE
        //When the tree is empty
        if (root == null) {
            root = newNode;
        }
        //When the tree has at least one root
        else {
            addRecursive(root, newNode);
        }
    }

    // Add - Variante Rekursion
    private void addRecursive(Node currentNode, Node newNode) {
        //THE NEW VALUE IS SMALLER THAN ROOT
        if (newNode.getNumber() < currentNode.getNumber()) {
            //When there is an element on the left
            if (currentNode.getLeft() != null) {
                addRecursive(currentNode.getLeft(), newNode);
            } else {
                currentNode.setLeft(newNode);
                newNode.setParent(currentNode);
            }
        }
        //THE NEW VALUE IS BIGGER THAN ROOT
        else {
            if (currentNode.getRight() != null) {
                addRecursive(currentNode.getRight(), newNode);
            } else {
                currentNode.setRight(newNode);
                newNode.setParent(currentNode);
            }
        }
    }

    // Add - Variante Loop
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

    public Node searchNumber(int number) {
        System.out.print("SearchNumber - ");

        // TODO: Entweder Variante 1 oder 2 einkommentieren
        // Variante 1: Aufruf Rekursiv
        if (root.getNumber() == number) {
            return root;
        } else {
            return searchNumberRecursive(root, number);
        }
        // Variante 2: Aufruf Schleife
        //return searchNumberLoop(number);
    }

    // Suche - Variante Rekursion
    private Node searchNumberRecursive(Node currentNode, int number) {
        if (currentNode == null){
            return null;
        }
        //Case: if the value is found
        else if (currentNode.getNumber() == number) {
            return currentNode;
        }
        //to the left...smaller
        else if(currentNode.getNumber() > number) {
            return searchNumberRecursive(currentNode.getLeft(), number);
        }
        //to the right...bigger
        else {
            return searchNumberRecursive(currentNode.getRight(), number);
        }
//        //THE NUMBER IS SMALLER THAN ROOT
//        if (number < currentNode.getNumber()) {
//            //When there is an element on the left
//            if (currentNode.getLeft() != null) {
//                if (number == currentNode.getLeft().getNumber()) {
//                    return currentNode.getLeft();
//                } else {
//                    return searchNumberRecursive(currentNode.getLeft(), number);
//                }
//            }
//        }
//        //THE NEW VALUE IS BIGGER THAN ROOT
//        else {
//            if (currentNode.getRight() != null) {
//                if (number == currentNode.getRight().getNumber()) {
//                    return currentNode.getRight();
//                } else {
//                    return searchNumberRecursive(currentNode.getRight(), number);
//                }
//            }
//        }
//        return currentNode;
    }


    // Suche - Variante Schleife
    private Node searchNumberLoop(int number) {
        Node currentNode = root;
        while (currentNode != null){
            //Case: the node if found
            if (currentNode.getNumber() == number) {
                return currentNode;
            }
            //Searched value is bigger than the current node
            else if (currentNode.getNumber() < number) {
                currentNode = currentNode.getRight();
            }
            //Searched value is smaller than the current node
            else {
                currentNode = currentNode.getLeft();
            }
        }
        return currentNode;
    }


/**
 * Funktion zur Ausgabe des gesamten Baums.
 */
public void printTree() {
    printTree(root, "");
}

/**
 * Funktion zur Ausgabe des Baums unterhalb eines Knotens
 *
 * @param currentNode Knoten, dessen Teilbaum ausgegeben werden soll
 * @param prefix      Zur Einr�ckung
 */
public void printTree(Node currentNode, String prefix) {
    if (currentNode == null) {
        return;
    }
    System.out.println(prefix + currentNode.getNumber());
    printTree(currentNode.getLeft(), prefix + "L ");
    printTree(currentNode.getRight(), prefix + "R ");
}


}