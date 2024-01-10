package service;

import model.Author;
import model.Book;
import repository.BookRepository;
import repository.AuthorRepository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    private final AuthorRepository authorRepository = new AuthorRepository();


    public BookService() throws SQLException {
    }


    public void addBook(String title, int publicationYear, int authorId) throws SQLException {
        Book bookToAdd = new Book(title, publicationYear, authorId);
        bookRepository.save(bookToAdd);
        /*
        // گرفتن نویسنده با استفاده از شناسه
        Author author = authorRepository.load(authorId);
        if (author != null) {
            Book bookToAdd = new Book(title, publicationYear, authorId);
            bookRepository.save(bookToAdd);
            // افزودن کتاب به آرایه کتب نویسنده
            Book[] authorBooks = author.getBooks();
            int newSize = (authorBooks != null) ? authorBooks.length + 1 : 1;
            assert authorBooks != null;
            Book[] updatedBooks = Arrays.copyOf(authorBooks, newSize);
            updatedBooks[newSize - 1] = bookToAdd;
            author.setBooks(updatedBooks);

            // چاپ اطلاعات نویسنده و کتب مرتبط با او
            System.out.println("Author: " + author);
            System.out.println("Books:");
            for (Book book : updatedBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println("Author not found with ID: " + authorId);
        }*/

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

