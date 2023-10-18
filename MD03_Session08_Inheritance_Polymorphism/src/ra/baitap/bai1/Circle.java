package ra.baitap.bai1;

public class Circle {
    private double radius;
    private String color;
    private double PI=3.14;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return PI*(this.radius*2);
    }
    public  double getPerimeter(){
        return PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                '}';
    }
}
