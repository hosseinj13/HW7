package repository;

import model.Author;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.jdbcConnection;

public class AuthorRepository {

    private final jdbcConnection jdbcConnection = new jdbcConnection();

    public AuthorRepository() throws SQLException {
    }


    public void save(Author author) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addAuthor = "INSERT INTO  authors(first_name, last_name, age) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addAuthor);

        preparedStatement.setString(1, author.getFirstName());
        preparedStatement.setString(2, author.getLastName());
        preparedStatement.setDate(3, (Date) author.getAge());
        int result = preparedStatement.executeUpdate();
        if (result == 1)
            System.out.println(author.getFirstName() + " " + author.getLastName() + " successfully register :)");
        else
            System.out.println("somethings is wrong :(");

    }

    public Author load(int authorId){
         return new Author();
    }
}
