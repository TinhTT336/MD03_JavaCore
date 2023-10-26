package config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void validateInteger() {
        int n;
        try {
            n = Integer.parseInt(scanner().nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng, vui lòng nhập lại");
            validateInteger();
        }
    }

    public static void validateBoolean() {
        boolean b;
        try {
            b = Boolean.parseBoolean(scanner().nextLine());
        } catch (Exception e) {
            System.out.println("Sai định dạng, vui lòng nhập lại");
            validateBoolean();
        }
    }

    public static String validateEmptyString() {
        String input= scanner().nextLine();
        if (input.trim().isEmpty()) {
            System.out.println("Độ dài nhập vào cần chứa ít nhất 1 ký tự");
            input = validateEmptyString();
        }

        return input;
    }
}
