package MD03_Session05_String_Lession;

import java.util.Scanner;

public class PhuongThucReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap chuoi muon kiem tra");
            String str = scanner.nextLine();

//            //cach 1: su dung StringBuffer
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println("Chuoi sau dao nguoc la: "+sb);
        }

    }


}
