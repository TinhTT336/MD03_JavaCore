package MD03_Session04_Array_Practice;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        //khai bao cac bien, nhap va kiem tra kich thuoc mang
        int size;
        int[]array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Enter a size");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("Size should not exceed 20");
            }
        } while (size>20);

        //nhap gia tri cho cac phan tu mang
        array=new int[size];
        int i=0;
        while(i< array.length){
            System.out.print("Enter element"+(i+1)+" : ");
            array[i]= scanner.nextInt();
            i++;
        }

        //in ra danh sach tai san da nhap
        System.out.print("Property list: ");
        for(int j=0;j< array.length;j++){
            System.out.print(array[j]+" ");
        }
        //duyet cac phan tu trong mang de tim gia tri lon nhat va vi tri
        int max=array[0];
        int index=1;
        for(int j=0;j< array.length;j++){
            if(array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("The largest property value in the list is "+max+" at position "+index);


    }
}
