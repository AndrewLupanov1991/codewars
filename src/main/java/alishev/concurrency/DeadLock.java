package alishev.concurrency;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class Runner {
    Random random = new Random();
    private Accaunt accaunt1 = new Accaunt();
    private Accaunt accaunt2 = new Accaunt();
    private void takelock(Lock lock1, Lock lock2) throws InterruptedException {
        boolean firsLock = false;
        boolean secondLock = false;
        while (true) {
            try {
                firsLock = lock1.tryLock();
                secondLock = lock2.tryLock();
            }
            finally {
                if (firsLock && secondLock == true){
                    return;
                }
                if(firsLock == true) {
                    lock1.unlock();
                }else if(secondLock == true) {
                    lock2.unlock();
                }
            }
            Thread.sleep(1);

        }




    }

    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

    public void firstThread() throws InterruptedException {
        for (int i = 0; i <10000 ; i++) {
            takelock(lock1,lock2);
           try {
               Accaunt.transfer(accaunt1, accaunt2, random.nextInt(100));
           }
           finally {
               lock1.unlock();
               lock2.unlock();
           }

        }
    }

    public void secondThread() throws InterruptedException {
        for (int i = 0; i <10000 ; i++) {
           takelock(lock2,lock1);
            try {
                Accaunt.transfer(accaunt2, accaunt1, random.nextInt(100));
            }
            finally {
                lock2.unlock();
                lock1.unlock();
            }

        }

    }

    public void finished() {
        System.out.println(accaunt1.getBalance());
        System.out.println(accaunt2.getBalance());
        System.out.println("Common balance =" +(accaunt1.getBalance() + accaunt2.getBalance()));

    }

}
class Accaunt {
    private int balance = 10000;

    public void deposit(int sum) {
        balance+=sum;
    }

    public void withdraw(int sum) {
        balance-=sum;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Accaunt ac1, Accaunt ac2, int amount) {
        ac1.withdraw(amount);
        ac2.deposit(amount);
    }


}
