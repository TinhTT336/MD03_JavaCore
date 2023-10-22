package ra.lession.advance1.run;

import ra.lession.advance1.entity.Employee;
import ra.lession.advance1.entity.Order;
import ra.lession.advance1.entity.Product;

import java.util.ArrayList;
import java.util.List;

import static ra.lession.advance1.config.Config.scanner;

public class StoreManagement {
    List<Employee> employees = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("║               STORE MANAGEMENT               ║");
            System.out.println("╠══════════════════════════════════════════════╣");
            System.out.println("║ 1. 📁 Quản lý sản phẩm                       ║");
            System.out.println("║ 2. ✏️ Quản lý nhân viên                      ║");
            System.out.println("║ 3. 🖨️ Quản lý phiếu nhập                     ║");
            System.out.println("║ 4. 📂 Quản lý phiếu xuất                     ║");
            System.out.println("║ 5. 🔄 Báo cáo thống kê                       ║");
            System.out.println("║ 6. ❌ Thoát                                  ║");
            System.out.println("╚══════════════════════════════════════════════╝");
            System.out.println("Nhap lua chon cua ban: ");
            int choice = Integer.parseInt(scanner().nextLine());

            switch (choice) {
                case 1:
                    ProductManagement.manageProduct();
                    break;
                case 2:
                    EmployeeManagement.manageEmployee();
                    break;
                case 3:
                    ReceiptManagement.manageReceipt();
                    break;
                case 4:
                    BillManagement.manageBill();
                    break;
                case 5:
                    ReportManagement.manageReport();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Khong co chuc nang phu hop voi lua chon cua ban, moi nhap lai");
                    break;
            }
        } while (true);
    }


}