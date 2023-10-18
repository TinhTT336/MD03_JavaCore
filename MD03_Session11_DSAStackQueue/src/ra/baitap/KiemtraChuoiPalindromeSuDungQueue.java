package ra.baitap;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class KiemtraChuoiPalindromeSuDungQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi muon kiem tra");
        String str = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i))){
                stack.push(Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(stack);

        boolean check = true;
        for (int i = 0; i < stack.size() / 2; i++) {
            if (stack.pop() != stack.get(i)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(" Chuoi: " + str + " la 1 chuoi Palindrome");
        } else {
            System.out.println(" Chuoi: " + str + " khong phai la 1 chuoi Palindrome");
        }
    }
}
