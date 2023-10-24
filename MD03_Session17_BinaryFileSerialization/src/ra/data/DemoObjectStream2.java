package ra.data;

import ra.data.model.Mark;
import ra.data.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoObjectStream2 {
    public static void main(String[] args) throws IOException {
        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("Java", 10));
        marks.add(new Mark("Python", 9));
        Student student = new Student(1, "An", 27, true, marks);

        FileOutputStream fos = new FileOutputStream("student.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Thuc hien ghi object");
        oos.writeObject(student);
        oos.close();

        FileInputStream fis = new FileInputStream("student.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("Thuc hien doc object");

    }
}
