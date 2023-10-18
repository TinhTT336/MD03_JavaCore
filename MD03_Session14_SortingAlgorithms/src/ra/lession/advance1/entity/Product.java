package ra.lession.advance1.entity;

import static ra.lession.advance1.config.Config.scanner;

public class Product {
    private String productId;
    private String productName;
    private String manufacturer;
    private boolean productStatus;

    public Product() {
    }

    public Product(String productId, String productName, String manufacturer, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(){
        while(true){
            System.out.println("Nhap ma san pham");
            this.productId=scanner().nextLine();

            String regex="^[A-Z]{1}\\d{3}$";
            if(!this.productId.matches(regex)){
                System.out.println("Ma san pham gồm 4 ký tự, ký tự đầu tiên là ký tự chữ hoa (A-Z), vui long nhap lai");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Nhap ten san pham");
            this.productName= scanner().nextLine();
            if(this.productName.length()<=0){
                System.out.println("Ten san pham khong duoc de trong");
            }else{
                break;
            }
        }
        System.out.println("Nhap ten nha san xuat");
        this.manufacturer= scanner().nextLine();

        System.out.println("Nhap trang thai san pham (true/false)");
        this.productStatus= Boolean.parseBoolean(scanner().nextLine());
    }
    public void displayData(){
        System.out.printf("Ma san pham: %s - Ten san pham: %s - Nha san xuat: %s - Trang thai: %s",
                this.productId,this.productName,this.manufacturer,this.productStatus?"hoat dong":"khong hoat dong");
    }
}
