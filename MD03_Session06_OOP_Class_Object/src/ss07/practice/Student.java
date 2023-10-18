package ss07.practice;

import java.util.Scanner;

public class Student {

    Scanner scanner = new Scanner(System.in);
    private int studentId;
    private static int count = 1;
    private String studentName;
    private int age;
    private String birthday;
    private boolean gender;
    private String address;
    private String numberPhone;

    //constructor
    public Student() {
        this.studentId = Student.count++;
    }

    public Student(String studentName, int age, String birthday, boolean gender, String address, String numberPhone) {
        this.studentId = Student.count++;
        this.studentName = studentName;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    //setter va getter

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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    //methods
    public void inputData() {
        System.out.println("Nhap ten sinh vien");
        while (true) {
            this.studentName = scanner.nextLine();
            if (this.studentName.isEmpty()) {
                System.out.println("Ten sinh vien khong duoc de trong, moi nhap lai");
            } else {
                break;
            }
        }

        System.out.println("Nhap ngay sinh");
        this.birthday = scanner.nextLine();

        System.out.println("Nhap dia chi");
        while (true) {
            this.address = scanner.nextLine();
            if (this.address.isEmpty()) {
                System.out.println("Dia chi khong duoc de trong, moi nhap lai");
            } else {
                break;
            }
        }

        System.out.println("Nhap tuoi");
        this.age= Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap gioi tinh (true/false)");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Nhap so dien thoai");
        while (true) {
            this.numberPhone = scanner.nextLine();
            if (this.numberPhone.startsWith("0")) {
                if (this.numberPhone.length() == 10 || this.numberPhone.length() == 11) {
                    break;
                } else {
                    System.out.println("So dien thoai phai co 10 hoac 11 chu so, moi nhap lai");
                }
            } else {
                System.out.println("So dien thoai phai bat dau bang so 0, moi nhap lai");
            }
        }

    }


    public void displayData() {
        System.out.println(
                "Student{" +
                        "Ma hoc sinh =" + studentId +
                        ", Ten hoc sinh ='" + studentName + '\'' +
                        ", Tuoi =" + age +
                        ", Ngay sinh ='" + birthday + '\'' +
                        ", Gioi tinh=" + (gender?"Nam":"Nu") +
                        ", Dia chi ='" + address + '\'' +
                        ", So dien thoai ='" + numberPhone + '\'' +
                        '}'
        );
    }

}
