package ra.view;

import ra.config.Config;

public class Program {
    public static void main(String[] args) {
        Program program=new Program();
        program.start();

    }

    private void start() {
        System.out.println("Chuong trinh quan ly sinh vien");
        System.out.println("Hay dang nhap hoac dang ky de su dung he thong");
        int choice;
        do {
            System.out.println("**********************************************");
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ky");
            System.out.println("0. Thoát");
            System.out.print("Mời lựa chọn (1/2/0): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    LoginView loginView=new LoginView();

                    break;
                case 2:
                    new UserView().registerUser();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);

    }

    public void menu() {
        int choice;
        do {
            System.out.println("**********************SCHOOL MANAGEMENT************************");
            System.out.println("1. Quan ly lop hoc");
            System.out.println("2. Quan ly sinh vien");
            System.out.println("3. Quan ly mon hoc");
            System.out.println("4. Quan ly diem");
            System.out.println("5. Quan ly ho so ca nhan (user)");
            System.out.println("6. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    new ClassroomManagement().menu();
                    break;
                case 2:
                    new StudentManagement().menuStudent();
                    break;
                case 3:
                    new SubjectManagement().menuSubject();
                    break;
                case 4:
                    new MarkManagement().menuMark();
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

}
