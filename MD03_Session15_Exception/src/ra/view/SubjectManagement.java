package ra.view;

import ra.config.Config;

public class SubjectManagement {

    public void menu() {
                int choice;
                do {
                    System.out.println("**********************SUBJECT MENU************************");
                    System.out.println("1. Hiển thị danh sách mon hoc");
                    System.out.println("2. Thêm mon hoc");
                    System.out.println("3. Sửa mon hoc");
                    System.out.println("4. Xóa mon hoc");
                    System.out.println("5. Sắp xếp mon hoc");
                    System.out.println("6. Tìm kiếm mon hoc");
                    System.out.println("7. Thoát");
                    System.out.print("Mời lựa chọn (1/2/3/4/5/6/7): ");
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
                           return;
                        default:
                            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                            break;
                    }
                } while (true);
            }
}
