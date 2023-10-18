package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1, size2;
        System.out.println("Nhap so luong phan tu cua mang 2 chieu");
        size1 = scanner.nextInt();
        int[][] matrix = new int[size1][];

        for (int i = 0; i < size1; i++) {
            System.out.println("Nhap so luong phan tu thu " + (i + 1) + " cua mang 2 chieu");
            size2 = scanner.nextInt();
            matrix[i] = new int[size2];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu thu " + (j + 1) + " cua mang thu " + (i + 1) + " trong mang 2 chieu");
                matrix[i][j] = scanner.nextInt();
            }
//            System.out.println(Arrays.toString(matrix[i]));
        }
        //duyet qua mang 2 chieu de tim phan tu lon nhat
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong mang la: "+ max);



    }
}
