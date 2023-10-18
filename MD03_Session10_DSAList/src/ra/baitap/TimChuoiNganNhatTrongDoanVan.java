package ra.baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimChuoiNganNhatTrongDoanVan {
    public static void main(String[] args) {
        //    Viết chương trình cho sẵn một đoạn văn hoặc một câu, và tìm ra chữ ngắn nhất (ít ký tự nhất) trong câu
        String str = "Rikkei Academy để nông dân biết code";

        List<String> arrStr = new ArrayList<>();
        //cach 1:
//        arrStr = Arrays.asList(str.split(" "));

        //cach 2:
        boolean b = Collections.addAll(arrStr, str.split(" "));
        System.out.println(arrStr);

        String minSize = arrStr.get(0);
        for (int i = 0; i < arrStr.size() - 1; i++) {
                if (arrStr.get(i).length() < minSize.length()) {
                    minSize = arrStr.get(i);
                }
        }
        System.out.println("Tu co do dai ngan nhat trong chuoi la: " + minSize);

        List<String>arrStr1=new ArrayList<>();
        for(String str3:arrStr){
            if(str3.length()==minSize.length()){
                arrStr1.add(str3);
            }
        }

    }

}
