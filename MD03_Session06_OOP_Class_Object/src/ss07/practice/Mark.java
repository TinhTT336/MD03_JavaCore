package ss07.practice;

import java.util.Scanner;

import static ss07.practice.Management.*;

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

    public int getMarkId() {
        return markId;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    //phương thức inputData(): hiện thị danh sách học sinh và môn học cho người dùng chọn theo id nhập vào,
    // nếu không có học sinh hoặc môn học thì bắt buộc người dùng thêm học sinh và môn học trước.

    public void inputData(Student[] arrStudent, int indexStudent, Subject[] arrSubject, int indexSubject) {
        System.out.println("Danh sach tat ca hoc sinh");
        for (int i = 0; i < indexStudent; i++) {
            arrStudent[i].displayData();
        }
        System.out.println("==============================");
        System.out.println("Chon hoc sinh theo ma hoc sinh - studentId");
        int studentID = Integer.parseInt((scanner.nextLine()));
        //cach 1:
        this.student = findStudentById(studentID);
        if (student == null) {
            System.out.println("Không tìm thấy học sinh có mã " + studentID + ". Vui lòng thêm học sinh.");
            addStudent();
            student = findStudentById(studentID);
        }

        //cach 2:
//        boolean isExit = false;
//        for (int i = 0; i < indexStudent; i++) {
//            if (arrStudent[i].getStudentId() == studentID) {
//                this.student = arrStudent[i];
//                this.student.displayData();
//                isExit = true;
//                break;
//            } else {
//                isExit = false;
//            }
//        }
//
//        if (!isExit) {
//            System.out.println("Khong tim thay ten sinh vien theo ma vua nhap, vui long them moi\n");
//            addStudent();
//        }

        System.out.println("==============================");
        System.out.println("Danh sach tat ca mon hoc");
        for (int i = 0; i < indexSubject; i++) {
            arrSubject[i].displayData();
        }
        System.out.println("Chon mon hoc theo ma mon hoc - subjectId");
        String subjectId = scanner.nextLine();
        //cach 1:
        this.subject= findSubjectById(subjectId);
        if(subject==null){
            System.out.println("Không tìm thấy môn học có mã " + subjectId + ". Vui lòng thêm môn học.");
            addSubject();
            subject = findSubjectById(subjectId);
        }


        //cach 2
//        boolean check = false;
//        for (int i = 0; i < indexSubject; i++) {
//            if (arrSubject[i].getSubjectId().contains(subjectId)) {
//                check = true;
//                this.subject = arrSubject[i];
//                this.subject.displayData();
//                break;
//            } else {
//                check = false;
//            }
//        }
//
//        if (!check) {
//            System.out.println("Khong tim thay mon hoc theo ma vua nhap\n");
//            addSubject();
//        }

        System.out.println("Nhap diem mon hoc");
        while (true) {
            this.point = Double.parseDouble(scanner.nextLine());
            if (this.point < 0 || this.point > 10) {
                System.out.println("Diem so phai tu 0-10");
                continue;
            }
            break;
        }

    }

    //tim kiem hoc sinh theo ma id
    public Student findStudentById(int studentId) {
        for (int i = 0; i < indexStudent; i++) {
            if(arrStudent[i].getStudentId()==studentId){
                arrStudent[i].displayData();
                return arrStudent[i];
            }
        }
        return null;
    }

    //tim kiem mon hoc theo id
    public Subject findSubjectById(String subjectId) {
        for (int i=0;i<indexSubject;i++) {
            if (arrSubject[i].getSubjectId().equals(subjectId)) {
                arrSubject[i].displayData();
                return arrSubject[i];
            }
        }
        return null;
    }

    //Triển khai phương thức displayData() cho phép hiển thị tất cả thông tin điểm số
    // (bao gồm ID, tên học sinh, tên môn học và điểm số)


    public void displayData() {
        for (int i = 0; i < indexMark - 1; i++) {
            for (int j = 0; j < indexMark - 1; j++) {
                if (arrMark[j].getPoint() > arrMark[j + 1].getPoint()) {
                    Mark temp = arrMark[j];
                    arrMark[j] = arrMark[j + 1];
                    arrMark[j + 1] = temp;
                }
            }
        }
        System.out.printf("Ma diem: %d - Ten hoc sinh: %s - Ten mon hoc: %s - Diem: %.2f \n",
                this.markId, this.student.getStudentName(), this.subject.getSubjectName(), this.point
        );
    }
}
