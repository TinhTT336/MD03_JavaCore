package ra.lession.advance.config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }

    public static int getValidateInt(){
        int numberInt;
//        System.out.println("Nhap lua chon");
        while(true){
            String s=scanner().nextLine();
            if(s.matches("\\d+")){
                numberInt=Integer.parseInt(s);
                break;
            }
            System.out.println("Dinh dang khong dung, moi nhap lai");
        }
        return numberInt;
    }





}
