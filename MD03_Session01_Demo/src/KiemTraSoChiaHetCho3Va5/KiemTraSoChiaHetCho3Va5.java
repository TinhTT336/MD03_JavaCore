package KiemTraSoChiaHetCho3Va5;

import java.util.Scanner;

public class KiemTraSoChiaHetCho3Va5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra");
        int a = scanner.nextInt();
        String str;

        if (a % 3 == 0 && a % 5 == 0) {
            str = "Chia hết cho cả 3 và 5";
        } else if (a % 3 == 0) {
            str = "Chỉ chia hết cho 3";
        } else if (a % 5 == 0) {
            str = "Chỉ chia hết cho 5";
        } else {
            str = "Không chia hết cho 3 , cũng không chia hết cho 5";
        }
        System.out.println("So " + a + " " + str);


    }
}
