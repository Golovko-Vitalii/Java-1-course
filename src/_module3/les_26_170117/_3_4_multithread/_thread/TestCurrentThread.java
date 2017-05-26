package _module3.les_26_170117._3_4_multithread._thread;

public class TestCurrentThread extends Thread{
    public static void main(String[] args) {
        Thread ct = Thread.currentThread();
        System.out.println("ct.getName() = " + ct.getName());
        System.out.println("ct.isAlive() = " + ct.isAlive());
        System.out.println("ct.getState() = " + ct.getState());
        System.out.println("ct.getPriority() = " + ct.getPriority());
        try {
            ct.sleep(2000);
            System.out.println("ct.getState() = " + ct.getState());
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("Things went wrong!!!");
        }
        System.out.println("Programm END!");
    }
}
