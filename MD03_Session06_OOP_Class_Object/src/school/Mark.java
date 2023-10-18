package school;

import java.util.Scanner;

import static school.SchoolManagement.*;

public class Mark {
    Scanner scanner = new Scanner(System.in);
    private int markId;
    private static int count = 1;
    private Student student;
    private Subject subject;
    private double point;

    public Mark() {
        this.markId = Mark.count++;
    }

    public Mark(Student student, Subject subject, double point) {
        this.markId = Mark.count++;
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    public int getMarkId() {
        return markId;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void inputData(Student[] arrStudent, int indexStudent, Subject[] arrSubject, int indexSubject) {
        System.out.println("Danh sach tat ca sinh vien ");
        for (int i = 0; i < indexStudent; i++) {
            arrStudent[i].displayData();
        }
        System.out.println("==============================");
        System.out.println("Nhap ma sinh vien");
        int studentId = Integer.parseInt(scanner.nextLine());
        this.student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Khong tim thay sinh vien voi ma vua nhap la " + studentId + ", vui long them moi");
            addStudent();
            student = findStudentById(studentId);
        }


        System.out.println("Danh sach tat ca mon hoc");
        for (int i = 0; i < indexSubject; i++) {
            arrSubject[i].displayData();
        }
        System.out.println("Nhap ma mon hoc");
        String subjectId = scanner.nextLine();
        this.subject = findSubjectById(subjectId);
        if (subject == null) {
            System.out.println("Khong tim thay mon hoc voi ma vua nhap la: " + subjectId + ", vui long them moi");
            addSubject();
            subject = findSubjectById(subjectId);
        }

        System.out.println("Nhap diem mon hoc");
        while(true){
           this.point= Double.parseDouble(scanner.nextLine());
            if(point<0||point>10){
                System.out.println("Diem phai nam trong khoang tu 0-10");
                continue;
            }
            break;
        }


    }

    public Student findStudentById(int studentId) {
        for (int i = 0; i < indexStudent; i++) {
            if (arrStudent[i].getStudentId() == studentId) {
                return arrStudent[i];
            }
        }
        return null;
    }

    public Subject findSubjectById(String subjectId) {
        for (int i = 0; i < indexSubject; i++) {
            if (arrSubject[i].getSubjectId().equals(subjectId)) {
                return arrSubject[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "markId=" + markId +
                ", student=" + student +
                ", subject=" + subject +
                ", point=" + point +
                '}';
    }

    public void displayData(){
        System.out.println("Diem thi{" +
                "Ma diem thi =" + markId +
                ", Ten sinh vien =" + student.getStudentName() +
                ", Ten mon hoc =" + subject.getSubjectName() +
                ", Diem thi =" + point +
                '}');
    }

}
