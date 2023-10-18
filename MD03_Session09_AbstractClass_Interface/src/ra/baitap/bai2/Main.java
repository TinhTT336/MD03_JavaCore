package ra.baitap.bai2;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square("yellow", true, 5.8);
        shapes[1] = new Square("green", false, 6.8);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape.isFilled()) {
                shape.howToColor();
            } else {
                System.out.println("No color");
            }
        }

//
    }
}
