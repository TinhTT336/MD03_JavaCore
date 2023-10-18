package MD03_Session02_Practice;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
//        Viết một chương trình tính số ngày trong tháng của một tháng cho trước. Trong một
//        năm, tháng 2 có thể có 28 hoặc 29 ngày, các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày, các
//        tháng còn lại có 30 ngày.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang ban muon kiem tra");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case 2:
                System.out.println("Thang 2 co 28 hoac 29 ngay");
                break;
            default:
                System.out.println("Thang ban nhap khong hop le");

        }
    }
}
