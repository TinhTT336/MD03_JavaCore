package ra.baitap.bai4;

public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
    public abstract void getArea();
    public void display(){
        System.out.println("Color: "+this.color);
    }


}
