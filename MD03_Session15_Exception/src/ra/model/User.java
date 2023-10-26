package ra.model;

import ra.constant.Role;
import ra.constant.Status;

public class User extends Entity<Integer>{
    private String username;
    private String password;
    private Role role;
    private Status status;

    public User() {
    }

    public User(String username, String password, Role role, Status status) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public User(Integer integer, String username, String password, Role role, Status status) {
        super(integer);
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

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
    //demo enum
//    public static void main(String[] args) {
//        User user=new User();
//        user.role=Role.USER;
//        System.out.println(user.role.getRoleName());
//    }
}
