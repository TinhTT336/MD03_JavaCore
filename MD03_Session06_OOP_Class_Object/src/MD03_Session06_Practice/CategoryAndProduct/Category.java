package MD03_Session06_Practice.CategoryAndProduct;

public class Category {
    //1.Fields
    int categoryId;
    String categoryName;

    //2. Constructors


    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void display(){
        System.out.println("Ma danh muc: "+categoryId+"\n"+
        "Ten danh muc: "+categoryName);
    }
}
