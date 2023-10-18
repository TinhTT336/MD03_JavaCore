package MD03_Session06_OOP_Class_Object_Lession.Employee;

import java.util.Scanner;

public class Employee {
    //1.Fields
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    //2. phuong thuc khoi tao khong tham so va co tham so

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }
    // phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng trừ lương
    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma NV");
        employeeId= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten NV");
        employeeName= scanner.nextLine();
        System.out.println("Nhap tuoi NV");
        age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh NV");
        gen= Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhap he so luong NV");
        rate= Double.parseDouble(scanner.nextLine());
    }

    //phương thức displayData() cho phép hiển thị toàn bộ thông tin nhân viên
    public void displayData(){
        System.out.println("Thong tin cua NV la");
        System.out.print("Ma NV: "+employeeId+"\n"
        +"Ten NV: "+employeeName+"\n"+
                "Tuoi: "+age+"\n"+
                "Gioi tinh: "+(gen ?"Nam":"Nu")+"\n"+
                "He so luong: "+rate+"\n"+
        "Luong: "+ salary);
    }

    //phương thức calSalary() cho phép tính lương nhân viên theo công thức salary = rate * 1.300.000
public  double calSalary(){
        salary=(rate * 1300000);
        return salary ;
}


}
