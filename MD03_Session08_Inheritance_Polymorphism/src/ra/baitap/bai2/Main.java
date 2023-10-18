package ra.baitap.bai2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************Point2D**************");
        Point2D point2D = new Point2D(3.4f, 2.6f);
        System.out.println("point2D: \n" + point2D);
        point2D.setXY(4.0f, 3.4f);
        System.out.println(Arrays.toString(point2D.getXY()));

        System.out.println("*************Point3D**************");
        Point3D point3D = new Point3D(3.9f);
        System.out.println("point3D: \n" + point3D);

        Point3D point3D1=new Point3D(4.5f,3.7f,3.9f);
        System.out.println("point3D1: \n" + point3D1);

        point3D1.setXYZ(4.5f);
        System.out.println(Arrays.toString(point3D1.getXYZ()));



    }
}
