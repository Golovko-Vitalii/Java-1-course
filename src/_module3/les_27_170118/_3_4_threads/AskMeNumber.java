package _module3.les_27_170118._3_4_threads;

public class AskMeNumber extends Thread {
    private int count = 0;
    private boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }//1

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (!stop) {
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //stop = true;
                return;// stop while
            }
        }
    }
}
