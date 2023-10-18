package UngDungChuyenDoiTienTe;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tien USD muon chuyen doi");
        usd = scanner.nextInt();
        int total = usd * rate;
        System.out.println("So tien chuyen doi sang VND la: " + total);
    }
}
