import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeStringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can chuyen doi");
        String str = scanner.nextLine();
        changeStringtoInteger(str);
    }

    public static void changeStringtoInteger(String str) {
        List<Integer> listInt = new ArrayList<>();
        String[] strArr = str.split(" ");
        for (String s : strArr) {
            try {
                int number = Integer.parseInt(s);
                listInt.add(number);
            } catch (NumberFormatException e) {
                listInt.add(0);
                System.out.println("Ky tu " + s + " khong phai so nguyen va duoc thay the bang so 0");
            }
        }
    }
}
