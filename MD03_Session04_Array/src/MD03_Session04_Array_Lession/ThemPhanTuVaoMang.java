package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao size cua mang");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("So luong phan tu mang khong duoc vuot qua 10");
            }
        } while (size > 10);

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " cua mang");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhap phan tu x muon them vao mang");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri muon them vao mang");
        int index = scanner.nextInt();

        if (index <= -1 || index > arr.length - 1) {
            System.out.println("Khong chen duoc phan tu vao mang");
        } else {
            int[] newArr = new int[arr.length + 1];
            int j = 0;
            for (int i = 0; i <= index; i++) {
                if (i < index) {
                    newArr[j] = arr[i];
                    j++;
                } else {
                    newArr[j] = x;
                    j++;
                }
            }
            for(int i=index;i< arr.length;i++){
                newArr[j]=arr[i];
                j++;
            }

            System.out.println(Arrays.toString(newArr));

        }


    }
}
