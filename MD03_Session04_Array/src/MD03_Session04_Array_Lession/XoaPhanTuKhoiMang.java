package MD03_Session04_Array_Lession;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
//        Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        int a;
        int indexDel = 0;
        System.out.println(Arrays.toString(arr));
//        Bước 2: Nhập X là phần tử cần xoá

            System.out.println("Nhap phan tu can xoa");
            a = scanner.nextInt();

//        Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X.
        boolean isExit = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                isExit = true;
                indexDel = i;
                break;
            }
        }

//        Bước 4: Thực hiện xoá phần tử X khỏi mảng
//        Duyệt mảng từ vị trí cần xoá (index_del) đến cuối mảng (array.length-1)
//                - Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1

        if (isExit) {
            //cach 1:
//            for (int i = indexDel; i < arr.length-1; i++) {
//                arr[i] = arr[i + 1];
//            }
//                arr[arr.length-1]=0;
//            break;
//            System.out.println(Arrays.toString(arr));

            //cach 2:
            int[]newArr=new int[arr.length-1];
            int j=0;
            for(int i=0;i< arr.length;i++){
                if(indexDel!=i){
                    newArr[j]=arr[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(newArr));
        }



    }
}
