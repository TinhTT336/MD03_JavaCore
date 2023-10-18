package MD03_Session05_String_Practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten tai khoan can kiem tra");
        while(true){
            String account= scanner.nextLine();
            String regex="^[_a-z0-9]{6,}$";

            boolean isMatch= Pattern.matches(regex,account);

            if(isMatch){
                System.out.println("Tai khoan hop le - "+account);
                break;
            }else{
                System.err.println("Tai khoan khong hop le, vui long nhap lai - "+account);
            }

        }
    }
}
