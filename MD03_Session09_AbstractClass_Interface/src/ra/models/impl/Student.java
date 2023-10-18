package ra.models.impl;

import ra.models.IUser;

public class Student implements IUser,IStudent {
    @Override
    public void display() {
        System.out.println("Hien thi voi nguoi dung la: "+username);
    }

    @Override
    public void learn() {

    }
}
