package ra.thuchanh.bai1;

public class Main {
    public static void main(String[] args) {
        Animal animal1=new Animal("Pig");

        Dog dog1=new Dog("Becgie","black");
        Dog dog2=new Dog("Phoc","brown");

        Cat cat1=new Cat("Miumiu");

        //dung phuong thuc setName de thay doi thuoc tinh cua doi tuong
        System.out.println("Animal's name is: "+animal1.getAnimalName());

        animal1.setAnimalName("Bird");
        System.out.println("Animal's name is: "+animal1.getAnimalName());

        //truy cap phuong thuc duoc ke thua tu lop cha
        dog1.setAnimalName("corgi");
        System.out.println("dog1's name is: "+dog1.getAnimalName());
        System.out.println("dog1's color is: "+dog1.getColor());
        System.out.println("sound: "+dog1.makeSound());

        System.out.println("dog2's name is: "+dog2.getAnimalName());
        System.out.println("dog2's color is: "+dog2.getColor());

        System.out.println("cat1's name is: "+cat1.getAnimalName());
        System.out.println("sound: "+cat1.makeSound());

    }
}
