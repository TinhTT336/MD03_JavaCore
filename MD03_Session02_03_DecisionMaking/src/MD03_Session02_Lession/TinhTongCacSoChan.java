package MD03_Session02_Lession;

import java.util.Scanner;

public class TinhTongCacSoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so chan dau day");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap vao so chan cuoi day");
        int b = Integer.parseInt(scanner.nextLine());

        int total = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Tong cac so chan cua day so la " + total);

    }
}
