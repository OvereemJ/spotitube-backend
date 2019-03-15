package han.nl.dea.spotitubebackend.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/spotitube?serverTimezone=UTC", "spotitube", "spotitube");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
