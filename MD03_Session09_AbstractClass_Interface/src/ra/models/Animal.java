package ra.models;

public abstract class Animal {
    private String name;

    public void eat(){
        System.out.println("Animal is eating...");
    }
    public abstract void makeNoise();
//phuong thuc abstract bat buoc phai nam trong class abstract va khong co phan than (phan ngoac nhon)

    public static void noti(){
        System.out.println("Animal notification");
    }


}
