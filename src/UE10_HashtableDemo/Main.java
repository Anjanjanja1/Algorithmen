package UE10_HashtableDemo;

public class Main {
    public static void main(String[] args) {
        CitizenHash ch = new CitizenHash(10000);
        ch.add(376401928, "Thomas Hoblin");
        ch.add(192837640, "Anita Balin");

        ch.printAll(ch.citizens);

        String foundName = ch.search(192837640);
        System.out.println("Found name: " + foundName);

    }
}
