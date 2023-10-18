package ra.lession.advance.run;

import ra.lession.advance.bussinessImp.Product;
import ra.lession.advance.config.Config;

import java.util.Collections;
import java.util.List;

import static ra.lession.advance.run.MenuManagement.catalogs;
import static ra.lession.advance.run.MenuManagement.products;

public class ProductManagement {
    public static void addProduct(List<Product> productList) {
        System.out.println("Nhap so luong san pham muon them moi");
        int number = Config.getValidateInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Nhap san pham thu " + (i + 1));
            Product pro1 = new Product();
            pro1.inputData(catalogs);
            if (pro1.getCatalog() == null) {
                break;
            } else {
                productList.add(pro1);
            }

        }
        for (Product pro : productList) {
            pro.displayData();
        }
    }

    public static void sortProductByExportPrice() {
        Collections.sort(products, (p1, p2) -> (int) (p1.getExportPrice() - p2.getExportPrice()));

        System.out.println("Danh sach san pham sau khi sap xep theo gia tang dan: ");
        for (Product pro : products) {
            pro.displayData();
        }
    }

    public static void searchProductByCatalogName() {
        System.out.println("Nhap ten danh muc san pham muon tim kiem");
        String catName = Config.scanner().nextLine();
        boolean isNotFound = true;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCatalog().getCatalogName().toLowerCase().contains(catName.toLowerCase())) {
                products.get(i).displayData();
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println("Khong co san pham voi ten danh muc vua nhap");
        }
    }
}
