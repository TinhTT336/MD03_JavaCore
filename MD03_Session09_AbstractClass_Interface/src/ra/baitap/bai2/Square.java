package ra.baitap.bai2;

public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getPerimeter(){
        return this.side*4;
    }
    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString() +", area: "+getArea()+", perimeter: "+getPerimeter();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
