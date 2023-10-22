package ra.lession.advance1.run;

import static ra.lession.advance1.config.Config.scanner;

public class EmployeeManagement {
    public static void manageEmployee(){
        do{
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("║             EMPLOYEE MANAGEMENT              ║");
            System.out.println("╠══════════════════════════════════════════════╣");
            System.out.println("║ 1. 📁 Nhập thông tin nhân viên               ║");
            System.out.println("║ 2. ✏️ Hiển thị thông tin nhân viên           ║");
            System.out.println("║ 3. 🖨️ Cập nhật thông tin nhân viên           ║");
            System.out.println("║ 4. 📂 Tìm nhân viên theo tên nhân viên       ║");
            System.out.println("║ 5. 🔄 Cập nhật trạng thái của nhân viên      ║");
            System.out.println("║ 6. ❌ Thoát                                  ║");
            System.out.println("╚══════════════════════════════════════════════╝");
            System.out.println("Nhap lua chon cua ban: ");
            int choice = Integer.parseInt(scanner().nextLine());

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
                  return;
                default:
                    System.out.println("Khong co chuc nang phu hop voi lua chon cua ban, moi nhap lai");
                    break;
            }
        } while(true);
    }
}
