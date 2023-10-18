package MD03_Session02_Lession;

import java.util.Scanner;

public class TaoMenuChucNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int choice=-1;
       while(choice!=0){
           System.out.println("Kiểm tra tính chẵn lẻ của 1 số (1)");
           System.out.println("Kiểm tra số nguyên tố (2)");
           System.out.println("Kiểm tra một số có chia hết cho 3 không (3)");
           System.out.println("Thoat (0)");

           System.out.println("Nhap so muon kiem tra");
           int a= scanner.nextInt();

           System.out.println("Lua chon chuc nang de su dung");
            choice= scanner.nextInt();

           switch (choice) {
               case 1:
                   System.out.println("Kiểm tra tính chẵn lẻ của 1 số");

                   if(a%2==0){
                       System.out.println(a+" la so chan");
                   }else{
                       System.out.println(a+" la so le");
                   }
                   break;
               case 2:
                   System.out.println("Kiểm tra số nguyên tố");
                   boolean isPrime=true;
                   if(a<2){
                       isPrime=false;
                   }else if(a==2){
                       isPrime=true;
                   }else{
                       for(int i=3;i<a;i++){
                           if(a%i==0){
                               isPrime=false;
                           }
                       }
                   }
                   if(isPrime){
                       System.out.println(a +" la so nguyen to");
                   }else{
                       System.out.println(a +" khong phai la so nguyen to");
                   }
                   break;
               case 3:
                   System.out.println("Kiểm tra một số có chia hết cho 3 không");
                   if(a%3==0){
                       System.out.println(a +" chia het cho 3");
                   }
                   break;
               case 0:
                   System.exit(0);
               default:
                   System.out.println("Lua chon khong chinh xac, vui long nhap lai");
                   break;
           }
       }
    }
}
