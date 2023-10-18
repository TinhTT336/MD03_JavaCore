package MD03_Session03_Practice;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so tien cho vay");
        int money = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap lai suat vay theo nam");
        double rate = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap so thang cho vay");
        int month = Integer.parseInt(scanner.nextLine());
        double interest=0;

        for (int i = 0; i < month; i++) {
            interest += (money * (rate / 100) / 12 * month);
        }
        System.out.println("Tien lai phai tra la "+interest);
    }
}
