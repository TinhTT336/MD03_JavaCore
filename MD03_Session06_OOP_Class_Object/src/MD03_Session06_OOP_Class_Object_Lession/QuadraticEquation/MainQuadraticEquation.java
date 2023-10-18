package MD03_Session06_OOP_Class_Object_Lession.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        //QuadraticEquation
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap a");
        double a= scanner.nextDouble();
        System.out.println("Nhap b");
        double b= scanner.nextDouble();
        System.out.println("Nhap c");
        double c= scanner.nextDouble();

        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);

        quadraticEquation.checkDelta();

    }
}
