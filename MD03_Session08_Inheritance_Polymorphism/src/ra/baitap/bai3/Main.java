package ra.baitap.bai3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point=new Point(3.5f,5.4f);
        System.out.println(point);

        point.setXY(3.6f,5.5f);
        System.out.println(Arrays.toString(point.getXY()));

        MovablePoint movablePoint=new MovablePoint(3.2f,3.6f,4.2f,4.7f);
        System.out.println(movablePoint);

        movablePoint.setSpeed(3.7f,4.7f);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        movablePoint.move().move().move();
    }
}
