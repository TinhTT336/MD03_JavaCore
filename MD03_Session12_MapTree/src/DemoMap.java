import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        System.out.println(map.isEmpty()?"Map dang rong":"Map dang chua du lieu");
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        map.put(5,"5");

        map.replace(1,"100");
        map.replace(5,"1000");

        map.remove(2);
        map.remove(1,"1");

        Set<Integer>keySet=map.keySet();
        System.out.println("Cac cap key-value cua map la: ");
        for(Integer key:keySet){
            System.out.println(key+" : "+map.get(key));
        }

        //HashMap: khong dam bao thu tu them vao
        //LinkedHashMap: dam bao thu tu them vao
        //TreeMap: dam bao thu tu sap xep tu nhien. Neu muon sap xep thi key extends Comparable.
        // Neu key ko extends Comparable cung cpa Comparator

    }
}