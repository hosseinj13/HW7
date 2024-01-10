package service;

import model.Author;
import model.Book;
import repository.BookRepository;
import repository.AuthorRepository;
import java.sql.SQLException;
import java.util.List;

public class BookService {

    private final BookRepository bookRepository = new BookRepository();

    private final AuthorRepository authorRepository = new AuthorRepository();


    public BookService() throws SQLException {
    }


    public void addBook(String title, int publicationYear, int authorId) throws SQLException {

        Book book = new Book(title, publicationYear, authorId);
        bookRepository.save(book);
        /*
        // گرفتن نویسنده با استفاده از شناسه
        Author author = authorRepository.load(authorId);
        // بررسی اینکه نویسنده واقعی وجود دارد یا خیر
        if (author != null) {
            Book book = new Book(title, publicationYear, authorId);
            bookRepository.save(book);
            // افزودن کتاب به لیست کتب نویسنده
            List<Book> authorBooks = author.getBooks();
            authorBooks.add(book);
            // چاپ اطلاعات نویسنده و کتب مرتبط با او
            System.out.println("Author: " + author);
            System.out.println("Books:");
            for (Book authorBook : authorBooks) {
                System.out.println(authorBook);
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

