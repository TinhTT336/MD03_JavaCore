package ra.baitap.daonguoclistsonguyen;

import java.util.ArrayList;
import java.util.List;

public class DaoNguocListSoNguyen {
    public static void main(String[] args) {
//Viết chương trình để tạo một danh sách (List) chứa các số nguyên và đảo ngược danh sách
// (không được sử dụng hàm đảo ngược có sẵn trong List).
        List<Integer>listInt=new ArrayList<>();
        listInt.add(10);
        listInt.add(8);
        listInt.add(7);
        listInt.add(11);
        listInt.add(2);
        System.out.println(listInt);

        List<Integer>listInt1=new ArrayList<>();

        for (int i = listInt.size()-1; i >=0; i--) {
          listInt1.add(listInt.get(i));
        }
        System.out.println(listInt1);
    }
}
