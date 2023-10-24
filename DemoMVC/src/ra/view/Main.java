package ra.view;

import ra.config.Config;

import static ra.config.Config.scanner;

public class Main {
    public static void main(String[] args) {
//        Main main = new Main();
//        main.menu();

        //cach 2:
        new Main().menu();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("**********************SCHOOL MANAGEMENT************************");
            System.out.println("1. Quản lý lớp học");
            System.out.println("2. Quản lý sinh viên");
            System.out.println("3. Quản lý môn học");
            System.out.println("4. Quản lý điểm");
            System.out.println("5. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    new ClassroomView().menuClassroom();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
