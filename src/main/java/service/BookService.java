package service;

import model.Author;
import model.Book;
import repository.BookRepository;
import java.sql.SQLException;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    public BookService() throws SQLException {
    }


    public void addBook(String title, int publicationYear, int authorId) throws SQLException {
        Book book = new Book(title, publicationYear, authorId);
        bookRepository.save(book);
    }


    public void findBook(int bookId) throws SQLException {
        Book book = bookRepository.load(bookId);
        if (book != null)
            System.out.println("found Book " + bookId);
        else
            System.out.println("not found Book " + bookId);
    }

    public void deleteBook(int bookId) throws SQLException {
        Book book = new Book(bookId);
        bookRepository.delete(book);
    }
}

