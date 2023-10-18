package MD03_Session06_OOP_Class_Object_Lession.Rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        //Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.getInput();
        rectangle.displaydata();
        System.out.println("Chu vi cua hinh chu nhat la: " + rectangle.getParameter());
        System.out.println("Dien tich cua hinh chu nhat la: " + rectangle.getArea());
    }
}
