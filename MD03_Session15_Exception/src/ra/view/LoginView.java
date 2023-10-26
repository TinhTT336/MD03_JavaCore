package ra.view;

import ra.config.Config;
import ra.model.User;
import ra.service.impl.UserServiceIMPL;

public class LoginView {
    private UserServiceIMPL userService;

    public LoginView() {
        userService = new UserServiceIMPL();
    }

    public User showLogin() {
        System.out.println("Thuc hien dang nhap");
        System.out.println("Nhap username: ");
        String username = Config.scanner().nextLine();
        System.out.println("Nhap password: ");
        String password = Config.scanner().nextLine();


        User userLogin = userService.login(username, password);
        if (userLogin != null) {
            System.out.println("Dang nhap thanh cong!");
            return userLogin;

        } else {
            System.out.println("Dang nhap that bai! Hay thu lai");
            return null;
        }
    }
}
