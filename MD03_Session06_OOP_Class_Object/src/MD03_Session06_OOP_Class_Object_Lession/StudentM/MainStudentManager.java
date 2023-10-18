package MD03_Session06_OOP_Class_Object_Lession.StudentM;

import java.util.Scanner;

public class MainStudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //khởi tạo danh sách Student có độ rộng 100 phần tử
        Student[] student = new Student[100];
        student[0] = new Student(1, "Nguyen A", 18, true, "Ha Noi", "0393993939");
        student[1] = new Student(2, "Nguyen B", 20, false, "Ha Noi", "0293993939");
        student[2] = new Student(3, "Nguyen C", 17, true, "Ha Nam", "0593993939");
        int index = 3;

        while (true) {
            System.out.println("Menu chuc nang");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin sinh vien dựa vào mã sinh vien");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Sắp xếp sinh viên theo tuổi tăng dần");
            System.out.println("6. Tìm kiếm theo tên sinh viên");
            System.out.println("0. Thoat");
            System.out.println("Lua chon chuc nang quan ly");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Hiển thị danh sách tất cả sinh vien");
                    for (int i = 0; i < index; i++) {
                        student[i].displayData();
                    }
                    break;
                case 2:
                    System.out.println("2. Thêm mới sinh vien");
                    System.out.println("Nhap vao so luong Sinh vien muon them moi");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien thu " + (i + 1));
                        student[index] = new Student();
                        student[index].inputData();
                        index++;
                    }
                    break;
                case 3:
                    System.out.println("3. Sửa thông tin SV dựa vào mã SV");
                    System.out.println("Nhap ma SV muon sua thong tin");
                    int indexEdit = Integer.parseInt(scanner.nextLine());
                    boolean check = true;
                    for (int i = 0; i < index; i++) {
                        check = true;
                        if (student[i].getStudentId() == indexEdit) {
                            //cach 1:
//                            student[i].displayData();
//                            student[i].inputData();
//                            student[i].setStudentId(indexEdit);
//                            System.out.println("Da cap nhat thong tin hoc sinh thanh cong!");

                            //cach 2:
                            System.out.println("Chon thong tin muon sua");
                            System.out.println("1. Sua ten/ 2. Sua tuoi/ 3. Sua gioi tinh/ 4. Sua dia chi/ 5. Sua so dien thoai/ 0. Thoat");
                            int choiceEdit = Integer.parseInt(scanner.nextLine());

                            switch (choiceEdit) {
                                case 1:
                                    System.out.println("Nhap ten muon sua");
                                    student[i].setStudentName(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Nhap tuoi muon sua");
                                    student[i].setAge(Integer.parseInt(scanner.nextLine()));
                                    break;
                                case 3:
                                    System.out.println("Nhap gioi tinh muon sua");
                                    student[i].setGender(Boolean.parseBoolean(scanner.nextLine()));
                                    break;
                                case 4:
                                    System.out.println("Nhap dia chi muon chi");
                                    student[i].setAddress(scanner.nextLine());
                                    break;
                                case 5:
                                    System.out.println("Nhap so dien thoai muon sua");
                                    student[i].setPhoneNumber(scanner.nextLine());
                                    break;
                                case 0:
                                    break;
                            }

                            break;
                        } else {
                            check = false;
                        }
                    }
                    if (!check) {
                        System.out.println("Khong tim thay ma SV +\n");
                    }

                    break;
                case 4:
                    System.out.println("4. Xoá SV");
                    System.out.println("Nhap ma SV muon xoa");
                    int indexDelete = Integer.parseInt(scanner.nextLine());
                    boolean checkDelete = true;
                    for (int i = 0; i < index; i++) {
                        checkDelete = true;
                        if (student[i].getStudentId() == indexDelete) {
                            student[i] = student[i + 1];
                            index--;
                            student[index] = null;
                            System.out.println("Da xoa SV!");
                            break;
                        } else {
                            checkDelete = false;
                        }

                    }
                    if (!checkDelete) {
                        System.out.println("Khong tim thay ma SV");
                    }
                    break;
                case 5:
                    System.out.println("5. Sắp xếp sinh viên theo tuổi tăng dần");
                    for (int i = 0; i < index; i++) {
                        for (int j = 0; j < index - 1; j++) {
//                        for (int j = 0; j < index - 1-i; j++) {
                            if (student[j].getAge() > student[j + 1].getAge()) {
                                Student temp = student[j];
                                student[j] = student[j + 1];
                                student[j + 1] = temp;
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("6. Tìm kiếm theo tên sinh viên");
                    System.out.println("Nhap ten sinh vien muon tim");
                    String nameSearch=scanner.nextLine();
                    boolean isExit=true;
                    for (int i = 0; i < index; i++) {
                        isExit=true;
                        if(student[i].getStudentName().contains(nameSearch)){
                            student[i].displayData();
                            break;
                        }else{
                            isExit=false;

                        }
                    }
                    if(!isExit){
                        System.out.println("Khong tim thay ten sinh vien \n");
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
