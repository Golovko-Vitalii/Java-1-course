package _module3.les_26_170117._3_4_multithread._thread;

public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread11 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread2 myThread22 = new MyThread2();

        System.out.println("Start!");
        System.out.println(myThread1.getState());
        System.out.println(myThread11.getState());
        System.out.println(myThread2.getState());
        System.out.println(myThread22.getState());
        System.out.println(Thread.currentThread().getState());

        myThread1.start();
        myThread11.start();
        myThread2.start();
        myThread22.start();

        System.out.println("myThread1.getName() = "+myThread1.getName());
        System.out.println("myThread1.getPriority() = "+myThread1.getPriority());
        System.out.println("myThread1.isAlive() = "+myThread1.isAlive());
        System.out.println("myThread2.getName() = "+myThread2.getName());
        System.out.println("myThread2.getPriority() = "+myThread2.getPriority());
        System.out.println("myThread2.isAlive() = "+myThread2.isAlive());

        myThread1.join();
        myThread11.join();
        myThread2.join();
        myThread22.join();

        System.out.println(myThread1.getState());
        System.out.println(myThread11.getState());
        System.out.println(myThread2.getState());
        System.out.println(myThread22.getState());
        System.out.println(Thread.currentThread().getState());

        System.out.println("End!");
        System.out.println(Thread.currentThread().getState());
    }
}
