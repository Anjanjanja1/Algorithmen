package UE11_LibraryHash;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String[] args) {
        LibraryHash lh = new LibraryHash(1300);
        lh.addBooksFromFile();

        System.out.println("Is book 'Doktor Schiwago' in Hash: " + lh.isBookInStock("Doktor Schiwago"));
        System.out.println("Is book '1984' in Hash: " + lh.isBookInStock("1984"));
        System.out.println("Is book 'Bohlen: Nichts als die Wahrheit' in Hash: " + lh.isBookInStock("Bohlen: Nichts als die Wahrheit"));
        System.out.println("Is book 'Roger Federer: Die Biografie' in Hash: " + lh.isBookInStock("Roger Federer: Die Biografie"));


        System.out.println("----DELETING----");
        System.out.println("Is book 'Der dritte Mann' in Hash: " + lh.isBookInStock("Der dritte Mann"));
        System.out.println("Removed?: " + lh.remove("Der dritte Mann"));
        System.out.println("Is book 'Der dritte Mann' in Hash: " + lh.isBookInStock("Der dritte Mann"));

    }
}
