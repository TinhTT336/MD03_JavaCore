package ra.view;

import ra.config.Config;

import static ra.config.Config.scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("**********************MENU************************");
            System.out.println("1. Quan ly lop hoc");
            System.out.println("2. Quan ly sinh vien");
            System.out.println("3. Quan ly mon hoc");
            System.out.println("4. Quan ly diem");
            System.out.println("5. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    new ClassroomManagement().menu();
                    break;
                case 2:
                    new StudentManagement().menu();
                    break;
                case 3:
                    new SubjectManagement().menu();
                    break;
                case 4:
                    new MarkManagement().menu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

}
