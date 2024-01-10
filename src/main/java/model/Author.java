package model;

import java.util.Date;
import java.util.List;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private Date age;
    private List<Book> books;

    public Author() {
    }

    public Author(int id, String firstName, String lastName, Date age, List<Book> books) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }
}
