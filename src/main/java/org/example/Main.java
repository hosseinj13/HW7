package org.example;

import repository.BookRepository;
import service.AuthorService;
import service.BookService;
import model.*;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws SQLException, ParseException {

        AuthorService authorService = new AuthorService();
        authorService.register("hasan", "javadi", Date.valueOf(LocalDate.of(1990, 1, 24)));
        //authorService.findAuthor(19);


        BookService bookService = new BookService();
        bookService.addBook("ketab", 1300, 1);
        //bookService.findBook(6);
        //bookService.deleteBook(6);


    }
}