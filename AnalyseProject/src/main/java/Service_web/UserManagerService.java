package Service_web;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




@WebService(serviceName = "user-manager")
public class UserManagerService {
	
	
    @WebMethod(operationName = "compare")
    public int analyser(@WebParam(name ="chain") String chaine){
        return chaine.length();
 
    }
    
    @WebMethod(operationName = "add-people-in-need")
    public String addPeopleInNeed(
        @WebParam(name = "username") String username,
        @WebParam(name = "email") String email,
        @WebParam(name = "password") String password,
        @WebParam(name = "role") String role,
        @WebParam(name = "address") String address,
        @WebParam(name = "needs") String needs
    ) {
        try {
            Connection connection = InMemoryDatabase.getConnection();
            String insertQuery = "INSERT INTO Users (username, email, password, role, address, needs) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, role);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, needs);
            preparedStatement.executeUpdate();
            InMemoryDatabase.closeConnection(connection);
            return "Person in need added successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error adding person in need";
        }
    }

    @WebMethod(operationName = "add-volunteers")
    public String addVolunteers(
        @WebParam(name = "username") String username,
        @WebParam(name = "email") String email,
        @WebParam(name = "password") String password,
        @WebParam(name = "role") String role,
        @WebParam(name = "skills") String skills,
        @WebParam(name = "available") boolean available
    ) {

        try {
            Connection connection = InMemoryDatabase.getConnection();
            String insertQuery = "INSERT INTO Users (username, email, password, role, skills, available) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, role);
            preparedStatement.setString(5, skills);
            preparedStatement.setBoolean(6, available);
            preparedStatement.executeUpdate();
            InMemoryDatabase.closeConnection(connection);
            return "Volunteer added successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error adding volunteer";
        }
    	
    }

    @WebMethod(operationName = "add-validators")
    public String addValidators(
        @WebParam(name = "username") String username,
        @WebParam(name = "email") String email,
        @WebParam(name = "password") String password,
        @WebParam(name = "role") String role,
        @WebParam(name = "validationCount") int validationCount
    ) {
        try {
            Connection connection = InMemoryDatabase.getConnection();
            String insertQuery = "INSERT INTO Users (username, email, password, role, validationCount) " +
                    "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, role);
            preparedStatement.setInt(5, validationCount);
            preparedStatement.executeUpdate();
            InMemoryDatabase.closeConnection(connection);
            return "Validator added successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error adding validator";
        }
    }
    
    @WebMethod(operationName = "getUsers")
    public List<User> getUsers() {
        try {
            Connection connection = InMemoryDatabase.getConnection();
            String selectQuery = "SELECT * FROM Users";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> userList = new ArrayList<User>();

            while (resultSet.next()) {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                // Ajoutez d'autres attributs ici

                userList.add(user);
            }

            InMemoryDatabase.closeConnection(connection);
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
