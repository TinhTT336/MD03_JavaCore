package MD03_Session06_Practice.CategoryAndProduct;

public class MainCategoryAndProduct {
    public static void main(String[] args) {
        //Product &&Category
        //tao 2 danh muc
        Category cat1=new Category(1,"quan");
        Category cat2=new Category(2,"ao");

        //tao san pham thuoc danh muc 1
        Product product1=new Product(1,"quan au",250000,cat1);
        Product product2=new Product(2,"quan jeans",350000,cat1);

        //tao san pham thuoc danh muc 2
        Product product3=new Product(3,"ao so mi",150000,cat2);
        Product product4=new Product(4,"ao polo",200000,cat2);

        //hien thi
        System.out.println("Tat ca san pham");
        product1.display();
        product2.display();
        product3.display();
        product4.display();

    }
}
