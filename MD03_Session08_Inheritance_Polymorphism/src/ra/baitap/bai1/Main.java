package ra.baitap.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("*********Circle**********");
        Circle cirle=new Circle(3.5,"black");
        System.out.println(cirle.toString());
        System.out.println("Chu vi cua hinh tron: "+cirle.getPerimeter());
        System.out.println("Dien tich cua hinh tron: "+cirle.getArea());
        System.out.println();

        System.out.println("*********Cylinder**********");
        Cylinder cylinder=new Cylinder(3.5,"white",4);
        System.out.println(cylinder.toString());
        System.out.println("The tich cua hinh tru: "+cylinder.getVolume());
    }
}
