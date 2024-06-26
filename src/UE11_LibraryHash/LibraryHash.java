package UE11_LibraryHash;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryHash {
    private String[] books;

    // Konstruktor
    public LibraryHash(int size) {
        books = new String[size];
    }

    // Bücher aus einer Textdatei einlesen
    public void addBooksFromFile() {
        String line;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("books.txt"));

            while ((line = br.readLine()) != null) {
                add(line);
            }

            br.close();
        } catch (Exception | HashFullException e) {
            e.printStackTrace();
        }
    }

    // Ein Buch zur Hashtable hinzufügen(LINEAR SORTING)
    public void add(String bookTitle) throws HashFullException {
        //bookTitle.hashCode() -> can return a negative value. that is why use Math.abs:
        int baseValue = Math.abs(bookTitle.hashCode());

        //loop for the linear sorting
        for (int i = 0; i < books.length; i++) {

            //Position calculation
            int pos = (baseValue + i) % books.length;
            //is this position available?
            if (books[pos] == null) {
                books[pos] = bookTitle;
                return;
            }
        }
        // If we complete the loop, the hash table is full
        throw new HashFullException("The Hash is full.");
    }

    // Ein Buch aus der Hashtable entfernen
    public Boolean remove(String bookTitle) {
        int baseValue = Math.abs(bookTitle.hashCode());

        for (int i = 0; i < books.length; i++) {
            int pos = (baseValue+i) % books.length;
            if (books[pos] != null && books[pos].equals(bookTitle)) {
                books[pos] = null;
                return true;
            }
        }
        return false;
    }

    // Abfrage, ob ein bestimmtes Buch in der Hashtable vorhanden ist
    public Boolean isBookInStock(String bookTitle) {
        //
        int baseValue = Math.abs(bookTitle.hashCode()) % books.length;

        for (int i = 0; i < books.length; i++) {
            //Position calculation
            int pos = (baseValue + i) % books.length;
            //Check if the book is in hash
            if (books[pos] != null && books[pos].equals(bookTitle)) {
                return true;
            }
        }
        return false;
    }
}

