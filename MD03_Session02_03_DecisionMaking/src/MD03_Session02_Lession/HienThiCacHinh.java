package MD03_Session02_Lession;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");

            System.out.println("Choose Menu");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Length");
                    int length = scanner.nextInt();

                    System.out.println("Enter width");
                    int width = scanner.nextInt();

                    for (int i = 1; i <= length; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    System.out.println("1. square triangle: top-left");
                    System.out.println("2. square triangle: top-right");
                    System.out.println("3. square triangle: bottom-left");
                    System.out.println("4. square triangle: bottom-right");
                    System.out.println("0. Exit");
                    System.out.println("Choose angles of triangle");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("*");
                            }
                            break;
                        case 2:
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= 5 - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print(" *");
                                }
                                System.out.println(" ");
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= 5; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print("* ");
                                }
                                System.out.println(" ");
                            }
                            break;
                        case 4:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= 5 - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print(" *");
                                }
                                System.out.println(" ");
                            }
                            break;
                        case 0:
                            System.exit(0);

                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 0:
                    System.exit(0);

            }
        }

    }
}
