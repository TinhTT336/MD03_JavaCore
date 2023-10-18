package UngDungDocSoThanhChu;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
//        Bước 1: Viết mã để chương trình hỏi số cần đọc

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hay nhap vao 1 so");
            int number = scanner.nextInt();

            //tach hang tram, hang chuc, hang don vi
            int hangTram = number / 100;
            int hangChu = number % 100;
            int hangChuc = number % 100 / 10;
            int hangDv = number % 10;

            String hangTramStr = "";
            String hangChuStr = "";
            String hangChucStr = "";
            String hangDvStr = "";

            //xu ly hang tram
            switch (hangTram) {
                case 1:
                    hangTramStr = "One hundred ";
                    break;
                case 2:
                    hangTramStr = "Two hundred ";
                    break;
                case 3:
                    hangTramStr = "Three hundred ";
                    break;
                case 4:
                    hangTramStr = "Four hundred";
                    break;
                case 5:
                    hangTramStr = "Five hundred";
                    break;
                case 6:
                    hangTramStr = "Six hundred ";
                    break;
                case 7:
                    hangTramStr = "Seven hundred ";
                    break;
                case 8:
                    hangTramStr = "Eight hundred ";
                    break;
                case 9:
                    hangTramStr = "Nine hundred ";
                    break;
                default:
                    break;
            }

            if (hangChu > 10 && hangChu < 20) {
                switch (hangChu) {
                    case 11:
                        hangChuStr = "eleven";
                        break;
                    case 12:
                        hangChuStr = "twelve";
                        break;
                    case 13:
                        hangChuStr = "thirteen";
                        break;
                    case 14:
                        hangChuStr = "fourteen";
                        break;
                    case 15:
                        hangChuStr = "fifthteen";
                        break;
                    case 16:
                        hangChuStr = "sixteen";
                        break;
                    case 17:
                        hangChuStr = "seventeen";
                        break;
                    case 18:
                        hangChuStr = "eighteen";
                        break;
                    case 19:
                        hangChuStr = "nineteen";
                        break;
                    default:
                        break;
                }
                System.out.println("So " + number + " doc la: " + hangTramStr + " and " + hangChuStr);
                System.exit(1);
            }


            switch (hangChuc) {
                case 2:
                    hangChucStr = "twenty";
                    break;
                case 3:
                    hangChucStr = "thirty";
                    break;
                case 4:
                    hangChucStr = "fourty";
                    break;
                case 5:
                    hangChucStr = "fifty";
                    break;
                case 6:
                    hangChucStr = "sixty";
                    break;
                case 7:
                    hangChucStr = "seventy";
                    break;
                case 8:
                    hangChucStr = "eighty";
                    break;
                case 9:
                    hangChucStr = "ninety";
                    break;
                default:
                    break;

            }

            switch (hangDv) {
                case 1:
                    hangDvStr = "one";
                    break;
                case 2:
                    hangDvStr = "two";
                    break;
                case 3:
                    hangDvStr = "three";
                    break;
                case 4:
                    hangDvStr = "four";
                    break;
                case 5:
                    hangDvStr = "five";
                    break;
                case 6:
                    hangDvStr = "six";
                    break;
                case 7:
                    hangDvStr = "seven";
                    break;
                case 8:
                    hangDvStr = "eight";
                    break;
                case 9:
                    hangDvStr = "nine";
                    break;
                default:
                    break;
            }
            if (hangChuc != 0) {
                hangTramStr += "and ";
            }
            System.out.println("So " + number + " doc la: " + hangTramStr + " " + hangChucStr + hangDvStr);
        }

    }

}
