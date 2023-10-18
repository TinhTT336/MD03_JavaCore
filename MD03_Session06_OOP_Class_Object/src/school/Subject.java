package school;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Subject {
    static Scanner scanner = new Scanner(System.in);
    private  String subjectId;
    private  String subjectName;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

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

    public  void inputData(Subject[] arrSubject, int indexSubject) {
        while (true) {
            System.out.println("Nhap ma mon hoc");
            this.subjectId = scanner.nextLine();
            String regex = "^MH\\d{3}$";
            boolean isMatch = this.subjectId.matches(regex);
            if (!isMatch) {
                System.out.println("Ma mon hoc bat dau bang 'MH' + 3 ky tu so tu 0-9, moi nhap lai");
            } else {
                boolean isDuplicate = false;
                for (int i = 0; i < indexSubject; i++) {
                    isDuplicate=false;
                    if (arrSubject[i].getSubjectId().equals(this.subjectId)) {
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    System.out.println("Ma mon hoc da ton tai, vui long nhap lai");
                }else{
                    break;
                }
            }
        }

        while (true) {
            System.out.println("Nhap ten mon hoc");
           this.subjectName = scanner.nextLine();

            boolean isDuplicate = false;
            for (int i = 0; i < indexSubject; i++) {
                isDuplicate=false;
                if (arrSubject[i].getSubjectName().equals(this.subjectName)) {
                    isDuplicate = true;
                }
            }
            if (isDuplicate) {
                System.out.println("Mon hoc da ton tai, vui long nhap lai");
            }else{
                break;
            }
        }

    }


    public void displayData() {
        System.out.println("Mon hoc{" +
                "Ma mon hoc ='" + this.subjectId + '\'' +
                ", Ten mon hoc ='" + this.subjectName + '\'' +
                '}');
    }
}
