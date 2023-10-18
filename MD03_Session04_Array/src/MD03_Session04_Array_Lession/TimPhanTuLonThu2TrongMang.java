package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonThu2TrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu trong mang");
        int size= scanner.nextInt();

        int[]arr=new int[size];
        int max=arr[0];
        int max2=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu "+(i+1)+" cua mang");
            arr[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if(max2<arr[i]&&arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: "+max);
        System.out.println("Gia tri lon thu 2 cua mang la: "+max2);

    }
}
