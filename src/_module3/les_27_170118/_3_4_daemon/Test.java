package _module3.les_27_170118._3_4_daemon;

public class Test {
    public static void main(String[] args) {
        Thread deamon = new Thread(){
            @Override
            public void run() {
                for (int i=0;;i++) {
                    System.out.println("Thread.currentThread().isDaemon(), 300 ms = "+ Thread.currentThread().isDaemon() +", count i = "+ i);
                    try {
                        Thread.currentThread().sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println("deamon has benn stopped");
                    }
                }
            }
        };
        deamon.setDaemon(true);
        deamon.start();
        System.out.println("program'll be working 1000 ms, "+"Thread.currentThread().getName() = " + Thread.currentThread().getName());
        try {
            Thread.currentThread().sleep(1000);//1 s
            //Thread.currentThread().join();//all time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" end!");
    }
}
