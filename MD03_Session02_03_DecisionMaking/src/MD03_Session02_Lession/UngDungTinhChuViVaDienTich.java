package MD03_Session02_Lession;

import java.util.Scanner;

public class UngDungTinhChuViVaDienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("0. Thoát");

            System.out.println("Chon 1 chuc nang ban muon thuc hien");
            choice = scanner.nextInt();
            double parameter;
            double area;

            switch (choice) {
                case 1:
                    System.out.println("Nhap chieu dai hinh chu nhat");
                    double a = scanner.nextDouble();

                    System.out.println("Nhap chieu rong hinh chu nhat");
                    double b = scanner.nextDouble();

                    parameter = (a + b) * 2;
                    area = a * b;
                    System.out.println("Chu vi hinh chu nhat la: " + parameter);
                    System.out.println("Dien tich hinh chu nhat la: " + area);

                    break;
                case 2:
                    System.out.println("Nhap vao 3 canh cua tam giac muon kiem tra");
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();
                    double z = scanner.nextDouble();

                    if (x > 0 && y > 0 && z > 0 && (x + y) > z && (x + z) > y && (y + z) > x) {
                        parameter = x + y + z;
                        area = Math.sqrt(parameter/2 * (parameter/2 - x) * (parameter/2 - y) * (parameter/2 - z));
                        System.out.println("Chu vi hinh tam giac la: "+parameter);
                        System.out.println("Dien tich hinh tam giac la: "+area);
                    }
                    break;
                case 3:
                    final double PI=3.14;
                    System.out.println("Nhap ban kinh hinh tron");
                    double r= scanner.nextDouble();

                    parameter=2*PI*r;
                    area=PI*Math.pow(r,2);

                    System.out.println("Chu vi hinh tron la: "+parameter);
                    System.out.println("Dien tich hinh tron la: "+area);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("So ban lua chon khong chinh xac, vui long chon lai");
            }
        }
    }
}
