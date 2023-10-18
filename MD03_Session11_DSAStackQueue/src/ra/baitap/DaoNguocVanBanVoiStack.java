package ra.baitap;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocVanBanVoiStack {
    public static void main(String[] args) {
        //B1: tạo 1 stack để lưu trữ văn bản
        //
        //B2 tạo 1 biến numberOfWord để lưu số lượng các từ
        //
        //B3: tạo 1 vòng lặp for với số lần lặp = số lượng các từ, mỗi vòng lặp cho nhập 1 từ. rồi push vào stack.
        //
        //B4: tạo vòng lặp rồi in các từ trong stack ra bằng phương thức remove().

        Stack<String>stack=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong tu muon thao tac");
        int numberOfWord = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfWord; i++) {
            System.out.println("Nhap tu thu: "+(i+1));
            String str= scanner.nextLine();
            stack.push(str);
        }

        System.out.println("Chuoi sau khi dao nguoc la: ");
       while(!stack.isEmpty()){
           String w=stack.pop();
           System.out.println(w +"");
       }
    }

}
