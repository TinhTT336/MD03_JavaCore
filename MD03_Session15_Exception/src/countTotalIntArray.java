public class countTotalIntArray {
    public static void main(String[] args) {
        //Đề bài: Viết một chương trình Java để tính tổng của một mảng số nguyên.
        // Nếu một phần tử trong mảng không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và bỏ qua phần tử đó.
        //
        //Hướng dẫn: duyệt mảng cộng các phần tử bình thường,
        // nhưng biểu thức tính cộng để trong khối try-catch.
        Object[] arr = {1, 5, 5, 6, "abc", 8, 11, 23};
        System.out.println("Tong mang so nguyen la: " + countSumIntArray(arr));
    }

    public static int countSumIntArray(Object[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                total += (int) (arr[i]);
                System.out.println(arr[i] + " la so nguyen");
            } catch (ClassCastException e) {
                System.out.println("Mang co phan tu khong phai so nguyen");
            }
        }
        return total;
    }
}
