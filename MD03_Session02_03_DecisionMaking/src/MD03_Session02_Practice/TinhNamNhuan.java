package MD03_Session02_Practice;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam can kiem tra");
        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0) {
            if (year % 100==0) {
                if (year % 400==0) {
                    System.out.println("Nam " + year + " la nam nhuan");
                } else {
                    System.out.println("Nam " + year + " khong phai la nam nhuan");
                }
            }else{
                System.out.println("Nam " + year + "la nam nhuan");
            }
        }else{
            System.out.println("Nam " + year + "  khong phai la nam nhuan");
        }
    }
}
