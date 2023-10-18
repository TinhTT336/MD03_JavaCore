package ra.thuchanh.bai1;

public class Dog extends Animal {
    private String color;

    public Dog(){

    }

    public Dog(String animalName) {
        super(animalName);
    }

    public Dog(String animalName, String color) {
        super(animalName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Gau gau";
    }
}
