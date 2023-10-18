package MD03_Session06_Practice.CategoryAndProduct;

public class Product {
    //1. Fields
    int productId;
    String productName;
    float productPrice;
    Category category;

    //2. Constructors

    public Product() {
    }

    public Product(int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    //3.Methods
    public void display() {
        System.out.println("Ma san pham: " + productId + "\n" +
                "Ten san pham: " + productName + "\n" +
                "Gia san pham: " + productPrice + "\n" +
                "Danh muc: " + category.categoryName+"\n");

    }



}
