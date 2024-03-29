package ra.model;

public class Student {
    private int studentId;
    private static int count=100;
    private String studentName;
    private Classroom classroom;
    private String birthday;
    private boolean gender;
    private String phone;
    private String address;

    public Student() {
        this.studentId=Student.count++;
    }

    public Student( String studentName, Classroom classroom, String birthday, boolean gender, String phone, String address) {
        this.studentId = Student.count++;
        this.studentName = studentName;
        this.classroom = classroom;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

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

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", classroom=" + classroom +
                ", birthday='" + birthday + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
