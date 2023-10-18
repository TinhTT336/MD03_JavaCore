package school;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private int studentId;
    private static int count = 1;
    private String studentName;
    private String birthDay;
    private String address;
    private boolean gender;
    private String phone;

    public Student() {
        this.studentId = Student.count++;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student(String studentName, String birthDay, String address, boolean gender, String phone) {
        this.studentId = Student.count++;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(Student[] arrStudent, int indexStudent) {
        while (true) {
            System.out.println("Nhap ten sinh vien");
            this.studentName = scanner.nextLine();
            if (studentName.isEmpty()) {
                System.out.println("Ten sinh vien khong duoc de trong, vui long nhap lai");
            }
            break;
        }

        System.out.println("Nhap ngay sinh");
        this.birthDay = scanner.nextLine();

        while (true) {
            System.out.println("Nhap dia chi");
            this.address = scanner.nextLine();
            if (address.isEmpty()) {
                System.out.println("Dia chi khong duoc de trong, vui long nhap lai");
            }
            break;
        }

        System.out.println("Nhap gioi tinh (true/false)");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        while (true) {
            System.out.println("Nhap so dien thoai");
           this.phone = scanner.nextLine();
            if (phone.startsWith("0")) {
                if (phone.length() == 10 || phone.length() == 11) {
                    for (int i = 0; i < indexStudent; i++) {
                        if (arrStudent[i].getPhone().equals(phone)) {
                            System.out.println("So dien thoai da ton tai, vui long nhap lai");
                        }
                    }
                    break;
                } else {
                    System.out.println("So dien thoai co 10-11 so, vui long nhap lai");
                }
            } else {
                System.out.println("So dien thoai bat dau bang so 0, vui long nhap lai");
            }
        }
    }


    public void displayData() {
        System.out.println("Student{" +
                "Ma sinh vien =" + studentId +
                ", Ten sinh vien ='" + studentName + '\'' +
                ", Ngay sinh ='" + birthDay + '\'' +
                ", Dia chi='" + address + '\'' +
                ", Gioi tinh=" + (gender?"Nam":"Nu") +
                ", So dien thoai ='" + phone + '\'' +
                '}');
    }

}
