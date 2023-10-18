import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer>hashMap=new HashMap<>();
        hashMap.put(4,4);
        hashMap.put(2,2);
        hashMap.put(3,3);
        hashMap.put(1,1); //hashMap sau khi them vao phan tu moi se tu thay doi vi tri cac san pham

        Map<Integer,Integer>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(4,4);
        linkedHashMap.put(2,2);
        linkedHashMap.put(3,3);
        linkedHashMap.put(1,1); //dam bao cac phan tu them moi vao theo thu tu them vao



    }
}
