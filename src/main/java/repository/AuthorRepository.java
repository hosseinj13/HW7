package repository;

import model.Author;
import java.sql.*;
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

    public Author load(int authorId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String findUser = "SELECT * FROM authors WHERE author_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(findUser);
        preparedStatement.setInt(1, authorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("author_id");
            String firstname = resultSet.getString("first_name");
            String lastname = resultSet.getString("last_name");
            Date age = resultSet.getDate("age");
            Author author = new Author(firstname, lastname, age);
            return author;
        } else
            return null;
    }
}
