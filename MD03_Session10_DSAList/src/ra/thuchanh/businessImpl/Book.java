package ra.thuchanh.businessImpl;

import ra.thuchanh.business.IBook;

import java.util.Scanner;

public class Book implements IBook {
    Scanner scanner = new Scanner(System.in);
    private int bookId;
    private static int count = 1;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
        this.bookId = Book.count++;
        this.bookStatus=true;
    }

    public Book(String bookName, String title, int numberOfPages, float importPrice, float exportPrice, boolean bookStatus) {
        this.bookId = Book.count++;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = exportPrice - importPrice;
        this.bookStatus = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }


    @Override
    public void inputData() {
        while (true) {
            System.out.println("Nhap ten sach");
            this.bookName = scanner.nextLine();
            if (this.bookName.isEmpty()) {
                System.out.println("Ten sach khong duoc de trong");
            } else {
                System.out.println("Nhap tieu de sach");
                this.title = scanner.nextLine();
                if (this.title.isEmpty()) {
                    System.out.println("Ten tieu de khong duoc de trong");
                } else {
                    break;
                }
            }
        }

        System.out.println("Nhap so trang sach");
        this.numberOfPages= Integer.parseInt(scanner.nextLine());

        while(true){
            System.out.println("Nhap gia nhap");
            this.importPrice= Float.parseFloat(scanner.nextLine());
            if(this.importPrice<0){
                System.out.println("Gia nhap phai lon hon 0");
            }else{
                break;
            }
        }
        while(true){
            System.out.println("Nhap gia ban");
            this.exportPrice=Float.parseFloat(scanner.nextLine());
            if(this.exportPrice<1.2*this.importPrice){
                System.out.println("Gia ban phai lon hon gia nhap it nhat 1.2 lan");
            }else{
                break;
            }
        }


        this.interest=this.exportPrice-this.importPrice;
    }

    @Override
    public void displayData() {
        System.out.printf("Ma sach: %d - Ten sach: %s - Tieu de: %s - So trang sach: %d \n",this.bookId,this.bookName,this.title,this.numberOfPages);
        System.out.printf("Gia nhap: %.2f - Gia ban: %.2f - Loi nhuan: %.2f - Trang thai sach: %s \n",this.importPrice,this.exportPrice,this.exportPrice-this.importPrice,(this.bookStatus?"Con hang":"Het hang"));
    }
}
