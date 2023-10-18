package MD03_Session02_Lession;

public class TimSoNguyenDuongNhoNhatChiaHetCho5_7_11 {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                System.out.print("So nho nhat chia het cho 5,7,11 la: "+n);
                break;
            }
            n++;
        }
    }
}
