package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang");
        size= scanner.nextInt();

        int []arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu "+(i+1) +" cua mang");
            arr[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int minValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }
        System.out.println("Gia tri nho nhat cua mang la: "+minValue);
    }
}
