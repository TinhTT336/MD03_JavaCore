package ra.lession.sortingstring;

import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};

        System.out.println("Mang ban dau: "+ Arrays.toString(arr));
        System.out.println("Mang sau khi sap xep bang bubbleSort: "+Arrays.toString(sortBubble(arr)));
        System.out.println("Mang sau khi sap xep bang selectionSort: "+Arrays.toString(sortSelection(arr)));
        System.out.println("Mang sau khi sap xep bang insertionSort: "+Arrays.toString(sortInsertion(arr)));
    }

    public static String[] sortBubble(String[] string) {
        for (int i = 0; i < string.length - 1; i++) {
            for (int j = 0; j < string.length - 1 - i; j++) {
                if (string[j].compareTo(string[j + 1]) > 0) {
                    String temp = string[j];
                    string[j] = string[j + 1];
                    string[j + 1] = temp;
                }
            }
        }
        return string;
    }

    public static String[]sortSelection(String[]string){
        int min;
        for (int i = 0; i < string.length-1; i++) {
            min=i;
            for (int j = i+1; j < string.length ; j++) {
                if(string[j].compareTo(string[min])>0){
                    min=j;
                }
                if(min!=i){
                    String temp=string[min];
                    string[min]=string[j];
                    string[j]=temp;
                }
            }
        }
        return string;
    }

    public static String[]sortInsertion(String[]string){
        int position;
        String value;
        for (int i = 0; i < string.length; i++) {
            position=i;
            value=string[position];

            while(position>0&&value.compareTo(string[position-1])<0){
                string[position]=string[position-1];
                position--;
            }
        }
        return string;
    }
}
