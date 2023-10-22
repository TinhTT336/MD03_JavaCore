package ra.lession.advance1.run;

import static ra.lession.advance1.config.Config.scanner;

public class ReportManagement {
    public static void manageReport(){
        do{
            System.out.println("╔═════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                             REPORT MANAGEMENT                           ║");
            System.out.println("╠═════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ 1. 📁 Thống kê các sản phẩm nhập từ ngày đến ngày                       ║");
            System.out.println("║ 2. ✏️ Thống kê các sản phẩm xuất từ ngày đến ngày                       ║");
            System.out.println("║ 3. 🖨️ Thống kê doanh thu từ ngày đến ngày (theo các phiếu xuất)         ║");
            System.out.println("║ 4. 📂 Thống kê chi phí từ ngày đến ngày (theo các phiếu nhập)           ║");
            System.out.println("║ 5. 🔄 Thống kê phiếu thu theo các tháng                                 ║");
            System.out.println("║ 6. 🔄 Thống kê chi phí theo các tháng                                   ║");
            System.out.println("║ 7. ❌ Thoát                                                             ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════╝");
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
        } while(true);
    }
}
