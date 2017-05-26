package _module2.les_12_161215._2_5_shape;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                "} " + super.toString();
    }
}
