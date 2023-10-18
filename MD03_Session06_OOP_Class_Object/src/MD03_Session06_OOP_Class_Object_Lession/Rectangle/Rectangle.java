package MD03_Session06_OOP_Class_Object_Lession.Rectangle;

import java.util.Scanner;

public class Rectangle {
//1.Fields
    double width;
    double height;

    //2. Constructors
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //3. Methods


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getParameter(){
        return (width+height)*2;
    }

    public double getArea(){
        return width*height;
    }

    public void displaydata(){
        System.out.println("Hinh chu nhat co cac kich thuoc: chieu dai - "+this.height+", chieu rong - "+this.width);
    }

    public void getInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap kich thuoc chieu dai hinh chu nhat");
        this.height=scanner.nextDouble();

        System.out.println("Nhap kich thuoc chieu rong hinh chu nhat");
        this.width= scanner.nextDouble();
    }


}
