package lab6;

public class LibraryTest {

    public static void main(String[] args) {

        LibrarySystem library = new LibraryImplementation();

        Book book1 = new Book(
                1,
                "Java Programming",
                "James Gosling"
        );

        Book book2 = new Book(
                2,
                "Software Engineering",
                "Ian Sommerville"
        );

        // Add books
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books added successfully.");

        // Search book
        Book found = library.searchBook(1);

        if (found != null) {
            System.out.println("Book found: " + found);
        }

        // Issue book
        library.issueBook(1);

        // Return book
        library.returnBook(1);

        // Remove book
        library.removeBook(2);

        System.out.println("Library test completed.");
    }
}
