package ra.trenlop.model.impl;

import ra.trenlop.model.Car;

public class SportCar extends Car {

    public SportCar() {
    }

    public SportCar(String color) {
        super(color);
    }

    public void test(){
     if(super.wheelNumber==4){
         System.out.println("Test so luong banh xe ok");
     }
     super.movement();
 }

}
