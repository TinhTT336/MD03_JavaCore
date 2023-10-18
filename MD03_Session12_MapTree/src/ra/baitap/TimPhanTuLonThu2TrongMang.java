package ra.baitap;

import java.util.TreeMap;

public class TimPhanTuLonThu2TrongMang {
    public static void main(String[] args) {
        //Đề bài: Viết chương trình Java để tìm phần tử lớn thứ hai trong một mảng các số nguyên sử dụng TreeMap.
        //Hướng dẫn:
        //-B1: Khai báo và khởi tạo một mảng các số nguyên.
        //-B2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng. Với TreeMap, các phần tử sẽ được sắp xếp theo thứ tự tăng dần của khóa.
        //-B3: Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap. Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị là 0.
        //-B4: Lấy giá trị của phần tử lớn nhất trong TreeMap.
        //-B5: Xóa phần tử lớn nhất khỏi TreeMap.
        //-B6: Lúc này phần tử lớn nhất trong treemap sẽ là phần tử lớn thứ 2 trong mảng ban đầu, ta dung phương thức lastKey() để lấy nó ra.
        int[] intArr = new int[]{1, 4, 2, 2, -1, 5, 4, 3, 2};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < intArr.length; i++) {
            treeMap.put(intArr[i], 0);
        }
        //tim phan tu lon nhat TreeMap bang phuong thucc lastKey()
        int max = treeMap.lastKey();
        System.out.println("Phan tu lon nhat trong TreeMap la: " + max);

        //xoa phan tu lon nhat
        treeMap.remove(max);

        //tim phan tu lon thu 2TreeMap bang phuong thucc lastKey()
        int secondMax = treeMap.lastKey();
        System.out.println("Phan tu lon thu 2 trong TreeMap la: " + secondMax);

    }
}
