package ra.trenlop.queue;

import java.util.PriorityQueue;

public class DemoQueue {
    public static void main(String[] args) {
        PriorityQueue<String>queue=new PriorityQueue<>();

        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");

        System.out.printf("Poll phan tu %s trong queue \n",queue.poll());
        System.out.printf("Peek cua queue la: \n",queue.peek());
    }
}
