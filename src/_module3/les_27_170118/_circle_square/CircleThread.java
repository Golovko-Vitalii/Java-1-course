package _module3.les_27_170118._circle_square;

public class CircleThread extends Thread {
    @Override
    public void run() {
        for (int i = 3; i < 18; i++) {
            System.out.println("Circle area = " + i * i * Math.PI);
            System.out.println("Circle length = " + 2 * i * Math.PI);
            WriteToFile.writeToFile("Les_27.txt", "i = " + i + ", Circle area = " + i * i * Math.PI);
            WriteToFile.writeToFile("Les_27.txt", "i = " + i + ", Circle length = " + 2 * i * Math.PI);
        }
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
