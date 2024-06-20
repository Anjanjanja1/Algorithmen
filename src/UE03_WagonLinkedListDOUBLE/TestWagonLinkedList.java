package UE03_WagonLinkedListDOUBLE;

public class TestWagonLinkedList {
    public static void main(String[] args) {
        WagonLinkedList wagonLinkedList = new WagonLinkedList();

        wagonLinkedList.printList();

        // Hinzufügen
        wagonLinkedList.insertWagonAtFirstPos("Speisewagen 4712");
        wagonLinkedList.insertWagonAtFirstPos("Schlafabteil 7");
        wagonLinkedList.insertWagonAtFirstPos("Güterwagon 39");
        wagonLinkedList.printList();
        System.out.println("First: " + (wagonLinkedList.getFirst() != null ? wagonLinkedList.getFirst().getWagonId() : "null"));
        System.out.println("Last: " + (wagonLinkedList.getLast() != null ? wagonLinkedList.getLast().getWagonId() : "null"));

        // Löschen
        System.out.println("----DELETING 1----");
        wagonLinkedList.removeWagonFromLastPos();
        System.out.println("First: " + (wagonLinkedList.getFirst() != null ? wagonLinkedList.getFirst().getWagonId() : "null"));
        System.out.println("Last: " + (wagonLinkedList.getLast() != null ? wagonLinkedList.getLast().getWagonId() : "null"));

        // Noch mehr löschen
        System.out.println("----DELETING MORE----");
        wagonLinkedList.removeWagonFromLastPos();
        wagonLinkedList.removeWagonFromLastPos();
        wagonLinkedList.printList();
        System.out.println("First: " + (wagonLinkedList.getFirst() != null ? wagonLinkedList.getFirst().getWagonId() : "null"));
        System.out.println("Last: " + (wagonLinkedList.getLast() != null ? wagonLinkedList.getLast().getWagonId() : "null"));
    }
}
