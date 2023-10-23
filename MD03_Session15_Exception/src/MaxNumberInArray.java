import java.util.Scanner;

public class MaxNumberInArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //Đề bài: Viết một chương trình Java để tìm số lớn nhất trong một mảng số nguyên.
        // Nếu mảng không có phần tử nào, chương trình sẽ hiển thị thông báo lỗi.
        //
        //Hướng dẫn: đặt 1 khối if(), kiểm tra length của mảng == 0 thì ném ngoại lệ với tin nhắn:
        // “mảng rỗng”
        int[] arr = {};
        try {
            int maxNumber = findMaxInArray(arr);
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMaxInArray(int[] arr) throws Exception {
        if (arr.length == 0) {
            System.out.println("mảng rỗng");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
