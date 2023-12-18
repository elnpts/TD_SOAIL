package Service_web;

public class Volunteer extends User {
    private String skills;
    private boolean available;

 // Constructeur par défault 
    public Volunteer() {

    }
    
    public Volunteer(String username, String email, String password, String role, String skills, boolean available) {
        super(username, email, password, role);
        this.skills = skills;
        this.available = available;
    }

}
