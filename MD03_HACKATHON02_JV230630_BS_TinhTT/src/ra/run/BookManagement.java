package ra.run;

import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static ra.config.Config.scanner;

public class BookManagement {
    static List<Book> bookList = new ArrayList<>();

//    static {
//        Book book1 = new Book("Book1", "Book1", 34, 34000, 54000, true);
//        Book book2 = new Book("Book2", "Book2", 34, 33000, 54000, true);
//        Book book3 = new Book("Anh1", "Anh1", 34, 31000, 54000, true);
//        Book book4 = new Book("Anh2", "Anh3", 34, 35000, 54000, true);
//        Book book5 = new Book("Con mèo", "Con mèo", 34, 36000, 54000, true);
//        Book book6 = new Book("Con chó", "Con chó", 34, 30000, 54000, true);
//
//        bookList.add(book1);
//        bookList.add(book2);
//        bookList.add(book3);
//        bookList.add(book4);
//        bookList.add(book5);
//        bookList.add(book6);
//    }

    public static void main(String[] args) {
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số sách và nhập thông tin sách");
            System.out.println("2. Hiển thị thông tin các sách");
            System.out.println("3. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Tìm kiếm sách theo tên sách");
            System.out.println("6. Thay đổi trạng thái của sách theo mã sách");
            System.out.println("7. Thoát");

            System.out.println("************************************************************");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(scanner().nextLine());

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    sortBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    findBook();
                    break;
                case 6:
                    changeBookStatus();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Không có chức năng tương ứng với số vừa nhập, vui lòng chọn lại");
                    break;
            }

        } while (true);
    }

    private static void changeBookStatus() {
        System.out.println("Nhập mã sách muốn thay đổi trạng thái: ");
        int changedBookId = scanner().nextInt();

        for (Book book : bookList) {
            if (book.getBookId() == changedBookId) {
                System.out.println("Thông tin sách muốn thay đổi trạng thái: ");
                book.displayData();

                book.setBookStatus(!book.isBookStatus());
                System.out.println("Thay đổi trạng thái sách thành công");
                book.displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã sách vừa nhập");
    }

    private static void findBook() {
        System.out.println("Nhập tên sách muốn tìm kiếm: ");
        String bookName = scanner().nextLine();

        boolean check = false;
        for (Book book : bookList) {
            if (book.getBookName().toLowerCase().contains(bookName.toLowerCase())) {
                System.out.println("Thông tin sách muốn tìm: ");
                book.displayData();
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách với tên sách vừa nhập");
        }
    }

    private static void deleteBook() {
        System.out.println("Nhập mã sách muốn xoá");
        int deletedBookId = scanner().nextInt();

        for (Book book : bookList) {
            if (book.getBookId() == deletedBookId) {
                System.out.println("Thông tin sách muốn xoá: ");
                book.displayData();

                bookList.remove(book);
                System.out.println("Đã xoá thành công!");
                return;
            }
        }
        System.out.println("Không có sách với mã sách vừa nhập");
    }

    private static void sortBook() {
        //cach 1:
//        Collections.sort(bookList, (b1, b2) -> (int) -(b1.getInterest() - b2.getInterest()));

        //cach 2: sort bang Comparable
        Collections.sort(bookList);

        System.out.println("Danh sách tất cả sách sau khi sắp xếp:");
        for (Book book : bookList) {
            book.displayData();
        }
    }

    private static void displayBook() {
        System.out.println("Danh sách tất cả sách: ");
        for (Book book : bookList) {
            book.displayData();
        }
    }

    private static void addBook() {
        System.out.println("Nhập số lượng sách muốn thêm mới");
        int n = scanner().nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            Book book = new Book();
            book.inputData();
            bookList.add(book);
        }
    }
}



