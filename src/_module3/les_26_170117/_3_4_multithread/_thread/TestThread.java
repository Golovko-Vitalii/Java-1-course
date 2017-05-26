package _module3.les_26_170117._3_4_multithread._thread;

public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Start Thread"+i);
            try {
                Thread.sleep(500);
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                System.out.println("Thread.currentThread().getState() = " + Thread.currentThread().getState());
                System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
                System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)  throws InterruptedException  {
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();
        Thread t3 = new TestThread();
        Thread t4 = new TestThread();
        Thread t5 = new TestThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("!!! - t1.getState() = " + t1.getState());
        t1.join();
        System.out.println("!!! - Thread.currentThread().getState() = " + Thread.currentThread().getState());
        System.out.println("!!! - t1.getState() = " + t1.getState());
        t5.start();
        t5.join();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("END?");
                System.out.println(Thread.currentThread().isInterrupted());
                throw new Exception();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("STOP!!");
                Thread.currentThread().stop();
            }
        }
    }
}
