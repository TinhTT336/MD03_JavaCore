package MD03_Session03_Practice;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so muon kiem tra");
        int a= scanner.nextInt();

        if(a<2){
            System.out.println(a+" khong phai so nguyen to");
        }else{
            boolean isPrime=true;
            int i=2;
            while(i<a){
                if(a%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
            if(isPrime){
                System.out.println(a+" la so nguyen to");
            }else{
                System.out.println(a+" khong phai so nguyen to");
            }
        }
    }
}
