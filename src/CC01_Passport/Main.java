package CC01_Passport;

public class Main {
    public static void main(String[] args) {
        LinkedList waitingList = new LinkedList();

        waitingList.addNewPersonAtLastPos("Mayer");
        System.out.println("1) First: [SOLL] Mayer, [IST] " + (waitingList.getFirst() == null ? "null" : waitingList.getFirst().getLastName()));
        System.out.println("1) Last: [SOLL] Mayer, [IST] " + (waitingList.getLast() == null ? "null" : waitingList.getLast().getLastName()));

        waitingList.addNewPersonAtLastPos("Huber");
        waitingList.addNewPersonAtLastPos("Wagner");
        waitingList.addNewPersonAtLastPos("Pichler");
        System.out.println("2) First: [SOLL] Mayer, [IST] " + (waitingList.getLast() == null ? "null" : waitingList.getFirst().getLastName()));
        System.out.println("2) Last: [SOLL] Pichler, [IST] " + (waitingList.getLast() == null ? "null" : waitingList.getLast().getLastName()));
    }
}
