package ra.baitap.bai1;


public class Main {
    public static void main(String[] args) {

        Shape[]shapes=new Shape[3];
        shapes[0]=new Circle(3.5);
        shapes[1]=new Rectangle(2.3, 5.8);

        for (Shape shape:shapes){
            double percent=Math.round(Math.random()*99+1);
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
