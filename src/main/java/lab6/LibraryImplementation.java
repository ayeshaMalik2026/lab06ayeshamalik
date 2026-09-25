package lab6;

import java.util.ArrayList;
import java.util.List;

public class LibraryImplementation implements LibrarySystem {

    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(int bookId) {

        Book book = searchBook(bookId);

        if (book != null) {
            books.remove(book);
        }
    }

    @Override
    public Book searchBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    @Override
    public void issueBook(int bookId) {

        Book book = searchBook(bookId);

        if (book != null && !book.isIssued()) {

            book.setIssued(true);

            System.out.println("Book issued successfully.");
        }
    }

    @Override
    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book != null && book.isIssued()) {

            book.setIssued(false);

            System.out.println("Book returned successfully.");
        }
    }
}
