package MD03_Session06_OOP_Class_Object_Lession.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    //1. Fields - ax2+bx+c=0
    private double a;
    private double b;
    private double c;

    //2. Constructors

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //3. phuong thuc getter cho a,b,c

    public double getA(double a) {
        return this.a;
    }

    public double getB(double b) {
        return this.b;
    }

    public double getC(double c) {
        return this.c;
    }


    //phuong thuc getDiscriminant() tra ve delta=b2-4ac
    public double getDiscriminant() {
        return b * b - (4 * a * c);
    }


    //Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình là:
    public double getRoot1() {
        return (-b + Math.pow((getDiscriminant()),0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }

    //phuong thuc kiem tra gia tri delta tu phong thuc getDiscriminant() de ket luan nghiem cua pt
    public void checkDelta() {
        double delta = getDiscriminant();
        double x = -b / (2 * a);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: " + x);
        } else if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem la: " + getRoot1() + " va " + getRoot2());
        }
    }


}
