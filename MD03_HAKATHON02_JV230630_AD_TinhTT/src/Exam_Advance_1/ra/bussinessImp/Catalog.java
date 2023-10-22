package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import static Exam_Advance_1.ra.config.Config.scanner;

public class Catalog implements IShop {
    private int catalogId;
    static int count =1;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {
        this.catalogId=Catalog.count++;
    }

    public Catalog( String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = Catalog.count++;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        System.out.println("Nhập Tên danh mục sản phẩm");
        this.catalogName=scanner().nextLine();

        System.out.println("Nhập Độ ưu tiên");
        this.priority= Integer.parseInt(scanner().nextLine());

        System.out.println("Nhập Mô tả danh mục");
        this.descriptions=scanner().nextLine();

        System.out.println("Nhập Trạng thái danh mục (true/false)");
        this.catalogStatus= Boolean.parseBoolean(scanner().nextLine());
    }


    @Override
    public void displayData() {
        System.out.println( "Catalog{" +
                "Mã danh mục sản phẩm =" + catalogId +
                ", Tên danh mục sản phẩm ='" + catalogName + '\'' +
                ", Độ ưu tiên =" + priority +
                ", Mô tả danh mục ='" + descriptions + '\'' +
                ", Trạng thái danh mục =" + catalogStatus +
                '}');
    }
}
