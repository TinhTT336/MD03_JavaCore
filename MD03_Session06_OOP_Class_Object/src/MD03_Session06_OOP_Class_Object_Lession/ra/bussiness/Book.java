package MD03_Session06_OOP_Class_Object_Lession.ra.bussiness;

import java.util.Scanner;

public class Book {
    //1. Fields
    private int bookId;
    private static int count=1;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private double interest;
    private int quantity;
    private boolean bookStatus;

    //2. Constructor

    public Book() {
        this.bookId = Book.count++;
    }

    public Book( String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = setInterest();
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    //3. Cac phuong thuc getter va setter

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public double getInterest() {
        return interest;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    //4.Phuong thuc inputData nhap thong tin tu ban phim
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap ten sach");
            this.bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                System.out.println("Ten sach khong duoc de trong, vui long nhap lai");
            }
        }
        while (bookName.isEmpty());

        do {
            System.out.println("Nhap ten tac gia");
            this.author = scanner.nextLine();
            if (author.isEmpty()) {
                System.out.println("Ten tac gia khong duoc de trong, vui long nhap lai");
            }else {
                break;
            }
        }
        while (true);

        do {
            System.out.println("Nhap mo ta sach");
            this.descriptions = scanner.nextLine();
            if (descriptions.isEmpty()) {
                System.out.println("Mo ta sach khong duoc de trong, vui long nhap lai");
            } else if (descriptions.length() < 10) {
                System.out.println("Mo ta sach it nhat 10 ky tu ");
            }else {
                break;
            }
        }while (true);

        do {
            System.out.println("Dien gia nhap");
            this.importPrice = Double.parseDouble(scanner.nextLine());
            if (importPrice < 0) {
                System.out.println("Gia nhap phai lon hon 0");
            }
        } while (importPrice < 0);

        do {
            System.out.println("Dien gia xuat");
           this.exportPrice = Double.parseDouble(scanner.nextLine());
            if (exportPrice < 1.2 * importPrice) {
                System.out.println("Gia xuat phai lon hon 1.2 lan gia nhap");
            }
        } while (exportPrice < 1.2 * importPrice);

        do {
            System.out.println("Nhap so luong sach");
           this.quantity = Integer.parseInt(scanner.nextLine());
            if (quantity > 0) {
                break;
            }
            System.out.println("So luong sach phai lon hon 0");
        } while (true);

        System.out.println("Nhap trang thai sach");
        this.bookStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    //phuong thuc tinh interest
    public double setInterest() {
        return (exportPrice - importPrice);
    }

    //phuong thuc displayData
    public void displayData(){
        System.out.printf("Ma sach: %d - Ten sach: %s - Ten tac gia: - %s \n" +
                "Mo ta sach: %s \n" +
                "Gia nhap: %.2f - Gia xuat: %.2f - Loi nhuan: %.2f \n" +
                "So luong: %d - Trang thai: %s \n \n",
                this.bookId,this.bookName,this.author,this.descriptions,this.importPrice,this.exportPrice,setInterest(),this.quantity,(bookStatus?"Con hang":"Het hang")
        );
    }

}
