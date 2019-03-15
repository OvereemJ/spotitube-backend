package han.nl.dea.spotitubebackend.persistence;

import han.nl.dea.spotitubebackend.dto.UserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public UserDTO getUser(String username, String password){
        UserDTO foundUser = null;
        try
            (
                    Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM account where user = ? AND password = ?")

            ){
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                foundUser = new UserDTO();
                foundUser.setUsername(resultSet.getString("user"));
                foundUser.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foundUser;
    }
}
