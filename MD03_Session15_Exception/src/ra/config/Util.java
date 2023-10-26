package ra.config;

import ra.constant.Role;

import static ra.constant.Role.ADMIN;
import static ra.constant.Role.USER;

public class Util {
    public static Role validateRoleInput(String role) {
        if (role.equals(USER.getRoleName())) {
            System.out.println();
            return USER;
        } else if (role.equals(ADMIN.getRoleName())) {
            System.out.println();
            return ADMIN;
        }
        return null;
    }

}
