package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {

    private final Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hw7", "postgres","h9311240246N");

    public jdbcConnection() throws SQLException {
    }

    public Connection getConnection(){
        return connection;
    }
}
