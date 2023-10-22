public class countTotalIntArray {
    public static void main(String[] args) {
        //Đề bài: Viết một chương trình Java để tính tổng của một mảng số nguyên.
        // Nếu một phần tử trong mảng không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và bỏ qua phần tử đó.
        //
        //Hướng dẫn: duyệt mảng cộng các phần tử bình thường,
        // nhưng biểu thức tính cộng để trong khối try-catch.
        int[] arr = {1,5,5,6,10,8,11,23};
        System.out.println("Tong mang so nguyen la: "+countTotalIntArray(arr));
    }

    public static int countTotalIntArray(int[] arr) {

        int total = 0;
        for (Integer i : arr) {
            try {
                total += i;

            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
        }
      return total;
    }
}
