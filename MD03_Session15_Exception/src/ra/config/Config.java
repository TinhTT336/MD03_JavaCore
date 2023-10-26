package ra.config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Config<T> {
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

    public static Boolean validateBoolean() {
        boolean choice = false;
        try {
            choice = Boolean.parseBoolean(scanner().nextLine());
        } catch (Exception e) {
            System.out.println("Sai dinh dang, moi nhap lai");
            validateBoolean();
        }
        return choice;
    }


}
