package ss07.practice;

import java.util.Scanner;

public class Management {
    static Scanner scanner = new Scanner(System.in);
    static Student[] arrStudent = new Student[100];

    static {
        arrStudent[0] = new Student("Nguyen A", 18, "1/8/2005", true, "Ha Noi", "0938939393");
        arrStudent[1] = new Student("Nguyen B", 18, "12/7/2005", false, "Ha Nam", "0838939393");
        arrStudent[2] = new Student("Nguyen C", 18, "22/5/2005", true, "Ha Noi", "0538939393");
    }

    static int indexStudent = 3;
    static Subject[] arrSubject = new Subject[100];

    static {
        arrSubject[0] = new Subject("MH123", "Toan cao cap");
        arrSubject[1] = new Subject("MH124", "Tieng Anh");
        arrSubject[2] = new Subject("MH125", "The duc");
    }

    static int indexSubject = 3;

    static Mark[] arrMark = new Mark[100];
    static int indexMark = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=========Menu==========");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý môn học");
            System.out.println("3. Quản lí điểm thi");
            System.out.println("4. Thoát");

            System.out.println("=================================");
            System.out.println("Chon chuc nang (1-4)");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menuStudentManagerment();
                    break;
                case 2:
                    menuSubjectManagerment();
                    break;
                case 3:
                    menuMarkManagerment();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);


    }

    private static void menuMarkManagerment() {
        int choice3;
        do {
            System.out.println("=========Menu==========");
            System.out.println("1. Thêm mới điểm thi");
            System.out.println("2. Hiển thị tất cả điểm thi theo thứ tự tăng dần");
            System.out.println("3. Thay đổi điểm thi theo mã id");
            System.out.println("4. Xóa điểm thi theo mã id");
            System.out.println("5. Hiển thị danh sách điểm thi theo mã môn học ");
            System.out.println("6. Hiển thị đánh giá học lực của từng học sinh theo mã môn học (giả sử <5 là yếu ," +
                    " <=6.5 là trung bình, <= 8 là khá, <= 9 là giỏi, còn lại là xuất sắc)");
            System.out.println("7. Thoát");

            System.out.println("=================================");
            System.out.println("Chon chuc nang (1-5)");
            choice3 = scanner.nextInt();

            switch (choice3) {
                case 1:
                    addMark();
                    break;
                case 2:
                    displayAndSortMark();
                    break;
                case 3:
                    editMark();
                    break;
                case 4:
                    deleteMark();
                    break;
                case 5:
                    displayMarkBySubjectId();
                    break;
                case 6:
                    displayMarkByPoint();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }

    private static void displayMarkByPoint() {
        System.out.println("Nhap ma mon hoc muon hien thi danh gia");
        String showedId1 = scanner.nextLine();
        for (int i = 0; i < indexMark; i++) {
            if (arrMark[i].getSubject().getSubjectId().equals(showedId1)) {
                arrMark[i].displayData();
                if (arrMark[i].getPoint() < 5) {
                    System.out.println("Hoc sinh " + arrMark[i].getStudent().getStudentName() +
                            " co diem mon " + arrMark[i].getSubject().getSubjectName() + " co hoc luc yeu");
                } else if (arrMark[i].getPoint() <= 6.5) {
                    System.out.println("Hoc sinh " + arrMark[i].getStudent().getStudentName() +
                            " co diem mon " + arrMark[i].getSubject().getSubjectName() + " co hoc luc trung binh");
                } else if (arrMark[i].getPoint() <= 8) {
                    System.out.println("Hoc sinh " + arrMark[i].getStudent().getStudentName() +
                            " co diem mon " + arrMark[i].getSubject().getSubjectName() + " co hoc luc kha");
                } else if (arrMark[i].getPoint() <= 9) {
                    System.out.println("Hoc sinh " + arrMark[i].getStudent().getStudentName() +
                            " co diem mon " + arrMark[i].getSubject().getSubjectName() + " co hoc luc gioi");
                } else {
                    System.out.println("Hoc sinh " + arrMark[i].getStudent().getStudentName() +
                            " co diem mon " + arrMark[i].getSubject().getSubjectName() + " co hoc luc xuat sac");
                }
            }
        }
    }

    private static void displayMarkBySubjectId() {
        System.out.println("Nhap ma mon hoc muon hien thi");
        String showedId = scanner.nextLine();
        for (int i = 0; i < indexMark; i++) {
            if (arrMark[i].getSubject().getSubjectId().equals(showedId)) {
                arrMark[i].displayData();
            }
        }
    }

    private static void deleteMark() {
        System.out.println("Nhap ma diem muon xoa");
        int deleteMarkId = scanner.nextInt();

        for (int i = 0; i < indexMark; i++) {
            if (arrMark[i].getMarkId() == deleteMarkId) {
                arrMark[i].displayData();
                for (int j = 0; j < indexMark - 1; j++) {
                    arrMark[j] = arrMark[j + 1];
                }
                indexMark--;
                return;
            }
        }
        System.out.println("Khong tim thay diem voi ma vua nhap");
    }

    private static void editMark() {
        System.out.println("Nhap ma diem muon sua");
        int editMarkId = scanner.nextInt();

        for (int i = 0; i < indexMark; i++) {
            if (arrMark[i].getMarkId() == editMarkId) {
                arrMark[i].displayData();
                arrMark[i].inputData(arrStudent, indexStudent, arrSubject, indexSubject);
                return;
            }
        }
        System.out.println("Khong tim thay diem voi ma vua nhap");
    }

    private static void displayAndSortMark() {
        for (int i = 0; i < indexMark; i++) {
            for (int j = 0; j < indexMark - 1; j++) {
                if (arrMark[j].getPoint() > arrMark[j + 1].getPoint()) {
                    Mark temp = arrMark[j];
                    arrMark[j] = arrMark[j + 1];
                    arrMark[j + 1] = temp;
                }
            }
            arrMark[i].displayData();
        }
//
    }

    private static void addMark() {
        arrMark[indexMark] = new Mark();
        arrMark[indexMark].inputData(arrStudent, indexStudent, arrSubject, indexSubject);
        indexMark++;
    }

    private static void menuSubjectManagerment() {
        int choice2;
        do {
            System.out.println("=========Menu==========");
            System.out.println("1. Thêm mới môn học");
            System.out.println("2. Hiển thị danh sách tất cả môn học đã lưu trữ");
            System.out.println("3. Thay đổi thông tin học môn học theo mã id");
            System.out.println("4. Xóa môn học theo mã id (kiểm tra nếu môn học có điểm thi thì không xóa được ");
            System.out.println("5. Thoát");

            System.out.println("=================================");
            System.out.println("Chon chuc nang (1-5)");
            choice2 = scanner.nextInt();

            switch (choice2) {
                case 1:
                    addSubject();
                    break;
                case 2:
                    displayAllSubjects();
                    break;
                case 3:
                    editSubject();
                    break;
                case 4:
                    deleteSubject();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private static void deleteSubject() {
        System.out.println("Nhap ma mon hoc muon xoa");
        String deleteSubjectId = scanner.nextLine();

        for (int i = 0; i < indexSubject; i++) {
            if (arrSubject[i].getSubjectId().equals(deleteSubjectId)) {
                System.out.println("Thong tin mon hoc muon xoa");
                arrSubject[i].displayData();
                for (int j = i; j < indexSubject; j++) {
                    arrSubject[j] = arrSubject[j + 1];
                }
                indexSubject--;
                return;
            }
        }
        System.out.println("Khong tim thay mon hoc voi ma vua nhap");
    }

    private static void editSubject() {
        System.out.println("Nhap ma mon hoc muon sua");
        String editSubjectId = scanner.nextLine();
        for (int i = 0; i < indexSubject; i++) {
            if (arrSubject[i].getSubjectId().equals(editSubjectId)) {
                arrSubject[i].displayData();
                arrSubject[i].inputData(arrSubject, indexSubject);
                return;
            }
        }
        System.out.println("Khong tim thay mon hoc voi ma vua nhap");
    }

    private static void displayAllSubjects() {
        for (int i = 0; i < indexSubject; i++) {
            arrSubject[i].displayData();
        }
    }

    protected static void addSubject() {
        arrSubject[indexSubject] = new Subject();
        arrSubject[indexSubject].inputData(arrSubject, indexSubject);
        indexSubject++;
    }

    private static void menuStudentManagerment() {
        int choice1;
        do {
            System.out.println("=========Menu==========");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiện thị tất cả học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá học sinh - nếu không có điểm");
            System.out.println("5. Thoát");

            System.out.println("=================================");
            System.out.println("Chon chuc nang (1-5)");
            choice1 = scanner.nextInt();

            switch (choice1) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private static void deleteStudent() {
        System.out.println("Nhap ma sinh vien muon xoa");
        int deleteStudentId = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < indexStudent; i++) {
            if (arrStudent[i].getStudentId() == deleteStudentId) {
                System.out.println("Thong tin hoc sinh muon xoa");
                arrStudent[i].displayData();
                for (int j = i; j < indexStudent; j++) {
                    arrStudent[j] = arrStudent[j + 1];
                }
                indexStudent--;
                return;
            }
        }
        System.out.println("Khong tim thay hoc sinh voi ma vua nhap");
    }

    private static void editStudent() {
        System.out.println("Nhap ma sinh vien can sua");
        int editStudentId = scanner.nextInt();
        for (int i = 0; i < indexStudent; i++) {
            if (arrStudent[i].getStudentId() == editStudentId) {
                System.out.println("Thong tin hoc sinh muon sua");
                arrStudent[i].displayData();
                arrStudent[i].inputData();
                return;
            }
        }
        System.out.println("Khong tim thay hoc sinh voi ma vua nhap");
    }

    private static void displayAllStudents() {
        for (int i = 0; i < indexStudent; i++) {
            arrStudent[i].displayData();
        }
    }

    protected static void addStudent() {
//        Student student = new Student();
//        student.inputData();
//        arrStudent[indexStudent++]=student;

        arrStudent[indexStudent] = new Student();
        arrStudent[indexStudent].inputData();
        indexStudent++;
    }

}
