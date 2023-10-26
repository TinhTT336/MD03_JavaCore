package ra.view;

import ra.config.Config;
import ra.model.Classroom;
import ra.model.Student;
import ra.service.IClassroomService;
import ra.service.IStudentService;
import ra.service.impl.ClassroomServiceIMPL;
import ra.service.impl.StudentServiceIMPL;

import java.util.List;


public class ClassroomManagement {
    IClassroomService classroomService = new ClassroomServiceIMPL();
    IStudentService studentService = new StudentServiceIMPL();

    public void menu() {
        int choice;
        do {
            System.out.println("**********************CLASSROOM MENU************************");
            System.out.println("1. Hiển thị danh sách lop hoc");
            System.out.println("2. Thêm lop hoc moi");
            System.out.println("3. Sửa thong tin lop hoc");
            System.out.println("4. Xóa lop hoc");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tìm kiếm");
            System.out.println("7. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5/6/7): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    showClassroomList();
                    break;
                case 2:
                    addClassroom();
                    break;
                case 3:
                    editClassroom();
                    break;
                case 4:
                    deleteClassroom();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    private void deleteClassroom() {
        System.out.println("Nhap ma lop hoc muon xoa: ");
        int deleteId = Config.validateInt();
        List<Student> studentList = studentService.findAll();

        for (Student student : studentList) {
            if (student.getClassroom().getClassroomId() == deleteId) {
                System.out.println("Lop hoc da ton tai hoc sinh, khong duoc xoa");
                return;
            }
        }
        Classroom classroomDelete = classroomService.findById(deleteId);
        if (classroomDelete == null) {
            System.out.println("Khong tim thay lop hoc voi ma vua nhap");
        } else {
            classroomService.deleteByIt(deleteId);
        }
    }

    private void editClassroom() {
        System.out.println("Nhap ma lop hoc muon sua: ");
        int editId = Config.validateInt();

        Classroom classroomEdit = classroomService.findById(editId);
        if (classroomEdit == null) {
            System.out.println("Khong tim thay lop hoc voi ma vua nhap");
        } else {
            System.out.println(classroomEdit);
            int choice;
            System.out.println("Chon thong tin can chinh sua: ");
            System.out.println("1.Sua ten lop hoc");
            System.out.println("2.Sua trang thai lop hoc");
            choice = Config.validateInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap ten moi: ");
                    classroomEdit.setClassroomName(Config.scanner().nextLine());
                    break;
                case 2:
                    classroomEdit.setStatus(!classroomEdit.isStatus());
                    System.out.println("Da thay doi trang thai");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, moi nhap lai");
                    break;
            }
            classroomService.update(classroomEdit);
        }

    }

    private void addClassroom() {
        System.out.println("Nhap so luong lop hoc muon them moi");
        int n = Config.validateInt();

        for (int i = 0; i < n; i++) {
            Classroom newClassroom = new Classroom();
            System.out.println("Nhap ten lop");
            newClassroom.setClassroomName(Config.scanner().nextLine());

            System.out.println("Nhap trang thai lop (true/false)");
            newClassroom.setStatus(Boolean.parseBoolean(Config.scanner().nextLine()));

            classroomService.save(newClassroom);
        }
    }

    private void showClassroomList() {
        System.out.println("Danh sach cac lop hoc: ");
        List<Classroom> classroomList = classroomService.findAll();
        if (classroomList.isEmpty()){
            System.out.println("Danh sach trong");
            return;
        }
        for (Classroom classroom : classroomList) {
            System.out.println(classroom.toString());
        }
    }
}
