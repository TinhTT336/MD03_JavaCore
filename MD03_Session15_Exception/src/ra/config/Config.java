package ra.config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static Integer validateInt() {
        int n = -1;
        try {
            n = Integer.parseInt(scanner().nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai dinh dang, moi nhap lai");
            validateInt();
        }
        return n;
    }

}
