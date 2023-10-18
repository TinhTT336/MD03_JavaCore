package ra.onclass;

import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 4, 7, 9, 11, 14, 15, 17};

       while (true){
           System.out.println("Nhap gia tri can tim kiem");
           int searchNumber = Integer.parseInt(scanner.nextLine());

           int low = 0;
           int high = arr.length - 1;
           boolean isNotFound=true;

           while (low <= high) {
               int mid = (high + low) / 2;

               if (arr[mid] == searchNumber) {
                   System.out.printf("Phần tử %d được tìm thấy tại vị trí %d \n\n", searchNumber, mid);
                  isNotFound=false;
               }

               if (searchNumber < arr[mid]) {
                   high = mid - 1;
               } else {
                   low = mid + 1;
               }
           }

          if(isNotFound){
              System.out.println("Không tìm thấy phần tử \n");
          }

       }
    }
}
