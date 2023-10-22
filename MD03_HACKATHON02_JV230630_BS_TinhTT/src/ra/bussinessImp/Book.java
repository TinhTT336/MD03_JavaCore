package ra.bussinessImp;

import ra.bussiness.IBook;

import static ra.config.Config.scanner;

public class Book implements IBook,Comparable<Book> {
    private int bookId;
    static int count = 100;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
        this.bookId = Book.count++;
    }

    public Book(String bookName, String title, int numberOfPages, float importPrice, float exportPrice, boolean bookStatus) {
        this.bookId = Book.count++;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest=exportPrice-importPrice;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }



    public String getBookName() {
        return bookName;
    }


    public float getInterest() {
        return interest;
    }


    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
        System.out.println("Nhập tên sách");
        this.bookName = scanner().nextLine();

        System.out.println("Nhập tiêu đề sách");
        this.title = scanner().nextLine();

        System.out.println("Nhập số trang sách");
        this.numberOfPages = Integer.parseInt(scanner().nextLine());

        System.out.println("Nhập giá nhập");
        this.importPrice = Float.parseFloat(scanner().nextLine());

        System.out.println("Nhập giá bán");
        this.exportPrice = Float.parseFloat(scanner().nextLine());

        this.interest = this.exportPrice - this.importPrice;

        System.out.println("Nhập trạng thái sách (true/false)");
        this.bookStatus= Boolean.parseBoolean(scanner().nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Sách{" +
                "Mã sách =" + bookId +
                ", Tên sách ='" + bookName + '\'' +
                ", Tiêu đề ='" + title + '\'' +
                ", Số trang sách =" + numberOfPages +
                ", Giá nhập =" + importPrice +
                ", Giá bán =" + exportPrice +
                ", Lợi nhuận =" + interest +
                ", Trạng thái sách =" + (bookStatus?"Còn hàng":"Hết hàng") +
                '}');
    }

    @Override
    public int compareTo(Book o) {
        return (int) -(this.interest-o.getInterest());
    }
}
