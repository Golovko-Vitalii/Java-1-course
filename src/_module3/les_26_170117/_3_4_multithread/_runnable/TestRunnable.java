package _module3.les_26_170117._3_4_multithread._runnable;

public class TestRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Start Runnable"+i);
            try {
                Thread.sleep(500);
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                System.out.println("Thread.currentThread().getState() = " + Thread.currentThread().getState());
                System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
                System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable r1 = new TestRunnable();
        Runnable r2 = new TestRunnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        System.out.println("--------1--------");
        r1.run();
        r2.run();
        System.out.println("--------2--------");
        t1.start();
        t2.start();
    }
}
