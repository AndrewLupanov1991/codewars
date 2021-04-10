package alishev.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExServicePoll {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 50; i++) {
            executorService.submit(new Work(i));
        }

        executorService.shutdown();

        System.out.println("All tasks was submited");

        try {
            executorService.awaitTermination(1,TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Work implements Runnable{
    int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The Task : " + id + " was completed");
        long end = System.currentTimeMillis();

    }
}
