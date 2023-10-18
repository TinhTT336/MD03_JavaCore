package ra.onclass;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 5, 1, 2, 3, 7, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //cach 1:
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;

                    //cach 2: hieu nang cao hon
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]-=arr[j+1];
                }
            }
        }

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
    }
}
