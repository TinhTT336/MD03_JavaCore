package ra.baitap;

import java.util.Map;
import java.util.TreeMap;

public class MinElement {
    public static void main(String[] args) {
        //Viết chương trình Java để tìm phần tử nhỏ nhất trong TreeMap.
        //Hướng dẫn:
        //-B1: Khai báo và khởi tạo một đối tượng TreeMap.
        //-B2: Đưa các phần tử vào TreeMap.
        //-B3: Lấy giá trị của phần tử nhỏ nhất trong TreeMap
        // bằng cách sử dụng phương thức firstEntry() của đối tượng TreeMap.

        TreeMap<Integer, Integer> treeMap=new TreeMap<>();
        int[]arr=new int[]{1, 4, 2, 2, -1, 5, 4, 3, 2};

        for(Integer e:arr){
            treeMap.put(e,0);
        }

        System.out.println("TreeMap: "+treeMap);

        Map.Entry<Integer,Integer>firstElement= treeMap.firstEntry();

        System.out.println("Gia tri nho nhat trong TreeMap la: "+firstElement.getKey());
    }
}
