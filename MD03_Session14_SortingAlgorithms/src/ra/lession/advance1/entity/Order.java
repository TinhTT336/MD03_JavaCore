package ra.lession.advance1.entity;

import java.util.Date;
import java.util.List;

import static ra.lession.advance1.config.Config.scanner;

public class Order {
    private String orderId;
    private int quantity;
    private String productId;
    private Date created;
    private int userCreatedId;
    private Date updated;
    private int userUpdatedId;
    private boolean orderType;
    private float price;
    private boolean orderStatus;

    public Order() {
    }

    public Order(String orderId, int quantity, String productId, Date created, int userCreatedId, Date updated, int userUpdatedId, boolean orderType, float price, boolean orderStatus) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.productId = productId;
        this.created = created;
        this.userCreatedId = userCreatedId;
        this.updated = updated;
        this.userUpdatedId = userUpdatedId;
        this.orderType = orderType;
        this.price = price;
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getUserCreatedId() {
        return userCreatedId;
    }

    public void setUserCreatedId(int userCreatedId) {
        this.userCreatedId = userCreatedId;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getUserUpdatedId() {
        return userUpdatedId;
    }

    public void setUserUpdatedId(int userUpdatedId) {
        this.userUpdatedId = userUpdatedId;
    }

    public boolean isOrderType() {
        return orderType;
    }

    public void setOrderType(boolean orderType) {
        this.orderType = orderType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void inputData(List<Product> productList) {
        while (true) {
            System.out.println("Nhap ma phieu");
            this.orderId = scanner().nextLine();

            String regex = "^(PN|PX)-\\\\d{2}(0[1-9]|1[0-2])-([0-9]{2})$";
            if (!this.orderId.matches(regex)) {
                System.out.println("Ma phieu bat dau bang PN/PX- 2 ky tu nam, 2 ky tu thang- 2 ky tu cuoi tang dan tu 01");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Nhap so luong phieu");
            this.quantity = Integer.parseInt(scanner().nextLine());
            if (this.quantity <= 0) {
                System.out.println("So luong phieu phai lon hon 0");
            } else {
                break;
            }
        }
        System.out.println("Danh sach san pham: ");
        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("STT: %d - Ma san pham %s - Ten san pham: %s \n", (i + 1), productList.get(i).getProductId(), productList.get(i).getProductName());

        }

        System.out.println("Chon ma san pham");
        String id = scanner().nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProductId().equals(id)){
                this.productId=id;
            }
        }
    }

    public void display() {

    }
}
