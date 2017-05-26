package _module3.les_26_170117._3_4_synchro;

public class MyCounterThread extends Thread {

    private MyCounterSynchro counterSynchro;
    private MyCounter counter;

    public MyCounterThread(MyCounterSynchro counterSynchro, MyCounter counter) {
        this.counterSynchro = counterSynchro;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counterSynchro.incValue();
            counter.incValue();
        }
    }
}
