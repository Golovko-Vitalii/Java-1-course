package _module3.les_26_170117._3_4_multithread._car;

public class t {
    public static void main(String[] args) {
        Runnable r = new Runnable() {// анонимный класс реализации интерфейса
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("yes!");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //Thread t1 = new Thread(r);t1.start();// или следующее
        new Thread(r).start();
        try {
            Thread.currentThread().sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Car() {
            @Override
            void m() {
                System.out.println("child of car");
            }
        }.m();
    }
}

class Car {
    void m() {
        System.out.println("car");
    }
}