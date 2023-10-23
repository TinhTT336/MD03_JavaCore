package ra.view;

import ra.config.Config;

public class StudentManagement {

    public void menu() {
                int choice;
                do {
                    System.out.println("**********************STUDENT MENU************************");
                    System.out.println("1. Hiển thị danh sách hoc sinh");
                    System.out.println("2. Thêm hoc sinh");
                    System.out.println("3. Sửa hoc sinh");
                    System.out.println("4. Xóa hoc sinh");
                    System.out.println("5. Sắp xếp hoc sinh");
                    System.out.println("6. Tìm kiếm hoc sinh");
                    System.out.println("7. Khác");
                    System.out.println("8. Thoát");
                    System.out.print("Mời lựa chọn (1/2/3/4/5/6/7/8): ");
                    choice = Config.validateInt();
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                           return;
                        default:
                            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                            break;
                    }
                } while (true);
            }
}
