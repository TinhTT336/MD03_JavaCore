package treemap;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
//        //cach 1:
//        StudentComparator comparator=new StudentComparator();
//        Map<Student, Student>studentMap=new TreeMap<>(comparator);

        //cach 2:
        Map<Student, Student>studentMap=new TreeMap<>(new StudentComparator());

        Student student1=new Student(1);
        Student student2=new Student(2);
        Student student3=new Student(3);
        studentMap.put(student3,student3);
        studentMap.put(student2,student3);
        studentMap.put(student1,student1);


    }
}
