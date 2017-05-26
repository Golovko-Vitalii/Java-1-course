package _module2.les_12_161215._2_5_abstract_class;

public class Point2D extends Point1D{
    private double y;

    public Point2D(String color, double x, double y) {
        super(color, x);
        this.y = y;
    }

    @Override
    public void show() {
        System.out.println("I am 2D point!");
    }
}
