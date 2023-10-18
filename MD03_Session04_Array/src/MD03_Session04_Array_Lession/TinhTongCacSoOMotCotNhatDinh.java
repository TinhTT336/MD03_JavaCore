package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOMotCotNhatDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang 2 chieu");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][];
        int size2;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Nhap so luong phan tu cua mang thu " + (i + 1));
            size2 = scanner.nextInt();
            matrix[i] = new int[size2];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu thu " + (i + 1) + " cua mang thu " + i);
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Nhap vao thu tu cua cot can tinh tong");
        int column = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][column];
        }
        System.out.println("Tong gia tri cac cot "+column +" cua mang 2 chieu la: "+total);
    }
}
