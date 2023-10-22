package ra.lession.advance1.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static ra.lession.advance1.config.Config.scanner;

public class Order {
    private String orderId;
    private int quantity;
    private String productId;
    private String created;

    // Định dạng ngày tháng
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private int userCreatedId;
    private String updated;
    private int userUpdatedId;
    private boolean orderType;
    private float price;
    private boolean orderStatus;

    public Order() {
        this.created = dateFormat.format(new Date());
    }

    public Order(String orderId, int quantity, String productId, int userCreatedId, String updated, int userUpdatedId, boolean orderType, float price, boolean orderStatus) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.productId = productId;
        this.created = dateFormat.format(new Date());
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


    public int getUserCreatedId() {
        return userCreatedId;
    }

    public void setUserCreatedId(int userCreatedId) {
        this.userCreatedId = userCreatedId;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
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

    public void inputData(List<Product> productList, List<Employee> employeeList) {
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

        while (true) {
            System.out.println("Chon ma san pham");
            String id = scanner().nextLine();
            boolean check = false;
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getProductId().equals(id)) {
                    this.productId = id;
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Ma san pham khong ton tai, vui long chon lai");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Danh sach tat ca nhan vien: ");
            for (Employee e : employeeList) {
                System.out.printf("Ma nhan vien: %d - Ten nhan vien: %s \n", e.getEmpId(), e.getEmpName());
            }

            System.out.println("Nhap ma nhan vien thuc hien");
            int userId = Integer.parseInt(scanner().nextLine());
            boolean check = false;
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getEmpId() == userId) {
                    this.userCreatedId = userId;
                    check = true;
                }
            }
            if (!check) {
                System.out.println("Ma nhan vien khong ton tai, vui long chon lai");
            } else {
                break;
            }
        }

        System.out.println("Nhap ngay cap nhat phieu");
        this.updated=dateFormat.format(new Date(scanner().nextLine()));

        while (true) {
            System.out.println("Danh sach tat ca nhan vien: ");
            for (Employee e : employeeList) {
                System.out.printf("Ma nhan vien: %d - Ten nhan vien: %s \n", e.getEmpId(), e.getEmpName());
            }

            System.out.println("Nhap ma nhan vien cap nhat");
            int userUpdateId = Integer.parseInt(scanner().nextLine());
            boolean check = false;
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getEmpId() == userUpdateId) {
                    this.userUpdatedId = userUpdateId;
                    check = true;
                }
            }
            if (!check) {
                System.out.println("Ma nhan vien khong ton tai, vui long chon lai");
            } else {
                break;
            }
        }
        System.out.println("Nhap loai phieu: ((true-phiếu nhập, false-phiếu xuất)");
        this.orderType= Boolean.parseBoolean(scanner().nextLine());

        while(true){
            System.out.println("Dien gia ");
            this.price= Float.parseFloat(scanner().nextLine());

            if(this.price<=0){
                System.out.println("Gia phai lon hon 0");
            }else{
                break;
            }
        }

        System.out.println("Nhap trang thai phieu: (true – hoạt động, false – bị hủy)");
        this.orderStatus= Boolean.parseBoolean(scanner().nextLine());


    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", quantity=" + quantity +
                ", productId='" + productId + '\'' +
                ", created='" + created + '\'' +
                ", dateFormat=" + dateFormat +
                ", userCreatedId=" + userCreatedId +
                ", updated='" + updated + '\'' +
                ", userUpdatedId=" + userUpdatedId +
                ", orderType=" + orderType +
                ", price=" + price +
                ", orderStatus=" + orderStatus +
                '}';
    }

    public void display() {
        System.out.printf("Ma phieu: %s - So luong: %d - Ma SP: %d - Ngay tao phieu: %s - NV tao phieu: %d \n " +
                "Ngay cap nhat phieu: %s - NV cap nhat: %d - Loai phieu: %s - Gia: %f - Trang thai phieu: %s \n",
                this.orderId,this.quantity,this.created,this.userCreatedId,this.updated,this.userUpdatedId,(this.orderType?"Phieu nhap":"Phieu xuat"), this.price, (this.orderStatus?"Hoat dong":"Bi huy"));
    }
}
