package ra.lession.advance.run;

import ra.lession.advance.bussinessImp.Catalog;
import ra.lession.advance.bussinessImp.Product;
import ra.lession.advance.config.Config;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuManagement {
    public static List<Catalog> catalogs = new ArrayList<>();

    static Catalog cat1 = new Catalog("Quan", 1, "Quan");
    static Catalog cat2 = new Catalog("Ao", 2, "Ao");
    static Catalog cat3 = new Catalog("Vay", 3, "Vay");

    static List<Product> products = new ArrayList<>();
    static Product pro1 = new Product("Ao somi", "Ao somi", "Ao somi", cat2, 190000);
    static Product pro4 = new Product("Ao hoa", "Ao hoa", "Ao somi", cat2, 180000);
    static Product pro2 = new Product("Quan dui", "Quan dui", "Quan dui", cat1, 168000);
    static Product pro3 = new Product("Vay hoa", "Vay hoa", "Vay hoa", cat3, 201000);


    public static void main(String[] args) {
        products.add(pro1);
        products.add(pro4);
        products.add(pro2);
        products.add(pro3);

        catalogs.add(cat1);
        catalogs.add(cat2);
        catalogs.add(cat3);

        do {
            int choice;
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm ");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm");
            System.out.println("5. Thoát ");

            System.out.println("*******************************");
            System.out.println("Nhap lua chon cua ban (1-5)");
            choice = Config.getValidateInt();

            switch (choice) {
                case 1:
                    CatalogManagement.addCatalog(catalogs);
                    break;
                case 2:
                    ProductManagement.addProduct(products);
                    break;
                case 3:
                    ProductManagement.sortProductByExportPrice();
                    break;
                case 4:
                    ProductManagement.searchProductByCatalogName();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang voi so vua nhap, vui long chon lai");
                    break;
            }
        } while (true);


    }
}
