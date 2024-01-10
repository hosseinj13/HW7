package model;

public class Book {

    private int id;
    private String title;
    private int publicationYear;
    private int authorId;

    public Book() {
    }

    public Book(int id) {
        this.id = id;
    }

    public Book(int id, String title, int publicationYear, int authorId) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.authorId = authorId;
    }

    public Book(String title, int publicationYear, int authorId) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getAuthor() {
        return authorId;
    }

    public void setAuthor(Author author) {
        this.authorId = authorId;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", authorId=" + authorId +
                '}';
    }
}


