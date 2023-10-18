package ra.config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static int getValidateInteger(){
        int integerN;
        System.out.println("Moi lua chon: ");
        while (true){
            String s = scanner().nextLine();
            if (s.matches("\\d+")){
                integerN = Integer.parseInt(s);
                break;
            }
            System.out.println("Dinh dang khong dung, moi nhhap lai: ");
        }
        return integerN;
    }
}
