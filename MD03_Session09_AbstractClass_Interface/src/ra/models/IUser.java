package ra.models;

public interface IUser {
    //mac dinh access modifier trong interface la public

    int count=0;
    String username="Student";

    //de co the viet duoc body trong phuong thuc nam trong interface thi them tu khoa default
     default void login(String username){
         if(this.username.equals(username)){
             System.out.println("Dang nhap thanh cong");
             this.display();
         }else{
             System.out.println("Dang nhap that bai");
         }
     };
     void display();
     //phuong thuc static trong interface van phai co phan body
     static void noti(){
         System.out.println("Thong bao cho tat ca nguoi dung");
     };
}
