public class Main extends Thread {
    private String name;

    public Main(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Main("thread1");
        System.out.println("Bat dau chay chuong trinh");
        thread1.start();
        thread1.join();
        Thread thread2 = new Main("thread2");
        thread2.start();
        thread2.join();

        System.out.println("Ket thuc chuong trinh");
    }

    @Override
    public void run() {
        int i = 1;
        while (i<20) {
            System.out.println(name+": "+(i++));
        }
    }
}