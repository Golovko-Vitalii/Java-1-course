package _module3.les_27_170118._circle_square;

public class AreaTest {
    public static void main(String[] args) {
        CircleThread c = new CircleThread();
        SquareThread s = new SquareThread();
        c.start();
        s.start();
    }
}
