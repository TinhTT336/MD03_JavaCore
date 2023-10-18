package MD03_Session04_Array_Lession;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Dem So Lan Xuat Hien Cua Ky Tu Trong Chuoi";
        System.out.println(str);

        System.out.println("Nhap so ky tu muon kiem tra");
        char a = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu "+a+" la: "+count);
    }
}
