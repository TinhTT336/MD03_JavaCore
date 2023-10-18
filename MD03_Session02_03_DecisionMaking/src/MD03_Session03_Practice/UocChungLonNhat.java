package MD03_Session03_Practice;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a");
        int a = scanner.nextInt();
        a = Math.abs(a);

        System.out.println("Nhap so b");
        int b = scanner.nextInt();
        b = Math.abs(b);
        if(a==0||b==0){
            System.out.println("Khong co uoc chung lon nhat");
        }
        while(a!=b){
            if(a>b){
                a=a-b;
                System.out.println("a = "+a);
            }else{
                b=b-a;
                System.out.println("b= "+b);
            }
        }
        System.out.println("Uoc chung lon nhat cua 2 so la: "+a);

    }
}
