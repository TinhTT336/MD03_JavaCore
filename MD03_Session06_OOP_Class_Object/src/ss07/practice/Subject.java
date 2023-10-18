package ss07.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Subject {
    Scanner scanner = new Scanner(System.in);
    private String subjectId;
    private String subjectName;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }
    //getter va setter

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //phương thức inputData(): Nhập thông tin của môn học từ bàn phím.
    public void inputData(Subject[] arrSubject, int indexSubject) {
        System.out.println("Nhap ma mon hoc");
        while (true) {
            this.subjectId = scanner.nextLine();
            String regexSubjectId = "^MH\\d{3}\\b$";
            boolean isMatch = Pattern.matches(regexSubjectId, this.subjectId);
            if (!isMatch) {
                System.out.println("Ma mon hoc phai bat dau bang MH va 3 ki tu so bat ky, moi nhap lai");
            } else {
                boolean isDuplicate = false;
                for (int i = 0; i < indexSubject; i++) {
                    isDuplicate=false;
                    if (arrSubject[i].getSubjectId().equals(this.subjectId)) {
                        System.out.println("Ma mon hoc khong duoc trung lap");
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate) {
                    break;
                }
            }
        }


        System.out.println("Nhap ten mon hoc");
        while (true) {
            this.subjectName = scanner.nextLine();
            if (this.subjectName.isEmpty()) {
                System.out.println("Ten mon hoc khong duoc de trong");
            } else {
                boolean isDuplicate1 = false;
                for (int i = 0; i < indexSubject; i++) {
                    isDuplicate1=false;
                    if (arrSubject[i].getSubjectName().equals(this.subjectName)) {
                        System.out.println("Ten mon hoc khong duoc trung lap");
                        isDuplicate1 = true;
                    }
                }
                if (!isDuplicate1) {
                    break;
                }
            }
        }
    }

    //phương thức displayData() cho phép hiển thị tất cả thông tin của môn học
    public void displayData() {
        System.out.println(
                "Subject{" +
                        "Ma mon hoc ='" + subjectId + '\'' +
                        ", Ten mon hoc ='" + subjectName + '\'' +
                        '}'
        );
    }
}
