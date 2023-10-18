package MD03_Session04_Array_Practice;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        //khai bao bien, nhap va kiem tra kich thuoc mang
int size;
int[]array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter a size");
            size= scanner.nextInt();
            if(size>20){
                System.out.println("Size does not exceed 20");
            }
        }while(size>20);

        //nhap gia tri cho cac phan tu mang
        array=new int[size];
        int i=0;
        while(i< array.length){
            System.out.println("Enter element "+(i+1)+": ");
        array[i]= scanner.nextInt();
        i++;
        }

        //in ra mang da nhap
        System.out.printf("%-20s%s", "Element in array: ", "");
        for(int j=0;j< array.length;j++){
            System.out.println(array[j]+"\t");
        }

        //su dung bien trung gian de hoan doi gia tri cac phan tu trong mang
        for(int j=0;j< array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }

        //in ra mang sau khi da dao nguoc cac phan tu
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
    for(int j=0;j< array.length;j++){
        System.out.println(array[j]+"\t");
    }
    }
}
