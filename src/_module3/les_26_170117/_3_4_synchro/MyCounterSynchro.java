package _module3.les_26_170117._3_4_synchro;

public class MyCounterSynchro {
    private long value = 0L;

    public long getValue() {
        return value;
    }

    public synchronized void incValue() {
        value++;
    }

    public synchronized void decValue() {
        value--;
    }
}
