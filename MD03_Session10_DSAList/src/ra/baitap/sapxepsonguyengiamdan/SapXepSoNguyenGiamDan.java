package ra.baitap.sapxepsonguyengiamdan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SapXepSoNguyenGiamDan {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random() * 99 + 1);
            list.add(random);
        }
        System.out.println("Mang cac so nguyen: " + list);
        Collections.sort(list);
        System.out.println("Mang cac so nguyen sau khi sap xep theo thu tu tang dan la: " + list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Mang cac so nguyen sau khi sap xep theo thu tu giam dan la: " + list);

    }
}
