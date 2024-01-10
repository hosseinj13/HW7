package repository;

import model.Author;
import model.Book;
import org.example.jdbcConnection;
import java.sql.*;


public class BookRepository {

    private final org.example.jdbcConnection jdbcConnection = new jdbcConnection();

    public BookRepository() throws SQLException {
    }


    public void save(Book book) throws SQLException {

        Connection connection = jdbcConnection.getConnection();

        String addBook = "INSERT INTO  books(title, publication_year, author_id) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addBook);

        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setInt(2, book.getPublicationYear());
        preparedStatement.setInt(3, book.getAuthor());
        int result = preparedStatement.executeUpdate();
        if (result == 1)
            System.out.println(book.getTitle() + " successfully add :)");
        else
            System.out.println("somethings is wrong :(");
    }

    public Book load(int bookId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String findBook = "SELECT * FROM books WHERE book_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(findBook);
        preparedStatement.setInt(1, bookId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("book_id");
            String firstName = resultSet.getString("title");
            int publicationYear = resultSet.getInt("publication_year");
            int authorId = resultSet.getInt("author_id");
            Book book = new Book(firstName, publicationYear, authorId);
            return book;
        } else
            return null;
    }

    public void delete(Book bookId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String deleteBook = "DELETE FROM books WHERE book_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteBook);
        preparedStatement.setInt(1, bookId.getId());

        int result = preparedStatement.executeUpdate();
        if (result == 1)
            System.out.println("Book with ID " + bookId.getId() + " successfully deleted :)");
        else
            System.out.println("Book with ID " + bookId.getId() + " not found or something is wrong :(");
    }

}
