package lab6;

public interface LibrarySystem {

    void addBook(Book book);

    void removeBook(int bookId);

    Book searchBook(int bookId);

    void issueBook(int bookId);

    void returnBook(int bookId);
}
