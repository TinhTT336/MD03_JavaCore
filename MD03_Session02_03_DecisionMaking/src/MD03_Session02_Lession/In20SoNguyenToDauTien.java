package MD03_Session02_Lession;

public class In20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;

        while (count < 20) {
            boolean isPrime = true;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }

    }
}

