package MD03_Session02_Lession;

import java.util.Scanner;

public class XacThucDuLieuDungVongLap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
double a,b,c;
double parameter;
double area;

while(true){
    System.out.println("Nhap vao 3 canh cua tam giac can kiem tra");
    a= scanner.nextDouble();
    b= scanner.nextDouble();
    c= scanner.nextDouble();
if(a>0&&b>0&&c>0&&(a+b)>c&&(a+c)>b&&(b+c)>a){
parameter=a+b+c;
area=Math.sqrt(parameter/2*(parameter/2-a)*(parameter/2-b)*(parameter/2-c));

    System.out.println("Chu vi hinh tam giac la: "+parameter);
    System.out.println("Dien tich hinh tam giac la "+area);
}else{
    System.out.println("3 so tren khong phai canh cua 1 tam giac, vui long nhap lai");
}
}

    }
}
