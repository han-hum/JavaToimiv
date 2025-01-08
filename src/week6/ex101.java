package week6;

public class ex101 {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }
}