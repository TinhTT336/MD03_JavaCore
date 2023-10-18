package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoODuongCheoMang2Chieu {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang 2 chieu");
        size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu thu " + (j + 1) + " cua mang thu " + i + " trong mang 2 chieu");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    sum += matrix[i][j];
//                }
//            }
//        }

        //cach 2

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i] +" ");
            sum+=matrix[i][i];
        }
        System.out.println("Gia tri cua duong cheo chinh mang 2 chieu la: " + sum);
        sum=0;

//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//            for (int j = 0; j < matrix[i].length; j++) {
//                if ((i + j) == matrix.length-1) {
//                    sum += matrix[i][j];
//                    break;
//                }
//            }
//        }

        //cach 2:
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][matrix.length-i-1]);
            sum+=matrix[i][matrix.length-i-1];
        }
        System.out.println("Gia tri cua duong cheo phu mang 2 chieu la: " + sum);

    }

}
