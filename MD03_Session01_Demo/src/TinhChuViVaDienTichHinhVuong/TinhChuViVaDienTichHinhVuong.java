package TinhChuViVaDienTichHinhVuong;

import java.util.Scanner;

public class TinhChuViVaDienTichHinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai hinh chu nhat");
        int length = scanner.nextInt();

        System.out.println("Nhap chieu rong hinh chu nhat");
        int width = scanner.nextInt();
        int parameter = (length + width) * 2;
        int area = length * width;

        System.out.println("Chu vi hinh chu nhat la: " + parameter);
        System.out.println("Dien tich hinh chu nhat la: " + area);

    }
}
