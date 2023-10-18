package MD03_Session05_String_Practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap email can kiem tra");
        while (true) {
            String email = scanner.nextLine();
            String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

            boolean isMatch= Pattern.matches(regex, email);
            if(isMatch){
                System.out.println("Email hop le");
                break;
            }else{
                System.err.println("Email khong dung dinh dang, vui long nhap lai");
            }
        }
    }
}
