package RestTest.Service;

public class Validator extends User {
    private int validationCount;

    // Constructeur par défaut
    public Validator() {
    }

    public Validator(String username, String email, String password, String role, int validationCount) {
        super(username, email, password, role); 
        this.validationCount = validationCount;
    }


}
