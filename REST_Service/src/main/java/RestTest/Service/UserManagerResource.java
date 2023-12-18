package RestTest.Service;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

@Path("user-manager")
public class UserManagerResource {
	
    @PostConstruct
    public void initDatabase() {
        InMemoryDatabase.initDatabase();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Bonjour bienvenue sur le projet d'Ellen & Elie";
    }

    @POST
    @Path("/add-people-in-need")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String addPeopleInNeed(
            @FormParam("username") String username,
            @FormParam("email") String email,
            @FormParam("password") String password,
            @FormParam("role") String role,
            @FormParam("address") String address,
            @FormParam("needs") String needs
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

    @POST
    @Path("/add-volunteers")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String addVolunteers(
            @FormParam("username") String username,
            @FormParam("email") String email,
            @FormParam("password") String password,
            @FormParam("role") String role,
            @FormParam("skills") String skills,
            @FormParam("available") boolean available
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

    @POST
    @Path("/add-validators")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String addValidators(
            @FormParam("username") String username,
            @FormParam("email") String email,
            @FormParam("password") String password,
            @FormParam("role") String role,
            @FormParam("validationCount") int validationCount
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

    @GET
    @Path("/getUsers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        try {
            Connection connection = InMemoryDatabase.getConnection();
            String selectQuery = "SELECT * FROM Users";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> userList = new ArrayList<>();

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