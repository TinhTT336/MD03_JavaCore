import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Integer>arrList=new ArrayList<>();
        arrList.add(5);
        arrList.add(6);
        arrList.addAll(new ArrayList<>());

        System.out.println(arrList.size());

        Iterator<Integer>iterator=arrList.iterator();
        System.out.println("Cac phan tu trong arrList la: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Number number;
    }
}