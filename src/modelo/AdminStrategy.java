package modelo;

import java.io.Serializable;

public class AdminStrategy implements Strategy, Serializable {
    private String username;
    private String password;

    public AdminStrategy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean verifyUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}