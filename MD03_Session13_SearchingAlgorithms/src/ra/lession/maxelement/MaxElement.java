package ra.lession.maxelement;

import java.util.Arrays;

public class MaxElement {
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

        int max = arr1[0];
        for (int e : arr1) {
            if (max < e) {
                max = e;
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: "+max);
    }
}
