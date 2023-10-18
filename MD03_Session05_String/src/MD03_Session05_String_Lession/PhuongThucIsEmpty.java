package MD03_Session05_String_Lession;

import java.util.Scanner;

public class PhuongThucIsEmpty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra");
       while(true){
           String str= scanner.nextLine();
           //cach 1: dung phuong thuc isEmpty
           System.out.println(str.isEmpty());
           if(str.isEmpty()){
               System.out.println("Chuoi rong");
           }else{
               System.out.println("Chuoi co ky tu");
           }

        //cach 2: xay dung phuong thuc isEmptyString
//           isEmptyString(str);
       }

    }
    public static void isEmptyString(String string){
        String strin="";
        if(string.equals(strin)){
            System.out.println("Chuoi rong");
        }else{
            System.out.println("Chuoi co ky tu");
        }
    }

}
