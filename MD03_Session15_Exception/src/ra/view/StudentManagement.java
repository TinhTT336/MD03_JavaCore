package ra.view;

import ra.config.Config;
import ra.model.Classroom;
import ra.model.Mark;
import ra.model.Student;
import ra.service.IClassroomService;
import ra.service.IMarkService;
import ra.service.IStudentService;
import ra.service.impl.ClassroomServiceIMPL;
import ra.service.impl.MarkServiceIMPL;
import ra.service.impl.StudentServiceIMPL;

import java.util.Collections;
import java.util.Comparator;

public class StudentManagement {
    IStudentService studentService = new StudentServiceIMPL();
    IClassroomService classroomService = new ClassroomServiceIMPL();
    IMarkService markService = new MarkServiceIMPL();

    public void menuStudent() {
        int choice;
        do {
            System.out.println("**********************STUDENT MANAGEMENT************************");
            System.out.println("1. Hiển thị danh sách sinh vien");
            System.out.println("2. Thêm sinh vien");
            System.out.println("3. Sửa sinh vien");
            System.out.println("4. Xóa sinh vien");
            System.out.println("5. Sắp xếp sinh vien theo ten");
            System.out.println("6. Tìm kiếm sinh vien theo ten hoac lop hoc");
            System.out.println("7. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5/6/7): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    showListStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    sortStudent();
                    break;
                case 6:
                    findStudent();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    private void findStudent() {
        System.out.println("Nhap ten sinh vien/ten lop hoc muon tim kiem: ");
        String searchName = Config.scanner().nextLine();

        int count = 0;
        for (Student student : studentService.findAll()) {
            if (student.getStudentName().toLowerCase().contains(searchName.toLowerCase()) || student.getClassroom().getClassroomName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(student);
                count++;
            }
        }
        if (count > 0) {
            System.out.printf("Tim thay %d sinh vien theo ten sinh vien/mon hoc vua nhap \n", count);
        } else if (count == 0) {
            System.out.println("Khong tim thay sinh vien voi ten/mon hoc vua nhap");
        }
    }

    private void sortStudent() {
        Collections.sort(studentService.findAll(), Comparator.comparing(Student::getStudentName));
        System.out.println("Da sap xep sinh vien theo ten ");
        showListStudent();
    }

    private void deleteStudent() {
        System.out.println("Nhap ma sinh vien muon xoa: ");
        int deleteId = Config.validateInt();

//        for (Student student : studentService.findAll()) {
//            if (student.getStudentId() == deleteId) {
//                if (student.getClassroom().isStatus()) {
//                    System.out.println("Sinh vien dang co lop, khong duoc xoa ");
//                } else {
//                    studentService.deleteByIt(deleteId);
//                }
//            }
//        }
//        System.out.println("Khong tim thay sinh vien voi ma vua nhap");

        for (Mark mark : markService.findAll()) {
            if (mark.getStudent().getStudentId() == deleteId) {
                System.out.println("Sinh vien dang co diem, khong duoc xoa");
                return;
            }
        }

        for (Student student : studentService.findAll()) {
            if (student.getStudentId() == deleteId) {
                studentService.deleteByIt(deleteId);
                System.out.println("Da xoa sinh vien!");
                break;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma sinh vien vua nhap");

    }

    private void editStudent() {
        System.out.println("Nhap ma sinh vien muon chinh sua: ");
        int editId = Config.validateInt();

        Student studentEdit = studentService.findById(editId);
        if (studentEdit == null) {
            System.out.println("Khong tim thay sinh vien voi ma vua nhap");
        } else {
            System.out.println("Thong tin sinh vien muon chinh sua: ");
            System.out.println(studentEdit);

            System.out.println("Chon thong tin can chinh sua: ");
            System.out.println("1.Sua ten sinh vien");
            System.out.println("2.Sua ten lop hoc");
            System.out.println("3.Sua gioi tinh sinh vien");
            System.out.println("4.Sua so dien thoai");
            System.out.println("5.Sua dia chi");
            System.out.println("6.Sua ngay sinh");
            int choice = Config.validateInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap ten sinh vien: ");
                    studentEdit.setStudentName(Config.scanner().nextLine());
                    break;
                case 2:
                    System.out.println("Danh sach lop hoc co the chon:");
                    for (int j = 0; j < classroomService.findAll().size(); j++) {
                        System.out.println((j + 1) + ". " + classroomService.findAll().get(j).getClassroomName());
                    }
                    System.out.println("Chon ma lop hoc: ");
                    while (true) {
                        int classroomId = Config.validateInt();
                        if (classroomId >= 1 && classroomId <= classroomService.findAll().size()) {
                            studentEdit.setClassroom(classroomService.findAll().get(classroomId - 1));
                            break;
                        } else {
                            System.out.println("Khong co lop hoc theo lua chon vua roi, vui long chon lai");
                        }
                    }

                    break;
                case 3:
                    studentEdit.setGender(!studentEdit.isGender());
                    System.out.println("Da thay doi gioi tinh");
                    break;
                case 4:
                    System.out.println("Nhap so dien thoai: ");
                    studentEdit.setPhone(Config.scanner().nextLine());
                    break;
                case 5:
                    System.out.println("Nhap dia chi: ");
                    studentEdit.setAddress(Config.scanner().nextLine());
                    break;
                case 6:
                    System.out.println("Nhap ngay sinh: ");
                    studentEdit.setBirthday(Config.scanner().nextLine());
                    break;
                default:
                    System.out.println("Lua chon khong hop le, moi nhap lai");
                    break;
            }
            studentService.update(studentEdit);
        }

    }

    private void addStudent() {
        System.out.println("Nhập số lượng sinh viên muốn thêm mới: ");
        int n = Config.validateInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1));
            Student newStudent = new Student();

            System.out.println("Nhap ten sinh vien: ");
            newStudent.setStudentName(Config.scanner().nextLine());

            System.out.println("Danh sach lop hoc co the chon:");
            for (int j = 0; j < classroomService.findAll().size(); j++) {
                System.out.println((j + 1) + ". " + classroomService.findAll().get(j).getClassroomName());
            }
            System.out.println("Chon ma lop hoc: ");
            while (true) {
                int classroomId = Config.validateInt();
                if (classroomId >= 1 && classroomId <= classroomService.findAll().size()) {
                    newStudent.setClassroom(classroomService.findAll().get(classroomId - 1));
                    break;
                } else {
                    System.out.println("Khong co lop hoc theo lua chon vua roi, vui long chon lai");
                }
            }
            System.out.println("Nhap ngay sinh: ");
            newStudent.setBirthday(Config.scanner().nextLine());

            System.out.println("Nhap gioi tinh: ");
            newStudent.setGender(Boolean.parseBoolean(Config.scanner().nextLine()));

            System.out.println("Nhap so dien thoai: ");
            newStudent.setPhone(Config.scanner().nextLine());

            System.out.println("Nhap dia chi: ");
            newStudent.setAddress(Config.scanner().nextLine());

            studentService.save(newStudent);
        }


    }

    private void showListStudent() {
        System.out.println("Danh sách học sinh: ");
        for (Student student : studentService.findAll()) {
            System.out.println(student);
        }
    }

}
