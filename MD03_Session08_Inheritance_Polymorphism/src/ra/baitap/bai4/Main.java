package ra.baitap.bai4;

import ra.thuchanh.bai4.Shape;
import ra.thuchanh.bai4.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------SHAPE----------");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        System.out.println("---------TRIANGLE----------");

        Triangle triangle=new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3,5,7);
        System.out.println(triangle);

        triangle = new Triangle("red",true,4,5,6);
        System.out.println(triangle);
        System.out.println("Area of triangle: "+triangle.getArea());
        System.out.println("Perimeter of triangle: "+triangle.getPerimeter());
    }
}
