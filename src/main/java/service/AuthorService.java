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
}
