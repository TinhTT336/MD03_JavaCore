package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Exam_Advance_1.ra.config.Config.scanner;

public class ProductManagement {
    public static List<Catalog> catalogs = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();


//    static{
//        Catalog catalog1=new Catalog("Quần",1,"Quần",true);
//        Catalog catalog2=new Catalog("Áo",2,"Aó",true);
//        Catalog catalog3=new Catalog("Váy",3,"Quần",true);
//
//        catalogs.add(catalog1);
//        catalogs.add(catalog2);
//        catalogs.add(catalog3);
//
//        Product product1=new Product("Quần đùi","Quần đùi","Quần đùi",catalog1,359000,true);
//        Product product2=new Product("Quần dài","Quần dài","Quần dài",catalog1,179000,true);
//        Product product3=new Product("Áo sơmi","Áo sơmi","Áo sơmi",catalog2,185000,true);
//        Product product4=new Product("Áo polo","Áo polo","Áo polo",catalog2,169000,true);
//        Product product5=new Product("Váy ngắn","Váy ngắn","Váy ngắn",catalog3,269000,true);
//        Product product6=new Product("Váy dài","Váy dài","Váy dài",catalog3,209000,true);
//
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//        products.add(product4);
//        products.add(product5);
//        products.add(product6);
//    }


    public static void main(String[] args) {
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm");
            System.out.println("5. Thoát");

            System.out.println("**************************************************************");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(scanner().nextLine());

            switch (choice) {
                case 1:
                    addCatalog();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    sortProductByImportPrice();
                    break;
                case 4:
                    findProductByCatName();
                    break;
                case 5:
                   System.exit(0);
                default:
                    System.out.println("Không có chức năng tương ứng với lựa chọn của bạn, vui lòng chọn lại");
                    break;
            }
        } while (true);
    }

    private static void findProductByCatName() {
        System.out.println("Nhập tên danh mục sản phẩm muốn tìm kiếm");
        String catName=scanner().nextLine();

        boolean check=false;
        for(Product product:products){
            if(product.getCatalog().getCatalogName().toLowerCase().contains(catName.toLowerCase())){
                System.out.println("Thông tin sản phẩm muốn tìm kiếm là: ");
                product.displayData();
                check=true;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy sản phẩm với tên danh mục vừa nhập");
        }
    }

    private static void sortProductByImportPrice() {
        Collections.sort(products,(p1,p2)-> (int) (p1.getImportPrice()-p2.getImportPrice()));

        System.out.println("Danh mục sản phẩm sau khi sắp xếp: ");
        for(Product product:products){
            product.displayData();
        }
    }

    private static void addProduct() {
        System.out.println("Nhập số lượng sản phẩm muốn thêm mới");
        int proNumber=Integer.parseInt(scanner().nextLine());

        for (int i = 0; i < proNumber; i++) {
            System.out.println("Thêm mới sản phẩm thứ "+(i+1));
            Product product=new Product();
            product.inputData();
           if(product.getCatalog()!=null){
               products.add(product);
           }
        }

        System.out.println("Danh sách tất cả sản phẩm: ");
        for(Product product:products){
            product.displayData();
        }
    }

    private static void addCatalog() {
        System.out.println("Nhập số lượng danh mục sản phẩm muốn thêm mới");
        int catNumber= Integer.parseInt(scanner().nextLine());

        for (int i = 0; i < catNumber; i++) {
            System.out.println("Thêm mới danh mục sản phẩm thứ "+(i+1));
            Catalog catalog=new Catalog();
            catalog.inputData();
            catalogs.add(catalog);
        }

        System.out.println("Danh sách danh mục sản phẩm: ");
        for(Catalog catalog:catalogs){
            catalog.displayData();
        }
    }
}
