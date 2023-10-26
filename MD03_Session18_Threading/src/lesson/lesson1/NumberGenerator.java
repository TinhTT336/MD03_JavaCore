package lesson.lesson1;

import static java.lang.System.currentTimeMillis;

public class NumberGenerator implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator2);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        int thread3 = Thread.MAX_PRIORITY;
        int thread4 = Thread.MIN_PRIORITY;
        System.out.println(thread3);
        System.out.println(thread4);

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i+" - "+hashCode());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //Tạo lớp NumberGenerator triển khai interface Runnable với phương thức run thực hiện một vòng lặp in ra 10 số tự nhiên đầu tiên và mỗi lần in cách nhau 500 milliseconds, cùng với thông tin hashCode của bản thân generator.
    //
    //Tạo 2 object của class Thread với tham số khởi tạo là 2 đối tượng NumberGenerator.
    //
    //Gọi phương thức start() cho cả 2 thread.
    //
    //Thử thay đổi priority của 2 thread, chẳng hạn Thread.MAX_PRIORITY và Thread.MIN_PRIORITY và chạy lại chương trình.
}
