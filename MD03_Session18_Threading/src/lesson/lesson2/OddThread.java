package lesson.lesson2;

public class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
