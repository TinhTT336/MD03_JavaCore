package MD03_Session06_OOP_Class_Object_Lession.Fan;

public class Fan {
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //Phương thức khởi tạo không tham số tạo đối tượng fan mặc định

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    //Các getter và setter cho các thuộc tính

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
    public String toString() {
        String status = on ? "Fan is on" : "Fan is off";
        return "Fan{speed=" + speed + ", radius=" + radius + ", color='" + color + "', " + status + "}";
    }
    public void getSpeedString(){
        if(this.speed==1){
            System.out.println(getSLOW());
        } else if (this.speed==2) {
            System.out.println(getMEDIUM());
        } else if (this.speed==3) {
            System.out.println(getFAST());
        }
    }

}
