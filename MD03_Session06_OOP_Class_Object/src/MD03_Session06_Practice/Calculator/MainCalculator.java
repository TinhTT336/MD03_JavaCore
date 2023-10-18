package MD03_Session06_Practice.Calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        //calculator
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Nhap so a");
        double a = scanner.nextDouble();

        System.out.println("Nhap so b");
        double b = scanner.nextDouble();

        calculator.setA(a);
        calculator.setB(b);

        System.out.println("Tong 2 so la: " + calculator.add());
        System.out.println("Hieu 2 so la: " + calculator.sub());
        System.out.println("Tich 2 so la: " + calculator.multi());
        System.out.println("Thuong 2 so la: " + calculator.div());

    }
}
