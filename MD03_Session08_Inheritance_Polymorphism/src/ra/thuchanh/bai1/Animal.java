package ra.thuchanh.bai1;

public class Animal {
    private String animalName;

    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String makeSound(){
        return "";
    }
}
