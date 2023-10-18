package MD03_Session06_Practice.Calculator;

import java.util.Scanner;

public class Calculator {
    //1. Fields
    double a;
    double b;

    //2. Constructors

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //3. cac phuong thuc setter va getter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //4. Cac phuong thuc tinh toan
    public double add() {
        return a + b;
    }

    public double sub() {
        return a - b;
    }

    public double multi() {
        return a * b;
    }

    public double div() {
        return a / b;
    }



}
