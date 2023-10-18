package ra.lession.sortingintarray;

import java.util.Arrays;

public class SortingIntArray {
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) ((Math.random() * 90) + 10);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mang chua sap xep: " + Arrays.toString(arr));

        System.out.println("Mang sap xep theo bubbleSort: "+Arrays.toString(sortBubble(arr)));
        System.out.println("Mang sap xep theo selectionSort: "+Arrays.toString(sortSelection(arr)));
        System.out.println("Mang sap xep theo insertionSort: "+Arrays.toString(sortInsertion(arr)));
    }

    public static int[] sortBubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortSelection(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (min != i) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] sortInsertion(int[] arr) {
        int position, value;
        for (int i = 0; i < arr.length; i++) {
            value = arr[i];
            position = i;
            while (position > 0 && value < arr[position - 1]) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position]=value;
        }
        return arr;
    }

}
