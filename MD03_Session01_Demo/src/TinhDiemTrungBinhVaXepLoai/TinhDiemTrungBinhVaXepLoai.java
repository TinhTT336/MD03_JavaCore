package TinhDiemTrungBinhVaXepLoai;

import java.util.Scanner;

public class TinhDiemTrungBinhVaXepLoai {
    public static void main(String[] args) {
//        Bước 2: Khai báo các biến điểm Toán, Lý , Hoá , Văn và Tiếng Anh cho phép người dùng nhập vào
//        và biến để tính giá trị trung bình các môn (thang điểm 10).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem Toan");
        int maths = scanner.nextInt();

        System.out.println("Nhap diem Ly");
        int physics = scanner.nextInt();

        System.out.println("Nhap diem Hoa");
        int chemistry = scanner.nextInt();

        System.out.println("Nhap diem Van");
        int literature = scanner.nextInt();

        System.out.println("Nhap diem Tieng Anh");
        int english = scanner.nextInt();

        double avarage = (maths + physics + chemistry + literature + english) / 5;
        System.out.println("Diem trung binh cac mon hoc la: " + avarage);

        if (avarage >= 0 && avarage < 5) {
            System.out.println("Xep loai yeu");
        } else if (avarage >= 5 && avarage < 6.5) {
            System.out.println("Xep loai trung binh");
        } else if (avarage >= 6.5 && avarage < 8) {
            System.out.println("Xep loai kha");
        } else if (avarage >= 8 && avarage < 9) {
            System.out.println("Xep loai gioi");
        } else {
            System.out.println("Xep loai xuat sac");
        }
    }
}
