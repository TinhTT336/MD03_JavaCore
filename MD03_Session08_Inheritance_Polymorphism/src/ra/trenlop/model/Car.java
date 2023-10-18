package ra.trenlop.model;

public class Car {
    protected int wheelNumber=4;
    public void movement(){
        System.out.println("Movement");
    }

    public Car() {
    }

    public Car(String color) {
        System.out.println("Xe nay khong co mau");
    }
}
