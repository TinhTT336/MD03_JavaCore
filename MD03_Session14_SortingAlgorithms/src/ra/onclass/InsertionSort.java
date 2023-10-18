package ra.onclass;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 5, 1, 2, 3, 7, 9};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    NumberUtil.swap(arr,j,j-1);
                }
            }
        }
        System.out.println("Mang sau sap xep: "+ Arrays.toString(arr));
    }
}
