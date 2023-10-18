package ra.thuchanh.bai4;

public class Circle extends Shape{
private double radius;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
    }

    public double getArea(){
        double PI=3.14;
        return PI*radius*radius;
    }

    public double getPerimeter(){
        double PI=3.14;
        return radius*2*PI;
    }
}
