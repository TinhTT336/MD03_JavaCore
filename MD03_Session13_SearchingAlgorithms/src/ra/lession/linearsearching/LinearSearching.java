package ra.lession.linearsearching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearching {
    private static int[] getArr() {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        //Đề bài: Viết chương trình tìm kiếm tuyến tính trong mảng số nguyên,
        // nhập mảng và giá trị cần tìm từ bàn phím. In ra vị trí của giá trị cần tìm nếu nó có trong mảng, ngược lại in ra thông báo không tìm thấy.
        //
        //Hướng dẫn:
        //
        //B1 tạo mảng cho sẵn phần tử
        //
        //B2: lấy số cần tìm từ scanner.
        //
        //B3: tìm số lớn nhất trong mảng và in ra.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so luong phan tu cua mang");
//        int size= scanner.nextInt();
//        int[]arr=new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Nhap phan tu thu "+(i+1));
//            int number= scanner.nextInt();
//        }

        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap so can tim");
        int number = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                check = true;
                System.out.println("Vi tri cua so "+number+" la "+i);
            }
        }
        if(!check){
            System.out.println("Khong tim thay so vua nhap");
        }
    }
}
