package LoggingFramework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseFlusher implements LogFlusher {

    private final String jdbcUrl;
    private final String userName;
    private final String password;

    /**
     * jdbc:<protocol>:<subprotocol>:<location> 
     * protocol: Specifies the database protocol or driver used to connect. Common protocols include: mysql (MySQL),oracle (Oracle), 
     * postgresql (PostgreSQL)
     * subprotocol: Optional and protocol-specific. It may provide additional information about the database or connection properties.
     * location: Specifies the database server's hostname, port number, and database name
     * Example MySQL: jdbc:mysql://localhost:3306/mydatabase
     */

    DatabaseFlusher(String jdbcUrl, String userName, String password) {
        this.jdbcUrl = jdbcUrl;
        this.userName = userName;
        this.password = password;

    }

    @Override
    public void flushLog(LoggerMessage loggerMessage) {
      try{
        Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement =  connection.prepareStatement("INSERT INTO logs (level, message, timestamp) VALUES (?, ?, ?)") {
            statement.setString(1, loggerMessage.getLogLevel().toString());
        }
        statement.executeUpdate();

      } catch(SQLException e) {
        System.err.println("Not able to make connection" + e.getMessage());
      }
    }

}
