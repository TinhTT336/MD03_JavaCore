package MD03_Session06_OOP_Class_Object_Lession.Circle;

public class MainCircle {
    public static void main(String[] args) {
        //Circle
        Circle circle=new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("Chu vi cua hinh tron la: "+circle.calculateParameter());
        System.out.println("Dien tich cua hinh tron la: "+circle.calculateArea());
    }

}
