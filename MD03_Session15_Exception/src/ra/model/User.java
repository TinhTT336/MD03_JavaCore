package ra.model;

import ra.constant.Role;
import ra.constant.Status;

public class User extends Entity<Integer>{
    private String username;
    private String password;
    private Role role;
    private Status status;


    //demo enum
//    public static void main(String[] args) {
//        User user=new User();
//        user.role=Role.USER;
//        System.out.println(user.role.getRoleName());
//    }
}
