package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import static Exam_Advance_1.ra.config.Config.scanner;
import static Exam_Advance_1.ra.run.ProductManagement.catalogs;

public class Product implements IShop {
    private int productId;
    static int count = 10;

    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
        this.productId = Product.count++;
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

    public Product(String productName, String title, String descriptions, Catalog catalog, float importPrice, boolean productStatus) {
        this.productId = Product.count++;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = this.importPrice * RATE;
        this.productStatus = productStatus;


    }

    @Override
    public void inputData() {
        System.out.println("Nhập Tên sản phẩm");
        this.productName = scanner().nextLine();

        System.out.println("Nhập Tiêu đề sản phẩm ");
        this.title = scanner().nextLine();

        System.out.println("Nhập mô tả sản phẩm");
        this.descriptions = scanner().nextLine();

        System.out.println("Danh sách tất cả danh mục ");
        for (int i = 0; i < catalogs.size(); i++) {
            System.out.println("Danh mục thứ " + (i + 1) + "." + catalogs.get(i).getCatalogName());
        }
        System.out.println("Chọn danh mục sản phẩm");
        int n = Integer.parseInt(scanner().nextLine());

        //cach 1:
//        boolean isExit = false;
//        for (Catalog catalog : catalogs) {
//            isExit = false;
//            if (catalog.getCatalogId() == n) {
//                this.catalog = catalog;
//                isExit = true;
//                break;
//            }
//        }
//        if (!isExit) {
//            System.out.println("Không tìm thấy danh mục sản phẩm với mã vừa nhập, vui lòng thêm mới");
//            Catalog catalog1 = new Catalog();
//            catalog1.inputData();
//            catalogs.add(catalog1);
//            this.catalog=catalog1;
//        }

        //cach 2:
        if (n >= 1 && n <= catalogs.size()) {
            this.catalog = catalogs.get(n - 1);
        } else {
            System.out.println("Không tìm thấy danh mục sản phẩm với mã vừa nhập, vui lòng thêm mới");
            Catalog catalog2 = new Catalog();
            catalog2.inputData();
            catalogs.add(catalog2);
            this.catalog = catalog2;
        }

        System.out.println("Nhập giá nhập sản phẩm");
        this.importPrice = Float.parseFloat(scanner().nextLine());

        this.exportPrice = this.importPrice * RATE;

        System.out.println("Nhập trạng thái sản phẩm (true/false)");
        this.productStatus= Boolean.parseBoolean(scanner().nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Sản phẩm{" +
                "mã sản phẩm =" + productId +
                ", tên sản phẩm ='" + productName + '\'' +
                ", tên danh mục sản phẩm=" + catalog.getCatalogName() +
                ", giá bán sản phẩm=" + exportPrice +
                ", trạng thái=" + productStatus +
                '}');
    }


}
