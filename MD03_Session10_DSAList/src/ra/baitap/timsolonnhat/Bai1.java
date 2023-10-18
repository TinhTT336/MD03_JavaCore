package ra.baitap.timsolonnhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai1 {
    //luyện tập sử dụng 1 số hàm có sẵn để thao tác với List trong java
//Viết một chương trình Java tạo ngẫu nhiên một List số nguyên có tối đa 10 phần tử rồi
// in list số nguyên đó, sau đó sử dụng phương thức Collections.max() của lớp Collections
// để tìm và in ra phần tử lớn nhất
    public static void main(String[] args) {
        List<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random() * 99 + 1);
            arrInt.add(random);
            System.out.println(arrInt.get(i));
        }
        System.out.println(arrInt);
        Integer max = Collections.max(arrInt);
        System.out.println("So lon nhat trong mang arrInt la: "+max);
    }

}
