package ra.lession.advance.run;

import ra.lession.advance.config.Config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReversedStack {
    public static void main(String[] args) {
        //Sử dụng cấu trúc dữ liệu Stack để đảo ngược lại các từ trong một câu. Thực hiện các chức năng
        //theo menu sau:
        //****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************
        //1. Nhập câu
        //2. Đảo ngược câu
        //3. Thoát
        //Chọn 1 thực hiện nhập một câu từ bàn phím (Ví dụ: “Peace and Quiet”). Chọn 2 thực hiện đảo
        //ngược câu và in ra (Ví dụ: “Quiet and Peace”) Chọn 3: Kết thúc chương trình
        String str = null;

        do {
            int choice;
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");

            System.out.println("*******************************");
            System.out.println("Nhap lua chon");
            choice = Config.getValidateInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap cau");
                    str = Config.scanner().nextLine();
                    break;
                case 2:
                    reverseString(str);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang voi so vua nhap");
                    break;
            }
        } while (true);
    }

    private static void reverseString(String str) {
        Stack<String> stack = new Stack<>();
        List<String> listStr = new ArrayList<>();
        listStr = Arrays.asList(str.trim().split(" "));
//cach 1:
//        for (String string : listStr) {
//            stack.add(0, string);
//        }

//        System.out.println("Chuoi sau dao nguoc: ");
//        for (String str2 : stack) {
//            System.out.print(str2 + " ");
//        }
//        System.out.println();

        //cach 2:
        System.out.println("Chuoi sau dao nguoc: ");
        for (int i = listStr.size()-1; i >=0 ; i--) {
            System.out.print(listStr.get(i)+ " ");
        }
        System.out.println();
    }
}
