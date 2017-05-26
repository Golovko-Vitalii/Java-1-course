package _module3.les_27_170118._consumer_supplier;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(10);

        Producer p = new Producer(store);
        Consumer c1 = new Consumer(store);
        Consumer c2 = new Consumer(store);
        Consumer c3 = new Consumer(store);

        p.setDaemon(true);
        c1.setDaemon(true);
        c2.setDaemon(true);
        c3.setDaemon(true);
        p.start();
        c1.start();
        c2.start();
        c3.start();
        //store'll work for 1 min
        try {
            Thread.currentThread().sleep(60000);
            System.out.println("1 minute passed. Store is closed!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
