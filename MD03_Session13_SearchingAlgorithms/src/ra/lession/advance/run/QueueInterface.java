package ra.lession.advance.run;

import ra.lession.advance.config.Config;

import java.util.PriorityQueue;
import java.util.Stack;

public class QueueInterface {
    static String string;
    static PriorityQueue<String> parent = new PriorityQueue<>();

    public static void main(String[] args) {
        do {
            int choice;
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("Nhap lua chon");
            choice = Config.getValidateInt();

            switch (choice) {
                case 1:
                    addParent();
                    break;
                case 2:
                    pollParent();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang tuong ung voi so vua nhap");
                    break;

            }

        } while (true);

    }

    private static void pollParent() {
        System.out.println("Ten phu huynh dang ky dau tien: "+parent.peek());
        parent.poll();
        System.out.println("Danh sach phu huynh sau khi xoa phu huynh dang ky dau tien: "+parent);
    }

    private static void addParent() {
        System.out.println("Nhap ten phu huynh");
        string = Config.scanner().nextLine();
        parent.add(string);
        System.out.println("Danh sach cac phu huynh dang ky: "+parent);
    }
}
