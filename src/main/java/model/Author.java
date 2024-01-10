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

    public Author(String firstname, String lastname, Date age) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
