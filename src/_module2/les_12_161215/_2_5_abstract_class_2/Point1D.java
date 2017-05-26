package _module2.les_12_161215._2_5_abstract_class_2;

public class Point1D extends Point {
    private double x;

    public Point1D(String color, double x) {
        super(color);
        this.x = x;
    }

    @Override
    public void show() {
        System.out.println("I am 1D point!");
    }

}
