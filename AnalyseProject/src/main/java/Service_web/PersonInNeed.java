package Service_web;

public class PersonInNeed extends User {
    private String address;
    private String needs;

    // Constructeur par défaut
    public PersonInNeed() {
    }

    public PersonInNeed(String username, String email, String password, String role, String address, String needs) {
        super(username, email, password, role); // Appel au constructeur de la classe parente (User)
        this.address = address;
        this.needs = needs;
    }

}
