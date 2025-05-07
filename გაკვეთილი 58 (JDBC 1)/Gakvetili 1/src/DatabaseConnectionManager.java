import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private final String URL;
    private final String USERNAME;
    private final String PASSWORD;

    public DatabaseConnectionManager(
            String URL,
            String USERNAME,
            String PASSWORD
    ) {
        this.URL = URL;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection(
                        URL, USERNAME, PASSWORD
                );
    }
}
