package service;

import model.Author;
import repository.AuthorRepository;

import java.sql.SQLException;
import java.util.Date;

public class AuthorService {

    private final AuthorRepository authorRepository = new AuthorRepository();

    public AuthorService() throws SQLException {
    }


    public void register(String firstname, String lastname, Date age) throws SQLException {
        Author author = new Author(firstname, lastname, age);
        authorRepository.save(author);

    }

    public void findAuthor(int authorId) throws SQLException {
        Author author = authorRepository.load(authorId);
        if (author != null)
            System.out.println("found Author " + authorId);
        else
            System.out.println("not found Author " + authorId);
    }
}
