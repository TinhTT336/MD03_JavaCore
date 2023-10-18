package ra.lession.findnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNumber {
    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }

    //B1: tạo 1 hàm tìm kiếm có kdl trả về là Boolean
    //
    //B2: trong hàm tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
    //
    //B3: tạo 2 List có kiểu dữ liệu là int để lưu những vị trí số đó xuất hiện.
    //
    //B4: tạo biến check dkl bolean, mặc định = false
    //
    //B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều, nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
    //
    //B6: in ra các vị trí và trả vể biến check

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = getArr();
        System.out.println("Mang 2 chieu");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();


        System.out.println("Nhap so muon tim kiem");
        int number = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    check = true;
                    list.add(i);
                    list1.add(j);
                }
            }
        }
        if (check) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Vi tri cua "+number+ " trong mang 2 chieu la: "+list.get(i)+"."+list1.get(i));
            }

        } else {
            System.out.println("Khong tim thay vi tri cua " + number + " trong mang 2 chieu");
        }
    }
}
