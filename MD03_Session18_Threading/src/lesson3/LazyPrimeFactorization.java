package lesson3;

import java.util.Date;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        System.out.println((System.currentTimeMillis()));
        //in 100 so nguyen to dau tien
        int count = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (count < 1000) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println((System.currentTimeMillis()));

    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
