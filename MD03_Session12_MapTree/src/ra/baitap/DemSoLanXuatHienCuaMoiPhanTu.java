package ra.baitap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemSoLanXuatHienCuaMoiPhanTu {
    public static void main(String[] args) {
        //    Đề bài: Viết chương trình Java để đếm số lần xuất hiện của mỗi phần tử trong một mảng
//    và lưu trữ kết quả trong HashMap.
//Hướng dẫn:
//-B1: khai bảo mảng hoặc list phần từ với bất kỳ kdl nào
//-B2: Duyệt từng phần tử trong mảng và kiểm tra xem phần tử đó đã có trong HashMap hay chưa.
// Nếu đã có thì tăng số lần xuất hiện lên 1, nếu chưa có thì thêm phần tử vào HashMap
// với số lần xuất hiện ban đầu là 1.
//-B3: Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử.

        int[] intArr = new int[]{1, 4, 2, 2, -1, 5, 4, 3, 2};
        Map<Integer, Integer> hashmap = new HashMap<>();
//        int count = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            if (!hashmap.containsKey(intArr[i])) {
//                hashmap.put(intArr[i], 1);
//            } else {
//                 //tang count len 1
//                count = hashmap.get(intArr[i]);
//                hashmap.put(intArr[i], count + 1);
//            }
//        }

//        //cach 2:
        for (int i = 0; i < intArr.length; i++) {
            int count = 1;
            if(hashmap.containsKey(intArr[i])){
                continue;
            }
            for (int j = i+1; j < intArr.length; j++) {
                if (intArr[i] == intArr[j]) {
                    count++;
                }
            }
            hashmap.put(intArr[i], count);
        }
        Set<Integer>setKey=hashmap.keySet();
        int max=0;
        int maxValue=0;
        for (Integer key:setKey) {
            System.out.println("Phan tu "+key +" co so lan xuat hien la: "+hashmap.get(key));
            if(hashmap.get(key)>max){
                max=hashmap.get(key);
                maxValue=key;
            }
        }
        System.out.println("Phan tu co so lan xuat hien nhieu nhat la: "+maxValue+" - "+max);
    }
}
