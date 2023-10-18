package ra.baitap.inrachuoicododaihon3kytu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InRaChuoiCoDoDai3KyTu {
    public static void main(String[] args) {
//        Viết chương trình để tạo một danh sách (List) chứa các chuỗi từ một string cho sẵn
//        và in ra tất cả các chuỗi có độ dài lớn hơn 3 ký tự.

        List<String>arrStr=new ArrayList<>();
        String str="Rikkei Academy để nông dân biết code";

        String[]str1=str.split(" ");
        System.out.println(Arrays.toString(str.split(" ")));

        arrStr=Arrays.asList(str1);

        for(String str2:arrStr){
            if(str2.length()>3){
                System.out.print(str2+ ", ");
            }
        }

    }
}
