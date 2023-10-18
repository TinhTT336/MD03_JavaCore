package MD03_Session02_Practice;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang can kiem tra (kg)");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap chieu cao can kiem tra (m)");
        double height = Double.parseDouble(scanner.nextLine());

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Hoi gay "+ bmi);
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Binh thuong "+ bmi);
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Hoi beo "+ bmi);
        } else {
            System.out.println("Beo phi "+ bmi);
        }
    }
}
