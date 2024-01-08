package model;

import java.util.ArrayList;
import java.util.List;


public class ValidatorService {

	private final List<Validator> validatorList = new ArrayList<>();

    public static class Validator {
        private String username;
        private String email;
        private String password;
        private String role; // Peut être 'personInNeed', 'volunteer', 'validator',
        private int validationCount;

        // Constructeurs
        public Validator() {
            // Constructeur par défaut
        }

        public Validator(String username, String email, String password, String role, int validationCount) {
            this.username = username;
            this.email = email;
            this.password = password;
            this.role = role;
            this.validationCount = validationCount;
        }

        // Getters et Setters
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

        public int getValidationCount() {
            return validationCount;
        }

        public void setValidationCount(int validationCount) {
            this.validationCount = validationCount;
        }
    }

    public void addValidator(Validator validator) {
        validatorList.add(validator);
    }

    public List<Validator> getAllValidators() {
        return validatorList;
    }

    public Validator getValidatorByUsername(String username) {
        for (Validator validator : validatorList) {
            if (validator.getUsername().equals(username)) {
                return validator;
            }
        }
        return null;
    }

    public void deleteValidatorByUsername(String username) {
        validatorList.removeIf(validator -> validator.getUsername().equals(username));
    }
}