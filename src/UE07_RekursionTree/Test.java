package UE07_RekursionTree;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(1);

        tree.add(7);
        tree.add(6);
        tree.add(8);


        tree.printTreeNodes(tree.getRoot());
    }


}