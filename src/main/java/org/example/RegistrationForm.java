package org.example;

public class RegistrationForm {
    private String username;
    private String email;
    private String password;

    public RegistrationForm(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isValidUsername() {
        return username != null && username.length() >= 10;
    }

    public boolean isValidEmail() {
        return email != null && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public boolean isValidPassword() {
        return password != null && password.length() >= 8;
    }

}


