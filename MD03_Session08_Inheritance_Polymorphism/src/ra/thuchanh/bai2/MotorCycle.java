package ra.thuchanh.bai2;

public class MotorCycle extends Vehicle{
    public MotorCycle() {
    }

    public MotorCycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + this.getBrand() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
