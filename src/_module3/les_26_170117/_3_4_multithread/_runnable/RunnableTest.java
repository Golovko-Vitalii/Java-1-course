package _module3.les_26_170117._3_4_multithread._runnable;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable r1 = new Task1();
        Runnable r2 = new Task2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        //t1.run();// просто запустит выполнение блока run по очереди
        //t2.run();

        System.out.println("-----------");
        t1.start();
        t2.start();
    }
}
