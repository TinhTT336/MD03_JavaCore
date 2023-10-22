import java.util.Scanner;

public class TotalInteger {
    public static void main(String[] args) {
        //Viết một chương trình Java để tính tổng của hai số nguyên nhập vào từ bàn phím.
        // Nếu người dùng nhập vào một giá trị không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
        Scanner scanner = new Scanner(System.in);
        countTotalInteger(scanner);

    }

    public static void countTotalInteger(Scanner scanner) {
        try {
            System.out.println("Nhap vao so nguyen a");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhap vao so nguyen b");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("a+b = " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Đầu vào không đúng định dạng. Hãy thử lại");
            countTotalInteger(scanner);
        }
    }
}
