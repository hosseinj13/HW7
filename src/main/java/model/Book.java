package model;

public class Book {

    private int id;
    private String title;
    private int publicationYear;
    private Author author;

    public Book() {
    }

    public Book(int id, String title, int publicationYear, Author author) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
}
