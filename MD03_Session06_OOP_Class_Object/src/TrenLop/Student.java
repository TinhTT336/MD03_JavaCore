package TrenLop;

public class Student {
    //Fields - cac thuoc tinh cua class (attributes)
    String name;
    int age;
    boolean gender;
    String phoneNumber;
    String address;

//constructors - ham tao/ phuong thuc khoi tao

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void setAddress(String address){
        this.address=address;
    }

    String getName(){
        return this.name;
    }

    void displayBasicInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
