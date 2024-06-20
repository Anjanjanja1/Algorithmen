package CC02_EmployeeTree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addNewEmployeeId(500);
        System.out.println("1) Root: [SOLL] 500, [IST] " + (tree.getRoot() == null ? "null" : tree.getRoot().getId()));

        tree.addNewEmployeeId(300);
        System.out.println("2) Root-Left: [SOLL] 300, [IST] " +
                ((tree.getRoot() == null) || (tree.getRoot().getLeft() == null) ? "null" : tree.getRoot().getLeft().getId()));

        tree.addNewEmployeeId(700);
        System.out.println("3) Root-Right: [SOLL] 700, [IST] " +
                ((tree.getRoot() == null) || (tree.getRoot().getRight() == null) ? "null" : tree.getRoot().getRight().getId()));

        tree.addNewEmployeeId(350);
        tree.addNewEmployeeId(320);
        System.out.println("4) Root-Left-Right-Left: [SOLL] 320, [IST] " +
                ((tree.getRoot() == null) || (tree.getRoot().getLeft().getRight().getLeft() == null) ? "null" : tree.getRoot().getLeft().getRight().getLeft().getId()));
    }
}
