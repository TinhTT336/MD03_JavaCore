package ra.data.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ClassCastException {
        //Thực hiện ghi 1 danh sách các employee vào file employee.dat
        //Sau khi thực hiện ghi thành công thì thực hiện đọc danh sách này ra và in ra màn hình
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("lam banh", 5));
        skills.add(new Skill("rua xe", 3));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "An", true, skills));
        employees.add(new Employee(2, "Binh", true, skills));
        employees.add(new Employee(3, "Chi", true, skills));
        File file = new File("employee.dat");
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employees);
        oos.close();
        System.out.println("Ghi danh sach employee vao file");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("Doc danh sach employee va in ra man hinh: ");
        List<Employee> em = (List<Employee>) ois.readObject();
        for (Employee e:em) {
            System.out.println(e);
        }
        ois.close();
    }
}
