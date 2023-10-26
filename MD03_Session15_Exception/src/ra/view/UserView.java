package ra.view;

import ra.config.Config;
import ra.config.Util;
import ra.constant.Role;
import ra.constant.Status;
import ra.model.User;
import ra.service.impl.UserServiceIMPL;

import static ra.constant.Role.*;

public class UserView {
    private UserServiceIMPL userService;

    public UserView() {
        userService = new UserServiceIMPL();
    }

    public void registerUser() {
        User user = new User();
        System.out.println("Hay nhap vao thong tin User ");
        System.out.println("Nhap username:");
        user.setUsername(Config.scanner().nextLine());

        System.out.println("Nhap mat khau");
        user.setPassword(Config.scanner().nextLine());

        System.out.println("Nhap role ban muon dang ky (ADMIN)");
        Role role = Util.validateRoleInput(Config.scanner().nextLine());
        while (role == null) {
            System.out.println("Nhap sai, role chi co the la ADMIN hoac USER");
            role = Util.validateRoleInput(Config.scanner().nextLine());
        }
        user.setStatus(Status.ACTIVE);
//        user.setId(userService.get);
        userService.save(user);
        System.out.println("Dang ky thanh cong!");
    }

    public void showCurrentUserInfo(){

    }


}
