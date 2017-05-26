package _module2.les_10_161213._2_3_inheritance._shape;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }
    //ctrl+o

    @Override
    public void show() {
        System.out.println("I am Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" + getColor() +
                "a= " + a +
                ", b= " + b +
                '}';
    }
}
