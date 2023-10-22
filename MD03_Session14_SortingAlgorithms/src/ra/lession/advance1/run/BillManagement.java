package ra.lession.advance1.run;

import static ra.lession.advance1.config.Config.scanner;

public class BillManagement {
    public static void manageBill() {
        do {
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("║               BILL MANAGEMENT                ║");
            System.out.println("╠══════════════════════════════════════════════╣");
            System.out.println("║ 1. 📁 Nhập thông tin phiếu xuất              ║");
            System.out.println("║ 2. ✏️ Hiển thị thông tin phiếu xuất          ║");
            System.out.println("║ 3. 🖨️ Cập nhật thông tin phiếu xuất          ║");
            System.out.println("║ 4. 📂 Tìm phiếu xuất từ ngày đến ngày        ║");
            System.out.println("║ 5. 🔄 Tìm phiếu xuất theo người tạo          ║");
            System.out.println("║ 6. 🔄 Tìm phiếu xuất theo người cập nhật     ║");
            System.out.println("║ 7. ❌ Thoát                                  ║");
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
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Khong co chuc nang phu hop voi lua chon cua ban, moi nhap lai");
                    break;
            }
        } while (true);
    }
}
