package ra.thuchanh.bai2;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Toyota","white");
        Car car2=new Car("Huyndai","black");

        System.out.println("car1's brand is: "+car1.getBrand());
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        MotorCycle motorCycle1=new MotorCycle("Honda","red");
        MotorCycle motorCycle2=new MotorCycle("Yamaha","blue");
        System.out.println(motorCycle1.toString());
        System.out.println(motorCycle2.toString());
    }
}
