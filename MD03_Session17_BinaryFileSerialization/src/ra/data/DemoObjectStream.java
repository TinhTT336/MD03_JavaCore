package ra.data;

import ra.data.model.Student;

import java.io.*;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Ghi vao file student.dat");
        FileOutputStream fos = new FileOutputStream("student.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student student = new Student(1, "An", 27, true);
        oos.writeObject(student);
        oos.close();
        System.out.println("Ghi thanh cong!");

        System.out.println("Thuc hien doc tu file");
        FileInputStream fis = new FileInputStream("student.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student1 = (Student) ois.readObject();
        System.out.println(student1);
        ois.close();
        System.out.println("Ket thuc doc file");

    }
}
