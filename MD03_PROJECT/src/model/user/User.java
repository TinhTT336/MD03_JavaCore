package model.user;

import constant.Role;
import constant.Status;
import model.Entity;

public class User extends Entity<Integer> {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private Role role;
    private Status status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
