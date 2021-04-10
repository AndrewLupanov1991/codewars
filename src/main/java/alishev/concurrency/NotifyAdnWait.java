package alishev.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class NotifyAdnWait {

    public static void main(String[] args) throws InterruptedException {

        ProducerConsumer pr = new ProducerConsumer();
        Thread thread1 = new Thread(() -> {
            try {
                pr.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pr.consumer();
                } catch (InterruptedException e) {

                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class ProducerConsumer {

    private Queue<Integer> queue = new LinkedList();
    private final int LIMIT = 10;
   final Object lock = new Object();

    public void produce() throws InterruptedException {
        int digit = 0;
        while (true) {
            synchronized (lock) {
                if(queue.size() == LIMIT) {
                    System.out.println("Oчередь полна");
                    lock.wait();
                }
                queue.offer(digit++);
                System.out.println("Кладу элемент в очередь");
                Thread.sleep(1000);
                lock.notify();

            }
        }
    }

    public void consumer() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                if (queue.size() == 0) {
                    System.out.println("Oчередь пустая");
                    lock.wait();
                }
                System.out.println("Извлекаю элемент");
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Size of queue is " + queue.size());
                lock.notify();
            }
            Thread.sleep(2000);

        }

    }
}


