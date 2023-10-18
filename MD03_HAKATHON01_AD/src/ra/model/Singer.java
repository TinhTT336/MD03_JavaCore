package ra.model;

import java.util.Scanner;

public class Singer {
    Scanner scanner=new Scanner(System.in);
    private int singerId;
    private  static int count=1;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer() {
        this.singerId=Singer.count++;
    }

    public Singer(String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId=Singer.count++;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

//    public void setSingerId(int singerId) {
//        this.singerId = singerId;
//    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void inputData(){
        while(true){
            System.out.println("Nhập tên ca sĩ");
            this.singerName= scanner.nextLine();
            if(this.singerName.isEmpty()){
                System.out.println("Tên ca sĩ không được để trống");
            }else{
                break;
            }
        }

        while (true){
            System.out.println("Nhập tuổi ca sĩ");
            this.age= Integer.parseInt(scanner.nextLine());
            if(this.age<0){
                System.out.println("Tuổi phải lớn hơn 0");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Nhập quốc tịch");
            this.nationality= scanner.nextLine();
            if(this.nationality.isEmpty()){
                System.out.println("Quốc tịch không được để trống");
            }else{
                break;
            }
        }

        System.out.println("Nhập giới tính (true/false)");
        this.gender= Boolean.parseBoolean(scanner.nextLine());

        while(true){
            System.out.println("Nhập thể loại");
            this.genre= scanner.nextLine();
            if(this.genre.isEmpty()){
                System.out.println("Thể loại không được để trống");
            }else{
                break;
            }
        }

    }


    public void displayData(){
        System.out.println("Ca sĩ{" +
                "Ma ca sĩ =" + singerId +
                ", Tên ca sĩ ='" + singerName + '\'' +
                ", Tuổi =" + age +
                ", Quốc tịch ='" + nationality + '\'' +
                ", Giới tính =" + (gender?"Nam":"Nữ") +
                ", Thể loại ='" + genre + '\'' +
                '}');
    }
}
