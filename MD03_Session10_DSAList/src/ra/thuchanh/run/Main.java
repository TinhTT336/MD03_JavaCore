package ra.thuchanh.run;

import ra.thuchanh.businessImpl.Book;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Book> arrBook = new ArrayList<>();
    static int index = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1: Nhập số sách (n) cần nhập thông tin từ bàn phím và thực hiện nhập thông tin cho n sách đó");
            System.out.println("2: Hiển thiện thông tin sách cho tất cả sách đang lưu trữ");
            System.out.println("3: Sử dụng Comparable để cài đặt sắp xếp giảm dần theo lợi nhuận cho các sách đang lưu trữ");
            System.out.println("4: Nhập mã sách cần xóa từ bàn phím, thực hiện xóa sách trong danh sách");
            System.out.println("5: Nhập tên sách từ bàn phím, thực hiện tìm và in ra sách có tên phù hợp");
            System.out.println("6: Nhập vào mã sách, thay đổi trạng thái sách (false -true)");
            System.out.println("7: Thoát khỏi chương trình");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Main.addBook();
                    break;
                case 2:
                    Main.displayAllBook();
                    break;
                case 3:
                    Main.sortByInterestDecrease();
                    break;
                case 4:
                    Main.deleteBookById();
                    break;
                case 5:
                    Main.findBookByBookName();
                    break;
                case 6:
                    Main.changeBookStatus();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang nao phu hop voi lua chon cua ban, vui long chon lai");
                    break;
            }
        } while (true);
    }

    private static void changeBookStatus() {
        System.out.println("Nhap vao ma sach muon thay doi trang thai");
        int changeStatusId = Integer.parseInt(scanner.nextLine());
//cach 1:
//        for (int i = 0; i < index; i++) {
//            if (arrBook.get(i).getBookId() == changeStatusId) {
//                arrBook.get(i).setBookStatus((!arrBook.get(i).isBookStatus()));
//                arrBook.get(i).displayData();
//                return;
//            }
//        }

        //cach 2:
        int id = findIndex(changeStatusId);
        if (id != -1) {
            arrBook.get(id).displayData();
            arrBook.get(id).setBookStatus((!arrBook.get(id).isBookStatus()));
            arrBook.get(id).displayData();
            return;
        }
        System.out.println("Khong tim thay sach voi ten sach vua nhap");
    }

    private static void findBookByBookName() {
        System.out.println("Nhap ten sach muon tim kiem");
        String bookName = scanner.nextLine();
        for (int i = 0; i < index; i++) {
            if (arrBook.get(i).getBookName().toLowerCase().contains(bookName.toLowerCase())) {
                arrBook.get(i).displayData();
            }
        }
        System.out.println("Khong tim thay sach voi ten sach vua nhap");
    }

    private static void deleteBookById() {
        System.out.println("Nhap vao ma sach muon xoa");
        int deleteBookId = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < index; i++) {
            if (arrBook.get(i).getBookId() == deleteBookId) {
                System.out.println("Thong tin sach muon xoa: ");
                arrBook.get(i).displayData();
                arrBook.remove(arrBook.get(i));
                index--;
                return;
            }
        }
        System.out.println("Khong tim thay sach voi id vua nhap");
    }

    private static void sortByInterestDecrease() {
        Collections.sort(arrBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o2.getInterest() - (o1.getInterest()));
            }
        });
        System.out.println("Danh sach sau khi sap xep theo loi nhuan giam dan: ");
        for (int i = 0; i < index; i++) {
            arrBook.get(i).displayData();
        }
    }

    private static void displayAllBook() {
        for (int i = 0; i < index; i++) {
            arrBook.get(i).displayData();
        }

    }

    private static void addBook() {
        System.out.println("Nhap so luong sach muon them moi");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Them moi sach thu " + (i + 1));
            Book book1 = new Book();
            book1.inputData();
            index++;
            arrBook.add(book1);
        }
    }

    private static int findIndex(int id) {
        for (int i = 0; i < index; i++) {
            if (arrBook.get(i).getBookId() == id) {
                return i;
            }
        }
        return -1;
    }

}
