import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.*;

public class CustomerServletTest {
    @Test
    public void connectDatabase() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:sqlite:customer.sqlite");
        assertFalse(connection.isClosed());

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customers;");
        assertTrue(resultSet.next());


    }
}
