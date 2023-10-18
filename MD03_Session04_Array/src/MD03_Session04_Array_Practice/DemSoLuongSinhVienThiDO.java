package MD03_Session04_Array_Practice;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDO {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("Enter a size: ");
            size= scanner.nextInt();
            if(size>30){
                System.out.println("Size should not exceed 30");
            }
        }while (size>30);

        //nhap gia tri cho cac phan tu cua mang
        array=new int[size];
        int i=0;
        while(i< array.length){
            System.out.println("Enter a mark for student "+(i+1)+": ");
            array[i]= scanner.nextInt();
            i++;
        }

        //dung vong lap de in ra danh sach diem vua nhap va diem so cua SV thi do
        int count=0;
        System.out.println("List of mark: ");
        for(int j=0;j< array.length;j++){
            System.out.print(array[j]+" ");
            if(array[j]>=5&&array[j]<=10){
                count++;
            }
        }
        System.out.println("The number of students passing the exam is "+count);
    }
}
