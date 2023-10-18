package ra.lession.advance1.entity;

import java.time.Year;

import static ra.lession.advance1.config.Config.scanner;

public class Employee {
    private int empId;
    static int count = 100;
    private String empName;
    private String birthyear;
    private String phone;
    private String email;
    private int empStatus;

    public Employee() {
        this.empId = Employee.count++;
    }

    public Employee(String empName, String birthyear, String phone, String email, int empStatus) {
        this.empId = Employee.count++;
        this.empName = empName;
        this.birthyear = birthyear;
        this.phone = phone;
        this.email = email;
        this.empStatus = empStatus;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(int empStatus) {
        this.empStatus = empStatus;
    }

    public void inputData() {
        while (true) {
            System.out.println("Nhap ten nhan vien");
            this.empName = scanner().nextLine();
            if (this.empName.length() < 10 || this.empName.length() > 50) {
                System.out.println(" Tên nhân viên có độ dài từ 10-50 ký tự");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Nhap nam sinh");
            this.birthyear= scanner().nextLine();
            if(this.birthyear.length()!=4||Integer.parseInt(this.birthyear)> Year.now().getValue()){
                System.out.println(" Năm sinh gồm 4 ký tự có giá trị nhỏ hơn năm hiện tại, vui long nhap lai");
            }else{
                break;
            }
        }
        while(true){
            System.out.println("Nhap so dien thoai");
            this.phone= scanner().nextLine();
            String regex="^0\\d{9,10}$";

            if(!this.phone.matches(regex)){
                System.out.println("So dien thoai bat dau bang 0 va co do dai 10-11 ky tu, vui long nhap lai");
            }else{
                break;
            }
        }

        while (true){
            System.out.println("Nhap dia chi email");
            this.email= scanner().nextLine();

            String regex="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
            if(!this.email.matches(regex)){
                System.out.println("Email khong dung dinh dang, vui long nhap lai");
            }else{
                break;
            }
        }

        System.out.println("Nhap trang thai nhan vien (1/2/3)");
        this.empStatus= Integer.parseInt(scanner().nextLine());
    }


    public void display() {
        System.out.printf("Ma NV: %s - Ten NV: %s - Nam sinh: %s - SDT: %s - Email: %s - Trang thai: %s \n",
                this.empId,this.empName,this.birthyear, this.phone,this.email,(this.empStatus==0?"Dang lam viec":(this.empStatus==1?"Nghi viec":"Nghi che do")));
    }
}
