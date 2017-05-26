package _module3.les_27_170118._circle_square;

public class SquareThread extends Thread {
    @Override
    public void run() {
        for (int i = 3; i < 18; i++) {
            System.out.println("Square area = " + i * i);
            System.out.println("Square perimeter = " + 4 * i);
            WriteToFile.writeToFile("Les_27.txt", "i = " + i + ", Square area = " + i * i);
            WriteToFile.writeToFile("Les_27.txt", "i = " + i + ", Square perimeter = " + 4 * i);
        }
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
