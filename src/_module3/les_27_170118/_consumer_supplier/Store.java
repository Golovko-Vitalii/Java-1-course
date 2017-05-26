package _module3.les_27_170118._consumer_supplier;

public class Store {
    private int count;

    public Store(int count) {
        this.count = count;
    }

    public synchronized void put() throws InterruptedException {
        count++;
        System.out.println("put! " + count + " items");
        Thread.sleep(500);
        notify();
    }

    public synchronized void get() throws InterruptedException {
        while (true) {
            if (count > 0) {
                count--;
                System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() +
                        " "+ Thread.currentThread().getName() + ", got one! left: " + count + " items");
                Thread.sleep(500);
                return;
            } else
                System.out.println("Wait please!!!!!!!!!!!!!!!!!!!!!!!!!!");
            wait();
        }
    }
}
