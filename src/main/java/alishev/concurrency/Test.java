package alishev.concurrency;

public class Test {
    private  int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
       test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for(int i = 0;i < 10000; i++){
                addCount();
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i = 0;i < 10000; i++){
                addCount();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    private synchronized void addCount() {
        counter++;
    }
}
