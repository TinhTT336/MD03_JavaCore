package ra.view;

import ra.config.Config;
import ra.model.Classroom;
import ra.service.classroom.ClassroomServiceIMPL;
import ra.service.classroom.IClassroomService;

import java.util.List;

public class ClassroomView {
    IClassroomService classroomService = new ClassroomServiceIMPL();

    public void menuClassroom() {
        int choice;
        do {
            System.out.println("**********************CLASSROOM MANAGEMENT************************");
            System.out.println("1. Hiển thị danh sách lớp học");
            System.out.println("2. Thêm lớp học");
            System.out.println("3. Sửa lớp học");
            System.out.println("4. Xóa lớp học");
            System.out.println("5. Sắp xế lớp học");
            System.out.println("6. Tìm kiếm lớp học");
            System.out.println("7. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5/6/7): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    showListClassroom();
                    break;
                case 2:
                    addClassroom();
                    break;
                case 3:
                    editClassroom();
                    break;
                case 4:
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

    private void editClassroom() {
        System.out.println("Nhập mã lớp học muốn chỉnh sửa: ");
        int editId = Config.validateInt();

        Classroom classroomEdit = classroomService.findById(editId);
        if (classroomEdit == null) {
            System.out.println("Không tìm thấy lớp học với mã vừa nhập");
        } else {
            int choiceEdit;
            System.out.println("1. Sưả tên lớp học");
            System.out.println("2. Sưả trạng thái lớp học");
            System.out.println("Chọn thông tin muốn chỉnh sửa");
            choiceEdit = Config.validateInt();

            switch (choiceEdit) {
                case 1:
                    System.out.println("Mời nhập tên lớp học");
                    classroomEdit.setClassroomName(Config.scanner().nextLine());
                    break;
                case 2:
                    classroomEdit.setStatus(!classroomEdit.isStatus());
                    System.out.println("Đã thay đổi trạng thái lớp học");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
            classroomService.update(classroomEdit);
        }
    }

    private void addClassroom() {
        System.out.println("Nhập số lượng lớp học muốn thêm mới");
        int n = Config.validateInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập lớp học thứ " + (i + 1));
            Classroom classroom = new Classroom();
            System.out.println("Nhập tên lớp");
            classroom.setClassroomName(Config.scanner().nextLine());

            System.out.println("Nhập trạng thái lớp (true/false)");
            classroom.setStatus(Boolean.parseBoolean(Config.scanner().nextLine()));

            classroomService.save(classroom);
        }
    }

    private void showListClassroom() {
        System.out.println("Danh sách lớp học: ");
        for (Classroom classroom : classroomService.findAll()) {
            System.out.println(classroom);
        }
    }
}
