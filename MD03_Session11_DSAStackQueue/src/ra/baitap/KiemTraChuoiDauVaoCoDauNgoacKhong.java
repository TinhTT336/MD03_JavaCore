package ra.baitap;

import java.util.*;

public class KiemTraChuoiDauVaoCoDauNgoacKhong {
    public static void main(String[] args) {
//        B1 : Tạo một stack rỗng để lưu trữ các dấu ngoặc.
//
//B2: Duyệt từng ký tự trong chuỗi đầu vào.
//
//B3: Nếu ký tự đang xét là một dấu ngoặc mở (như (, {, [), đưa nó vào stack.
//
//B4: Nếu ký tự đang xét là một dấu ngoặc đóng (như ), }, ]), lấy phần tử trên cùng của stack ra và so sánh với dấu ngoặc đóng.
// Nếu chúng không khớp, chuỗi không đúng. Nếu khớp, tiếp tục xét ký tự tiếp theo.
//
//B5: Nếu đã duyệt hết chuỗi và stack vẫn còn phần tử, chuỗi không đúng.

        Stack<Character> stack = new Stack<Character>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ky ty can kiem tra");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s == '(' || s == '{' || s == '[') {
                stack.push(s);
                System.out.println(stack);
            } else if (s == ')' || s == '}' || s == ']') {
                char popChar = stack.pop();
                if (!isMatchChar(popChar,s)) {
                    System.out.println("Cap ngoac khong khop, chuoi khong dung");
                    return;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println(" Chuoi khong dung");
        }else{
            System.out.println("Chuoi khop");
        }
    }

    public static boolean isMatchChar(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

}
