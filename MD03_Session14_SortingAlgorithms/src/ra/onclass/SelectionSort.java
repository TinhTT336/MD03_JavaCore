package ra.onclass;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {6, 8, 5, 1, 2, 3, 7, 9};
        for (int i = 0; i < arr1.length; i++) {
            int indexOfMax = 0;
            for (int j = 0; j < arr1.length - i; j++) {
                if (arr1[j] > arr1[indexOfMax]) {
                    indexOfMax = j;
                }
                int temp = arr1[arr1.length - i - 1];
                arr1[arr1.length - i - 1] = arr1[indexOfMax];
                arr1[indexOfMax] = temp;
            }
        }
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr1));

    }
}
