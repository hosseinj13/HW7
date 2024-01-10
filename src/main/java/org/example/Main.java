package org.example;

import repository.BookRepository;
import service.AuthorService;
import service.BookService;
import model.*;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, ParseException {

        AuthorService authorService = new AuthorService();
       // authorService.register("javid", "javadi", Date.valueOf(LocalDate.of(1850, 2, 14)));
        //authorService.findAuthor(19);

        BookService bookService = new BookService();
        bookService.addBook("The Great Gatsby", 1925, 7);
       // bookService.findBook(6);
       // bookService.deleteBook(6);

//        Author author = new Author("Ali", "Shariati", Date.valueOf(LocalDate.of(1850, 2, 14)));
//        authorService.register(author.getFirstName(), author.getLastName(), author.getAge());


       /* Book book1 = new Book("Book1", 2022, author.getId());
        Book book2 = new Book("Book2", 2023, author.getId());
        bookService.addBook(book1.getTitle(), book1.getPublicationYear(), book1.getAuthor());
        bookService.addBook(book2.getTitle(), book2.getPublicationYear(), book2.getAuthor());*/

    }
}