package ra.trenlop.comparation;

import java.util.*;

public class Student implements Comparable<Student> {

    //    Tạo ra 1 class Student có thuộc tính sau:
//int id;
//String name;
//int age;
//boolean status;
//Viết 1 chương trình cho phép thêm vào danh sách sinh viên
//Mỗi khi thêm vào cần sắp xếp lại danh sách theo thứ tự alphabet
//Hiển thị ra danh sách sinh viên
    Scanner scanner = new Scanner(System.in);
    private int id;
    static int count = 1;
    private String name;
    private int age;
    private boolean status;

    public Student() {
        this.id = Student.count++;
        this.status = true;
    }

    public Student(String name, int age, boolean status) {
        this.id = Student.count++;
        this.name = name;
        this.age = age;
        this.status = true;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void inputData() {
        System.out.println("Nhap ten sinh vien");
        this.name = scanner.nextLine();

        System.out.println("Nhap tuoi sinh vien");
        this.age = Integer.parseInt(scanner.nextLine());

    }


    public void displayData() {
        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status=" + (status ? "Dang hoc" : "Da ra truong") +
                '}');
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }


    public static List<Student> student = new ArrayList<>();

    public static void main(String[] args) {

//        Student student1 = new Student();
//        student1.inputData();
//        Student student2 = new Student();
//        student2.inputData();
//
//        student.add(student1);
//        student.add(student2);

        student.add(new Student( "John", 20, true));
        student.add(new Student( "Alice", 22, false));
        student.add(new Student( "Bob", 19, true));

//        Collections.sort(student);

//        Collections.sort(student, Comparator
//                .comparing(Student::getName)
//                .thenComparingInt(Student::getAge));

        // Sắp xếp danh sách sinh viên theo tên và tuổi su dung lambda expression
        Collections.sort(student, (s1, s2) -> {
            int nameComparison = s1.getName().compareTo(s2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        for (int i = 0; i < student.size(); i++) {
            student.get(i).displayData();
        }


    }


}
