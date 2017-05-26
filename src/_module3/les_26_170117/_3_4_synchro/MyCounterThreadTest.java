package _module3.les_26_170117._3_4_synchro;

public class MyCounterThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyCounterSynchro counterSynchro = new MyCounterSynchro();
        MyCounter counter = new MyCounter();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 200; i++) {
            new MyCounterThread(counterSynchro, counter).start();
            new Thread() {
                @Override
                public void run() {
                    BufferBuilder(stringBuffer, stringBuilder);
                }
            }.start();
        }
        for (int i = 0; i < 200; i++) {
            new MyCounterThread(counterSynchro, counter) {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counterSynchro.decValue();
                        counter.decValue();
                    }
                }
            }.start();
        }
        Thread.sleep(10000);
        System.out.println("-----------");
        System.out.println("Synchro counterSynchro.getValue() = " + counterSynchro.getValue());
        System.out.println("counter.getValue() = " + counter.getValue());
        System.out.println("Synchro stringBuffer.length() = " + stringBuffer.length());
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("END");
    }

    static void BufferBuilder(StringBuffer stringBuffer, StringBuilder stringBuilder) {
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append("i");//public synchronized StringBuffer append(String str)
            stringBuilder.append("i");//public StringBuilder append(String str)
        }
    }
}
