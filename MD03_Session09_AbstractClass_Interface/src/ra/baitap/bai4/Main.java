package ra.baitap.bai4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 3.8);
        circle.display();
        circle.getArea();

        Rectangle rectangle=new Rectangle("green",3.6,4.7);
        rectangle.display();
        rectangle.getArea();
    }
}
