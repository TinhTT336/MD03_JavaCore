package lesson3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread lazy = new Thread(new LazyPrimeFactorization());
        Thread optimize = new Thread(new OptimizedPrimeFactorization());

        lazy.start();
        lazy.join();
        System.out.println();
        System.out.println("----------------------------------");
        optimize.start();
        optimize.join();
    }
}
