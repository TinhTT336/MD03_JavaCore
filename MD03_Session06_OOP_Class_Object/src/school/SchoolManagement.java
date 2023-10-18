package school;

import java.util.Scanner;

import static ss07.practice.Management.*;

public class SchoolManagement {
    static Student[] arrStudent = new Student[100];

    static {
        arrStudent[0] = new Student("Nguyen A", "10/10/2005", "Ha Noi", true, "0912345678");
        arrStudent[1] = new Student("Nguyen B", "1/1/2005", "Ha Nam", false, "0812345678");
        arrStudent[2] = new Student("Nguyen C", "20/7/2005", "Ha Noi", true, "0712345678");
    }

    static int indexStudent = 3;

    static Subject[] arrSubject = new Subject[100];

    static {
        arrSubject[0] = new Subject("MH123", "TA1");
        arrSubject[1] = new Subject("MH124", "Toan");
        arrSubject[2] = new Subject("MH125", "Triet");
    }

    static int indexSubject = 3;
    static Mark[] arrMark = new Mark[100];
    static int indexMark = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("=====================Menu chuc nang================");
            System.out.println("1. Quan ly sinh vien");
            System.out.println("2. Quan ly mon hoc");
            System.out.println("3. Quan ly diem thi");
            System.out.println("4. Thoat");
            System.out.println("====================================================");
            System.out.println("Nhap lua chon cua ban (1-4)");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    SchoolManagement.studentManagement();
                    break;
                case 2:
                    SchoolManagement.subjectManagement();
                    break;
                case 3:
                    SchoolManagement.markManagement();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang tuong ung voi lua chon cua ban, vui long nhap lai");
                    break;
            }
        }
    }

    private static void markManagement() {
        int choice3;
        while (true) {
            System.out.println("=====================Quan ly mon hoc================");
            System.out.println("1. Them moi diem thi");
            System.out.println("2. Hien thi tat ca diem thi theo thu tu diem tang dan");
            System.out.println("3. Thay doi diem theo ma id");
            System.out.println("4. Xoa diem theo ma id");
            System.out.println("5. Hien thi danh sach diem thi theo ma mon hoc");
            System.out.println("6. Hiển thị đánh giá học lực của từng học sinh theo mã môn học (giả sử <5 là yếu , " +
                    "<=6.5 là trung bình, <= 8 là khá, <= 9 là giỏi, còn lại là xuất sắc).");
            System.out.println("7. Thoat");
            System.out.println("====================================================");
            System.out.println("Nhap lua chon cua ban (1-6)");
            choice3 = Integer.parseInt(scanner.nextLine());

            switch (choice3) {
                case 1:
                    addMark();
                    break;
                case 2:
                    displayMarkByPoint();
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
                    displayEvaluateStudentBySubjectId();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Khong co chuc nang tuong ung voi lua chon cua ban, vui long nhap lai");
                    break;
            }
        }
    }

    private static void displayEvaluateStudentBySubjectId() {
        System.out.println("Nhap ma mon hoc");
        String subjectId = scanner.nextLine();
        for (int i = 0; i < indexMark; i++) {
            if (arrMark[i].getSubject().getSubjectId().equals(subjectId)) {
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
        System.out.println("Nhap ma mon hoc");
        String subjectId = scanner.nextLine();
        for (int i = 0; i < indexMark; i++) {
            if (arrMark[i].getSubject().getSubjectId().equals(subjectId)) {
                arrMark[i].displayData();
            }
        }
    }

    private static void deleteMark() {
        System.out.println("Nhap ma diem muon xoa");
        int deleteMarkId = scanner.nextInt();
        for (int i = 0; i < indexMark; i++) {
            if (arrMark[i].getMarkId() == deleteMarkId) {
                for (int j = i; j < indexMark - 1; j++) {
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
                System.out.println("Thong tin mon hoc muon sua");
                arrMark[i].displayData();
                arrMark[i].inputData(arrStudent, indexStudent, arrSubject, indexSubject);
            }
        }
    }

    private static void displayMarkByPoint() {
        for (int i = 0; i < indexMark; i++) {
            for (int j = i; j < indexMark - 1; j++) {
                if (arrMark[i].getPoint() > arrMark[i + 1].getPoint()) {
                    Mark temp = arrMark[j];
                    arrMark[j] = arrMark[j + 1];
                    arrMark[j + 1] = temp;
                }
            }
            arrMark[i].displayData();
        }
    }

    private static void addMark() {
        arrMark[indexMark] = new Mark();
        arrMark[indexMark].inputData(arrStudent, indexStudent, arrSubject, indexSubject);
        indexMark++;
    }

    private static void subjectManagement() {
        int choice2;
        while (true) {
            System.out.println("=====================Quan ly mon hoc================");
            System.out.println("1. Them moi mon hoc");
            System.out.println("2. Hien thi tat ca mon hoc");
            System.out.println("3. Sua thong tin mon hoc");
            System.out.println("4. Xoa thong tin mon hoc - neu khong co diem thi");
            System.out.println("5. Sap xep thong tin mon hoc");
            System.out.println("6. Thoat");
            System.out.println("====================================================");
            System.out.println("Nhap lua chon cua ban (1-6)");
            choice2 = Integer.parseInt(scanner.nextLine());

            switch (choice2) {
                case 1:
                    addSubject();
                    break;
                case 2:
                    displaySubject();
                    break;
                case 3:
                    editSubject();
                    break;
                case 4:
                    deleteSubjectById();
                    break;
                case 5:
                    sortSubjectById();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Khong co chuc nang tuong ung voi lua chon cua ban, vui long nhap lai");
                    break;
            }
        }
    }

    private static void sortSubjectById() {
        for (int i = 0; i < indexSubject; i++) {
            for (int j = i; j < indexStudent - 1; j++) {
                if (arrSubject[j].getSubjectId().compareTo(arrSubject[j + 1].getSubjectId()) > 0) {
                    Subject temp = arrSubject[j];
                    arrSubject[j] = arrSubject[j + 1];
                    arrSubject[j + 1] = temp;
                }
            }
            arrSubject[i].displayData();
        }
    }

    private static void deleteSubjectById() {
        System.out.println("Nhap ma mon hoc muon xoa");
        String deleteSubjectId = scanner.nextLine();

        for (int i = 0; i < indexSubject; i++) {
            if (arrSubject[i].getSubjectId().equals(deleteSubjectId)) {

                boolean hasMark = false;
                for (int j = 0; j < indexMark; j++) {
//                    hasMark=false;
                    if (arrMark[j].getSubject().getSubjectName().equals(deleteSubjectId)) {
                        hasMark = true;
                        break;
                    }
                }
                if (hasMark) {
                    System.out.println("Khong the xoa mon hoc dang co diem thi");
                }else{
                    for (int k = i; k < indexSubject - 1; k++) {
                        arrSubject[k] = arrSubject[k + 1];
                    }
                    indexSubject--;
                    System.out.println("Xoa thanh cong");
                }
                return;
            }
        }
        System.out.println("Khong tim thay mon hoc voi ma vua nhap");
    }

    private static void editSubject() {
        System.out.println("Nhap ma mon hoc can chinh sua");
        String editSubjectId = scanner.nextLine();
        for (int i = 0; i < indexSubject; i++) {
            if (arrSubject[i].getSubjectId().equals(editSubjectId)) {
                System.out.println("Thong tin mon hoc can chinh sua: ");
                arrSubject[i].displayData();
                arrSubject[i].inputData(arrSubject, indexSubject);
                return;
            }
        }
        System.out.println("Khong tim thay mon hoc voi ma vua nhap");
    }

    private static void displaySubject() {
        for (int i = 0; i < indexSubject; i++) {
            arrSubject[i].displayData();
        }

    }

    protected static void addSubject() {
        arrSubject[indexSubject] = new Subject();
        arrSubject[indexSubject].inputData(arrSubject, indexSubject);
        indexSubject++;
    }

    private static void studentManagement() {
        int choice1;
        while (true) {
            System.out.println("=====================Quan ly sinh vien================");
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Hien thi tat ca sinh vien");
            System.out.println("3. Sua thong tin sinh vien");
            System.out.println("4. Xoa thong tin sinh vien neu sinh vien khong co diem");
            System.out.println("5. Sap xep thong tin sinh vien");
            System.out.println("6. Thoat");
            System.out.println("====================================================");
            System.out.println("Nhap lua chon cua ban (1-4)");
            choice1 = Integer.parseInt(scanner.nextLine());

            switch (choice1) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent(arrMark, indexMark);
                    break;
                case 5:
                    sortStudent();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Khong co chuc nang tuong ung voi lua chon cua ban, vui long nhap lai");
                    break;
            }

        }

    }

    private static void sortStudent() {
        for (int i = 0; i < indexStudent; i++) {
            for (int j = i; j < indexStudent - 1; j++) {
                if (arrStudent[j].getStudentId() > arrStudent[j + 1].getStudentId()) {
                    Student temp = arrStudent[i];
                    arrStudent[j] = arrStudent[j + 1];
                    arrStudent[j + 1] = temp;
                }
            }
            arrStudent[i].displayData();
        }
    }

    private static void deleteStudent(Mark[] arrMark, int indexMark) {
        System.out.println("Nhập mã sinh viên muốn xóa: ");
        int deleteStudentId = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < indexStudent; i++) {
            if (arrStudent[i].getStudentId() == deleteStudentId) {
                System.out.println("Thông tin sinh viên muốn xóa: ");
                arrStudent[i].displayData();

                boolean hasMark = false;
                for (int j = 0; j < indexMark; j++) {
                    if (arrMark[j].getStudent().getStudentId() == deleteStudentId) {
                        hasMark = true;
                        break;
                    }
                }

                if (hasMark) {
                    System.out.println("Không thể xóa sinh viên đang có điểm thi trên hệ thống.");
                } else {
                    for (int k = i; k < indexStudent - 1; k++) {
                        arrStudent[k] = arrStudent[k + 1];
                    }
                    indexStudent--;
                    System.out.println("Xóa sinh viên thành công!");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy sinh viên với mã vừa nhập.");
    }

    private static void editStudent() {
        System.out.println("Nhap ma sinh vien muon chinh sua");
        int editStudentId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < indexStudent; i++) {
            if (arrStudent[i].getStudentId() == editStudentId) {
                System.out.println("Thong tin sinh vien muon chinh sua: ");
                arrStudent[i].displayData();
                arrStudent[i].inputData(arrStudent, indexStudent);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma vua nhap");
    }

    private static void displayStudent() {
        for (int i = 0; i < indexStudent; i++) {
            arrStudent[i].displayData();
        }
    }

    protected static void addStudent() {
        arrStudent[indexStudent] = new Student();
        arrStudent[indexStudent].inputData(arrStudent, indexStudent);
        indexStudent++;
    }


}
