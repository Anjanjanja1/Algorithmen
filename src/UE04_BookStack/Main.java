package UE04_BookStack;

public class Main {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();

        bookStack.push("Nichts als die Wahrheit");
        bookStack.push("Die Physiker");
        bookStack.push("1984");

//        Node firstBook = bookStack.getTop();
//        System.out.println(firstBook.getBookTitle());
//
//        Node secondBook = bookStack.getTop().getNext();
//        System.out.println(secondBook.getBookTitle());
//
//        Node thirdBook = bookStack.getTop().getNext().getNext();
//        System.out.println(thirdBook.getBookTitle());

        bookStack.printAllBooks();


    }
}
