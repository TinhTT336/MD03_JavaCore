package MD03_Session04_Array_Practice;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        //khai bao mang chua danh sach sinh vien
        String[]students={"An","Binh","Mai","Hai","Hoa","Huong","Ha","Hung"};

        //khai bao bien luu ten tim kiem va gan gia tri nhap vao
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name's student");
        String input_name=scanner.nextLine();

        //duyet mang sinh vien da khai bao o tren, tim phan tu co gia tri bang voi ten da nhap vap
        boolean isExit=false;
        for(int i=0;i< students.length;i++){
            if(students[i].equals(input_name)){
                System.out.println("Position of the students in the list "+input_name+" is "+i);
                isExit=true;
                break;
            }
        }
        if(!isExit){
            System.out.println("Not found"+input_name+" in the list.");
        }

    }
}
