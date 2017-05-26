package _module3.les_27_170118._3_4_threads;

public class AskMeNumber2 extends Thread {
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {//не прервали меня
            count++;
        }
    }
}
