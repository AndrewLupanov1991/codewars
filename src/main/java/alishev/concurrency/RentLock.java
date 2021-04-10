package alishev.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RentLock {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.thread1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.thread2();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(task.getCounter());

    }
}
class Task{

    private int counter;

    private Lock lock = new ReentrantLock();

    public void increment() {
        for (int i = 0; i <10000 ; i++) {
            counter++;
        }
    }
    public  void thread1() {
        lock.lock();
        increment();
        lock.unlock();
    }
    public  void thread2() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public int getCounter() {
        return counter;
    }
}
