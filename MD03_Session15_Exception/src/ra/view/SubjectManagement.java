package ra.view;

import ra.config.Config;
import ra.model.Mark;
import ra.model.Subject;
import ra.service.IMarkService;
import ra.service.ISubjectService;
import ra.service.impl.MarkServiceIMPL;
import ra.service.impl.SubjectServiceIMPL;

public class SubjectManagement {
    ISubjectService subjectService = new SubjectServiceIMPL();
    IMarkService markService = new MarkServiceIMPL();

    public void menuSubject() {
        int choice;
        do {
            System.out.println("**********************SUBJECT MENU************************");
            System.out.println("1. Hiển thị danh sách mon hoc");
            System.out.println("2. Thêm mon hoc");
            System.out.println("3. Sửa mon hoc");
            System.out.println("4. Xóa mon hoc");
            System.out.println("5. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5/6/7): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    showListSubject();
                    break;
                case 2:
                    addSubject();
                    break;
                case 3:
                    editSubject();
                    break;
                case 4:
                    deleteSubject();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    private void deleteSubject() {
        System.out.println("Nhap ma mon hoc muon xoa: ");
        int deleteId = Config.validateInt();

        for (Mark mark : markService.findAll()) {
            if (mark.getSubject().getSubjectId() == deleteId) {
                System.out.println("Mon hoc da co diem, khong duoc xoa");
                return;
            }
        }
        for (Subject subject : subjectService.findAll()) {
            if (subject.getSubjectId() == deleteId) {
                subjectService.deleteByIt(deleteId);
                System.out.println("Da xoa mon hoc thanh cong!");
                break;
            }
        }
        System.out.println("Khong tim thay mon hoc voi ma mon hoc vua nhap");
    }

    private void editSubject() {
        System.out.println("Nhap ma mon hoc muon sua: ");
        int editId = Config.validateInt();

        Subject subjectEdit = subjectService.findById(editId);
        if (subjectEdit == null) {
            System.out.println("Khong tim thay mon hoc voi ma vua nhap");
        } else {
            System.out.println("Nhap ten mon hoc muon sua: ");
            subjectEdit.setSubjectName(Config.scanner().nextLine());
            subjectService.update(subjectEdit);
        }
    }

    private void addSubject() {
        System.out.println("Nhap so luong mon hoc muon them moi: ");
        int n = Config.validateInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Them moi mon hoc thu " + (i + 1));
            Subject newSubject = new Subject();
            System.out.println("Nhap ten mon hoc: ");
            newSubject.setSubjectName(Config.scanner().nextLine());

            subjectService.save(newSubject);
        }
    }

    private void showListSubject() {
        System.out.println("Danh sach cac mon hoc: ");
        for (Subject subject : subjectService.findAll()) {
            System.out.println(subject);
        }
    }
}
