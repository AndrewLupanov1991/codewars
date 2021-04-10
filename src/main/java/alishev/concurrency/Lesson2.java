package alishev.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker {
    Object lock1 = new Object();
    Object lock2 = new Object();
    Random random = new Random();

    List<Integer>list1 = new ArrayList<>();
    List<Integer>list2  =new ArrayList<>();

    public  void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));

        }
    }

    public synchronized void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));

        }
    }

    public  void work() {
        for(int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() {

    long start = System.currentTimeMillis();

    Thread thread1 = new Thread(() -> work());

    Thread thread2 = new Thread(() -> work());

    thread1.start();
    thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    long end = System.currentTimeMillis();

    System.out.println("Было затрачено времени " +"= " + (end - start));
    System.out.println(list1.size());
    System.out.println(list2.size());
    }

}




