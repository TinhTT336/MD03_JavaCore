package MD03_Session05_String_Lession;

import java.util.Scanner;

public class PhuongThucEquals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap vao chuoi thu 1");
            String string1 = scanner.nextLine();

            System.out.println("Nhap vao chuoi thu 2");
            String string2 = scanner.nextLine();

//            //cach 1: su dung phuong thuc equals
//            boolean check = string1.equals(string2);
//            if (check) {
//                System.out.println("2 chuoi giong nhau");
//                break;
//            } else {
//                System.out.println("2 chuoi khong giong nhau");
//            }

            //cach 2: xay dung phuong thuc
            if (string1 == string2) {
                System.out.println("2 chuoi giong nhau");
                break;
            } else {
                System.out.println("2 chuoi khong giong nhau");
            }
        }
    }
}
