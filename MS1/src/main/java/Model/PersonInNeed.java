package Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class PersonInNeed {

    private Long id;
    private String address;
    private String needs;
    private String username;
    private String email;
    private String password;
    private String role;

    // Constructeur par défaut
    public PersonInNeed() {
    }


    public PersonInNeed(String username, String email, String password, String role, String address, String needs) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.needs = needs;
    }

    // Getters et Setters pour id, address et needs (JPA nécessite ces méthodes)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}