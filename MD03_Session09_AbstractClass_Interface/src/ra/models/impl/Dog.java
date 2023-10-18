package ra.models.impl;

import ra.models.Animal;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Gau gau");
    }

    // 1 class ke thua 1 class abstract thi bat buoc phai trien khai (override tat ca cac phuong thuc cua class abstract)
    //1 class abstract ke thua 1 class abstract thi khong bat buoc phai trien khai cac phuong thuc cua class abstract
//1 lop truu tuong va 1 phuong thuc truu tuong khong di voi tu khoa final
}