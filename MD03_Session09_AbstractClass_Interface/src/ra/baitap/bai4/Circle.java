package ra.baitap.bai4;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double PI = 3.14;
        double area = PI * this.radius * this.radius;
        System.out.println("Area of circle: "+area);
    }

}
