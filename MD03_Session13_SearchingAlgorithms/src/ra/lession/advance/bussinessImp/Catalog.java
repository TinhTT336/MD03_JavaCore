package ra.lession.advance.bussinessImp;

import ra.lession.advance.business.IShop;
import ra.lession.advance.config.Config;

public class Catalog implements IShop {

    private int catalogId;
    static int count = 1;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {
        this.catalogId = Catalog.count++;
        this.catalogStatus = true;
    }

    public Catalog(String catalogName, int priority, String descriptions) {
        this.catalogId = Catalog.count++;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = true;
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
        while (true) {
            System.out.println("Nhap ten danh muc san pham");
            this.catalogName =Config.scanner().nextLine();

            if (this.catalogName.isEmpty()) {
                System.out.println("Ten danh muc san pham khong duoc de trong");
            } else {
                break;
            }
        }

        System.out.println("Nhap do uu tien");
        this.priority = Config.getValidateInt();


        while (true) {
            System.out.println("Nhap mo ta danh muc");
            this.descriptions =Config.scanner().nextLine();

            if (this.descriptions.isEmpty()) {
                System.out.println("Mo ta khong duoc de trong");
            } else {
                break;
            }
        }


    }

    @Override
    public void displayData() {
        System.out.printf("Ma danh muc: %d - Ten danh muc: %s \n",this.catalogId,this.catalogName);
    }
}
