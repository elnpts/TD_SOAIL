package RestTest.Service;


import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InMemoryDatabase {
    private static final String DATABASE_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String DATABASE_USER = "sa";
    private static final String DATABASE_PASSWORD = "";

    public static Connection getConnection() {
        try {
            JdbcDataSource dataSource = new JdbcDataSource();
            dataSource.setURL(DATABASE_URL);
            dataSource.setUser(DATABASE_USER);
            dataSource.setPassword(DATABASE_PASSWORD);
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Error getting a database connection: " + e.getMessage());
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error closing the database connection: " + e.getMessage());
        }
    }


        public static void initDatabase() {
            Connection connection = getConnection();
            try {
                Statement statement = connection.createStatement();

                // Créez la table pour les utilisateurs (entité User)
                statement.execute("CREATE TABLE IF NOT EXISTS Users ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "username VARCHAR(255) NOT NULL,"
                    + "email VARCHAR(255) NOT NULL,"
                    + "password VARCHAR(255) NOT NULL,"
                    + "role VARCHAR(255) NOT NULL,"
                    + "address VARCHAR(255),"
                    + "needs VARCHAR(255),"
                    + "skills VARCHAR(255),"
                    + "available BOOLEAN,"
                    + "validationCount INT"
                    + ")");

                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException("Error initializing the database: " + e.getMessage());
            } finally {
                closeConnection(connection);
            }
        }
}