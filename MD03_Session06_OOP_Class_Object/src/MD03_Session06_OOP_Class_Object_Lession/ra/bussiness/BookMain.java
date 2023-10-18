package MD03_Session06_OOP_Class_Object_Lession.ra.bussiness;

import MD03_Session06_OOP_Class_Object_Lession.StudentM.Student;

import java.util.Iterator;
import java.util.Scanner;

public class BookMain {
    static Scanner scanner = new Scanner(System.in);
    static Book[] books = new Book[100];

    static int index = 0;

    public static void main(String[] args) {


        while (true) {
            System.out.println("Menu chuc nang");
            System.out.println("1. Them moi sach");
            System.out.println("2. Hien thi tat ca sach trong thu vien");
            System.out.println("3. Thay doi thong tin ");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("6. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("7. Tang so luong sach theo ma sach");
            System.out.println("8. Ban sach - giam so luong sach theo ma sach");
            System.out.println("9. Thoat");

            System.out.println("=================================");
            System.out.println("Hay nhap lua chon cua ban (1-9)");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    sortBook();
                    break;
                case 6:
                    findBook();
                    break;
                case 7:
                    increaseBook();
                    break;
                case 8:
                    decreaseBook();
                    break;
                case 9:
                    System.exit(0);


            }
        }

    }

    private static void decreaseBook() {
        System.out.println("Nhap ma sach can giam luong");
        int decreasedId=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < index; i++) {
            if (books[i].getBookId()==decreasedId){
                System.out.println("Nhap so luong sach vua ban");
                int decreasedQuantity=Integer.parseInt(scanner.nextLine());
               if(books[i].getQuantity()>decreasedQuantity){
                   books[i].setQuantity(books[i].getQuantity()-decreasedQuantity);
                   return;
               }
            }
        }
        System.out.println("Khong tim thay sach voi ma sach vua nhap");
    }

    private static void increaseBook() {
        System.out.println("Nhap ma sach can them luong");
        int increasedId= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < index; i++) {
            if (books[i].getBookId()==increasedId){
                System.out.println("Nhap so luong sach muon tang them");
                int increasedQuantity=Integer.parseInt(scanner.nextLine());
                books[i].setQuantity(books[i].getQuantity()+increasedQuantity);
                return;
            }
        }
        System.out.println("Khong tim thay sach voi ma sach vua nhap");

    }

    private static void findBook() {
        System.out.println("Tim kiem sach theo ten sach hoac mo ta sach");
        System.out.println("Nhap ten sach hoac mo ta sach muon tim kiem");
        String inputSearch= scanner.nextLine();
        for (int i = 0; i < index; i++) {
            if(books[i].getBookName().contains(inputSearch)){
                books[i].displayData();
                return;
            }
        }
    }

    private static void sortBook() {
        System.out.println("Sap xep thong tin sach theo loi nhuan tang dan");
        for (int i = 0; i < index - 1; i++) {
            for (int j = i; j < index - 1; j++) {
                if (books[j].getInterest() > books[j + 1].getInterest()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    private static void deleteBook() {
        System.out.println("4. Xoa sach theo ma sach ");
        System.out.println("Nhap ma sach muon xoa");
        int indexDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < index; i++) {
            if (books[i].getBookId() == indexDelete) {
                System.out.println("Thong tin sach muon xoa");
                books[i].displayData();
                for (int j = 0; j < index; j++) {
                    books[j] = books[j + 1];
                }
                index--;
                return;
            }
        }
        System.out.println("Khong tim thay sach voi ma sach vua nhap");
    }

    private static void editBook() {
        System.out.println("3. Thay doi thong tin ");
        System.out.println("Nhap ma sach can thay doi");
        int indexEdit = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < index; i++) {
            check = true;
            if (books[i].getBookId() == indexEdit) {
                System.out.println("Thong tin sach can sua la: ");
                books[i].inputData();
                System.out.println("Nhap thong tin can sua");
                books[i].inputData();
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay ma sach");
        }
    }

    private static void displayAllBooks() {
        System.out.println("2. Hien thi tat ca sach trong thu vien");
        for (int i = 0; i < index; i++) {
            books[i].displayData();
        }
    }

    private static void addBook() {
        System.out.println("1. Them moi sach");
        System.out.println("Nhap so luong sach muon them moi");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap thong tin cuon sach thu " + (i + 1));
            //cach 1
//            books[index] = new Book();
//            books[index].inputData();
//            index++;

            //cach 2:
            Book book=new Book();
            book.inputData();
            books[index++]=book;

        }
        System.out.println("----------------------");
    }
}
