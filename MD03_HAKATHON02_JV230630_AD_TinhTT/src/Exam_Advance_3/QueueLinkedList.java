package Exam_Advance_3;

import java.util.*;

public class QueueLinkedList {
    static Scanner scanner = new Scanner(System.in);
    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");

            System.out.println("**************************************************************");

            System.out.println("Nhâp lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addParent();
                    break;
                case 2:
                    deletefirstParent();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Không có chức năng tương ứng với lựa chọn của banj");
                    break;

            }
        } while (true);
    }

    private static void deletefirstParent() {
        if (!queue.isEmpty()) {
            System.out.println("Phụ huynh đầu tiên trong danh sách: " + queue.poll());
        } else {
            System.out.println("Không có phụ huynh nào");
        }
    }

    private static void addParent() {
        System.out.println("Nhập tên phụ huynh: ");
        String parentName = scanner.nextLine();
        queue.add(parentName);

        System.out.println("Danh sách tất cả phụ huynh: " + queue);
    }
}
