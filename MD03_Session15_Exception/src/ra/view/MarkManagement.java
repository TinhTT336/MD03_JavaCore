package ra.view;

import ra.config.Config;
import ra.model.Classroom;
import ra.model.Mark;
import ra.model.Student;
import ra.model.Subject;
import ra.service.IClassroomService;
import ra.service.IMarkService;
import ra.service.IStudentService;
import ra.service.ISubjectService;
import ra.service.impl.ClassroomServiceIMPL;
import ra.service.impl.MarkServiceIMPL;
import ra.service.impl.StudentServiceIMPL;
import ra.service.impl.SubjectServiceIMPL;

import java.util.Collections;

public class MarkManagement {
    IMarkService markService = new MarkServiceIMPL();
    IClassroomService classroomService = new ClassroomServiceIMPL();
    ISubjectService subjectService = new SubjectServiceIMPL();
    IStudentService studentService = new StudentServiceIMPL();

    public void menuMark() {
        int choice;
        do {
            System.out.println("**********************MARK MANAGEMENT************************");
            System.out.println("1. Hiển thị danh sách diem");
            System.out.println("2. Thêm diem thi cho sinh vien");
            System.out.println("3. Sap xep diem theo thu tu giam dan");
            System.out.println("4. Thay doi diem thi theo ma ID");
            System.out.println("5. Xoa diem thi theo ma ID");
            System.out.println("6. Hien thi diem thi theo ma mon hoc");
            System.out.println("7. Danh gia hoc luc theo tung mon");
            System.out.println("8. Thoát");
            System.out.print("Mời lựa chọn (1/2/3/4/5/6/7/8): ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    showListMark();
                    break;
                case 2:
                    addMark();
                    break;
                case 3:
                    sortMarkDecrease();
                    break;
                case 4:
                    editMarkById();
                    break;
                case 5:
                    deleteMark();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    private void deleteMark() {
        System.out.println("Nhap ma diem thi muon xoa: ");
        int deleteId=Config.validateInt();


    }

    private void editMarkById() {
        System.out.println("Nhap ma diem thi muon chinh sua");
        int editId = Config.validateInt();
        Mark markEdit = markService.findById(editId);

        if (markEdit == null) {
            System.out.println("Khong tim thay mon hoc voi ma vua nhap");
        } else {
            System.out.println("Thong tin diem muon chinh sua: ");
            System.out.println(markEdit);

            System.out.println("Chon thong tin muon chinh sua: ");
            int choice = Config.validateInt();

            switch (choice) {
                case 1:
                    System.out.println("Danh sach sinh vien de chon: ");
                    for (int j = 0; j < studentService.findAll().size(); j++) {
                        System.out.println((j + 1) + ". " + studentService.findAll().get(j).getStudentName());
                    }
                    System.out.println("Chon sinh vien: ");
                    while (true) {
                        int choiceStudent = Config.validateInt();
                        if (choiceStudent >= 1 && choiceStudent <= studentService.findAll().size()) {
                            markEdit.setStudent(studentService.findAll().get(choiceStudent - 1));
                            break;
                        } else {
                            System.out.println("Khong co sinh vien voi ma vua chon ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sach mon hoc de chon: ");
                    for (int j = 0; j < subjectService.findAll().size(); j++) {
                        System.out.println((j + 1) + ". " + subjectService.findAll().get(j).getSubjectName());
                    }
                    System.out.println("Chon mon hoc: ");

                    while (true) {
                        int choiceSubject = Config.validateInt();
                        if (choiceSubject >= 1 && choiceSubject <= subjectService.findAll().size()) {
                            markEdit.setSubject(subjectService.findAll().get(choiceSubject - 1));
                            break;
                        } else {
                            System.out.println("Khong co mon hoc voi ma vua nhap");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap diem thi sua: ");
                    markEdit.setPoint(Double.parseDouble(Config.scanner().nextLine()));
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
            markService.update(markEdit);
        }


    }

    private void sortMarkDecrease() {
        Collections.sort(markService.findAll(), (m1, m2) -> (int) (m2.getPoint() - m1.getPoint()));
        System.out.println("Da sap xep diem thi theo thu tu giam dan: ");
        showListMark();
    }

    private void addMark() {
        System.out.println("Nhap so luong diem muon them moi: ");
        int n = Config.validateInt();
        for (int i = 0; i < n; i++) {
            Mark newMark = new Mark();
            System.out.println("Them moi diem thu " + (i + 1));
            System.out.println("Danh sach sinh vien de chon: ");
            for (int j = 0; j < studentService.findAll().size(); j++) {
                System.out.println((j + 1) + ". " + studentService.findAll().get(j).getStudentName());
            }
            System.out.println("Chon sinh vien: ");
            while (true) {
                int choiceStudent = Config.validateInt();
                if (choiceStudent >= 1 && choiceStudent <= studentService.findAll().size()) {
                    newMark.setStudent(studentService.findAll().get(choiceStudent - 1));
                    break;
                } else {
                    System.out.println("Khong co sinh vien voi ma vua chon ");
                }
            }

            System.out.println("Danh sach mon hoc de chon: ");
            for (int j = 0; j < subjectService.findAll().size(); j++) {
                System.out.println((j + 1) + ". " + subjectService.findAll().get(j).getSubjectName());
            }
            System.out.println("Chon mon hoc: ");

            while (true) {
                int choiceSubject = Config.validateInt();
                if (choiceSubject >= 1 && choiceSubject <= subjectService.findAll().size()) {
                    newMark.setSubject(subjectService.findAll().get(choiceSubject - 1));
                    break;
                } else {
                    System.out.println("Khong co mon hoc voi ma vua nhap");
                }
            }

            System.out.println("Nhap diem thi: ");
            newMark.setPoint(Double.parseDouble(Config.scanner().nextLine()));

            markService.save(newMark);
        }
    }

    private void showListMark() {
        System.out.println("Danh sach diem thi: ");
        for (Mark mark : markService.findAll()) {
            System.out.println(mark);
        }
    }
}
