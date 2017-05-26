package _module3.les_27_170118._3_4_daemon;

public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadDaemon thread = new ThreadDaemon();
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            Thread.sleep(500);
        }
        //thread.stop();//deprecated - плохой метод, убивает поаток не заканчивая действия
        System.out.println("main end");
    }
}
