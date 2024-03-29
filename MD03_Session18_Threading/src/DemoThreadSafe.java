public class DemoThreadSafe extends Thread{
    private static int count=0;
    private  Object key;

    public DemoThreadSafe(Object key) {
        this.key =key;
    }

    public static void main(String[] args) throws InterruptedException {
        Object key1=new Object();
        Object key2=new Object();
        Object key3=new Object();
        Thread thread1=new DemoThreadSafe(key1);
        Thread thread2=new DemoThreadSafe(key2);
        Thread thread3=new DemoThreadSafe(key3);

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Da dem duoc: "+count);
    }
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
//           increase();
//            increase2();
//            display();
            increase3(key);
        }
    }

    private synchronized static void increase() {
        count++;
    }
    private static void increase2(){
        synchronized (DemoThreadSafe.class){// doi voi phuong thuc tinh (static) dung tu khoa class
            count++;
        }
    }
    private void display(){
        synchronized (this){ //doi voi phuong thuc khong tinh (non-static) dung tu khoa this
            count++;
        }
    }

    private static void increase3(Object key){
        synchronized (key){//
            count++;
        }
    }
}
