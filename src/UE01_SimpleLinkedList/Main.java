package UE01_SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        //make an instance of the class LinkedList
        System.out.println("LIST 1");
        LinkedList list = new LinkedList();
//---------------
        list.addNodeOnFirstPosition("Mango");
        list.addNodeOnLastPosition("Eis");
        list.addNodeOnLastPosition("Joghurt");
//---------------
        //made toString so I can see the groceries...
        System.out.println(list.toString());
        System.out.println("----------");
//---------------
        //Prof's way to display it:
        System.out.println("First: " + list.getFirst().getGroceries());
        System.out.println("Last: " + list.getLast().getGroceries());

//-------------------------------
//we made a new method and switched the mango and eis places:
        System.out.println("LIST 2");
        LinkedList list2 = new LinkedList();
        list2.addNodeOnFirstPosition("Mango");
        list2.addNodeOnFirstPosition("Eis");
//---------------
        System.out.println("First: " + list2.getFirst().getGroceries());
        System.out.println("Last: " + list2.getLast().getGroceries());

//-------------------------------
        System.out.println("DELETING");

        list.deleteACertainIndex(0);
        System.out.println(list.toString());
    }
}
