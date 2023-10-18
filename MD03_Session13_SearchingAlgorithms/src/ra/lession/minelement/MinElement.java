package ra.lession.minelement;

import java.util.Arrays;

public class MinElement {
    private static int[] getArr() {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = getArr();
        System.out.println(Arrays.toString(arr1));

        int min=arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
        System.out.println("Min of Array: " + min);
    }
}
