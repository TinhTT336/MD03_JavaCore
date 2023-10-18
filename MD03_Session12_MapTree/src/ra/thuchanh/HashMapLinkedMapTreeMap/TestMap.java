package ra.thuchanh.HashMapLinkedMapTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("HashMapp: "+hashMap);

        Map<String,Integer>treeMap=new TreeMap<>(hashMap);
        System.out.println("TreeMap: "+treeMap);

        Map<String,Integer>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println("LinkedHashMap: "+linkedHashMap);

    }
}
