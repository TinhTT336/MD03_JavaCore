package ra.thuchanh.bai1;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public String makeSound() {
        return "Meo meo";
    }
}
