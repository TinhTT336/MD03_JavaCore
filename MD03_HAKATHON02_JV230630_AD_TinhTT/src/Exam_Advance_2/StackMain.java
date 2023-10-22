package Exam_Advance_2;

import java.util.*;

public class StackMain {

    private static String string;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");

            System.out.println("**************************************************************");

            System.out.println("Nhâp lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập câu muốn đảo ngược: ");
                    string = scanner.nextLine();
                    break;
                case 2:
                    reverseString();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Không có chức năng tương ứng với lựa chọn của banj");
                    break;

            }
        } while (true);
    }

    private static void reverseString() {
        Stack<String> stack = new Stack<>();
        List<String> list;
        list = Arrays.asList(string.trim().split(" "));

        for (String e : list) {
            stack.add(0, e);
        }

        System.out.println("Câu sau khi đảo ngược: ");
        for (String e : stack) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
