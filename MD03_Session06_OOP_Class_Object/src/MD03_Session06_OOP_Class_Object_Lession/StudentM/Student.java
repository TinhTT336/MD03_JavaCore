package MD03_Session06_OOP_Class_Object_Lession.StudentM;

import java.util.Scanner;

public class Student {
    //1. Fields
    private int studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phoneNumber;

    //các phương thức khởi tạo (constructor) 0 tham số và có tham số
    public Student() {
    }

    public Student(int studentId, String studentName, int age, boolean gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //phuong thuc setter va getter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma SV");
        studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten SV");
        studentName = scanner.nextLine();
        System.out.println("Nhap tuoi SV");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh sinh vien");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhap dia chi cua SV");
        address = scanner.nextLine();
        System.out.println("Nhap so dien thoai cua SV");
        phoneNumber = scanner.nextLine();
    }

    //phương thức displayData() cho phép hiển thị toàn bộ thông tin học sinh.
    public void displayData() {
        System.out.printf("Ma SV: %d - Ten SV: %s - Tuoi: %d - Gioi tinh: %s - Dia chi: %s - So dien thoai: %s\n"
                ,this.studentId,this.studentName,this.age,(gender ? "Nam" : "Nu"),this.address,this.phoneNumber
               );
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
