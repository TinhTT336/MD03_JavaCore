package ra.lession.advance.businessImp;

import ra.lession.advance.business.IEmployee;

public class Employee implements IEmployee {

    private String id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.status = status;
    }

    @Override
    public void inputData() {

    }


    @Override
    public void displayData() {
        System.out.printf("ID: %s - Ten: %s - Nam sinh: %s - He so luong: %f - Hoa hong: %f - Luong: %f - Trang thai: %s \n",
                this.id,this.name,this.year,this.rate,this.commission,this.rate*this.BASIC_SALARY*this.commission,this.status?"Dang lam viec":"Nghi viec");
    }
}
