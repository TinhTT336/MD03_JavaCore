package ra.lession.advance.bussinessImp;

import ra.lession.advance.business.IShop;
import ra.lession.advance.config.Config;
import ra.lession.advance.run.CatalogManagement;

import java.util.List;

import static ra.lession.advance.run.MenuManagement.catalogs;

public class Product implements IShop {
    //productId – Mã sản phẩm – int
    // ▪ productName – Tên sản phẩm – String
    // ▪ title – Tiêu đề sản phẩm – String
    // ▪ descriptions – mô tả sản phẩm – String
    // ▪ catalog – danh mục sản phẩm – Catalog
    // ▪ importPrice – giá nhập sản phẩm – float
    // ▪ exportPrice – giá bán sản phẩm - float
    //▪ productStatus – trạng thái sản phẩm – Boolean

    private int productId;
    static int count = 100;
    private double RATE = 1.3;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
        this.productId = Product.count++;
        this.productStatus = true;
    }

    public Product(String productName, String title, String descriptions, Catalog catalog, float importPrice) {
        this.productId = Product.count++;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = (float) (this.importPrice * RATE);
        this.productStatus = true;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
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

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {

    }

    public void inputData(List<Catalog> catalogs) {
        while (true) {
            System.out.println("Nhap ten san pham");
            this.productName = Config.scanner().nextLine();
            if (this.productName.isEmpty()) {
                System.out.println("Ten san pham khong duoc de trong");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Nhap tieu de san pham");
            this.title = Config.scanner().nextLine();
            if (this.title.isEmpty()) {
                System.out.println("Ten san pham khong duoc de trong");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Nhap mo ta san pham");
            this.descriptions = Config.scanner().nextLine();
            if (this.descriptions.isEmpty()) {
                System.out.println("Mo ta san pham khong duoc de trong");
            } else {
                break;
            }
        }
//        while (true) {
//            System.out.println("Danh muc san pham: ");
//            for (int i = 0; i < indexCat; i++) {
//                catalogs[i].displayData();
//            }
//            System.out.println("Chon ma danh muc san pham");
//            int catId = Config.getValidateInt();
//            boolean check=true;
//            for (Catalog cat : catalogs) {
//                check=false;
//                if (cat.getCatalogId() == catId) {
//                    this.catalog = cat;
//                    check=true;
//                    break;
//                }
//            }
//           if(!check){
//               System.out.println("Khong tim thay danh muc voi ma vua nhap");
//           }else{
//               break;
//           }
//        }

        System.out.println("Danh sach tat ca danh muc san pham");
        for (int i = 0; i < catalogs.size(); i++) {
            System.out.println(i + 1 + ". " + catalogs.get(i).getCatalogName());
        }

        System.out.println("Chon danh muc san pham theo so thu tu");
        int n = Config.getValidateInt();
        Catalog catalog1 = findCatByIndex(n);

        if (n >= 1 && n <= catalogs.size()) {
            this.catalog = catalogs.get(n - 1);
        } else {
            System.out.println("Khong co danh muc voi so vua chon");
            Catalog catalog2=new Catalog();
            catalog2.inputData();
            this.catalog=catalog2;
            return;
        }

//cach 2:
//        if (catalog1 == null) {
//            System.out.println("Khong co danh muc voi so vua chon");
//            CatalogManagement.addCatalog(catalogs);
//            catalog1 = findCatByIndex(n);
//        } else {
//            this.catalog = catalog1;
//        }


        System.out.println("Nhap gia nhap");
        this.importPrice = Float.parseFloat(Config.scanner().nextLine());

        this.exportPrice = (float) (this.importPrice * RATE);

    }

    @Override
    public void displayData() {
        System.out.printf("Ma san pham: %d - Ten san pham: %s - Ten danh muc: %s \n", this.productId, this.productName, this.catalog.getCatalogName());
        System.out.printf("Gia ban san pham: %.2f - Trang thai: %s  \n", this.exportPrice, (this.productStatus ? "Con hang" : "Het hang"));
    }

    public Catalog findCatByIndex(int n) {
        if (n >= 1 && n <= catalogs.size()) {
            this.catalog = catalogs.get(n - 1);
            return this.catalog;
        }
        return null;
    }
}
