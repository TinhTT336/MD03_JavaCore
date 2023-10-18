package ra.trenlop.model1;

import java.util.Scanner;

public class User {
    Scanner scanner=new Scanner(System.in);
    private String name;
    private int id;
    static int count=1;
    private String password;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public User() {
        this.id=User.count++;
    }

    public User(String name, String password) {
        this.name = name;
        this.id=User.count++;
        this.password = password;
    }
    public void login(){
        while(true){
            System.out.println("Nhap ten dang nhap");
            this.name= scanner.nextLine();

            System.out.println("Nhap mat khau");
            this.password= scanner.nextLine();

            if(this.name.equals(getName())&&this.password.equals(getPassword())){
                System.out.println("Dang nhap thanh cong");
                displayData();
                return;
            }else{
                System.out.println("Ten dang nhap/ mat khau khong chinh xac");
            }
        }
    }



    public void displayData(){
        System.out.printf("Ten: %s - ID: %d  \n", this.getName(),this.id);

    }

}
