package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1,size2;


        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang 1");
        size1= scanner.nextInt();
        int[]arr1=new int[size1];
        for(int i=0;i< arr1.length;i++){
            System.out.println("Nhap phan tu thu "+(i+1) +" cua mang 1");
            arr1[i]=scanner.nextInt();
        }

        System.out.println("Nhap so luong phan tu mang 2");
        size2= scanner.nextInt();
        int[]arr2=new int[size2];
        for(int j=0;j<arr2.length;j++){
            System.out.println("Nhap phan tu thu "+(j+1) +" cua mang 2");
            arr2[j]=scanner.nextInt();
        }

        int[]arr3=new int[arr1.length+ arr2.length];
        int k=0;
        for (int element: arr1
             ) {
            arr3[k]=element;
            k++;
        }
        for (int element:arr2
             ) {
            arr3[k]=element;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
