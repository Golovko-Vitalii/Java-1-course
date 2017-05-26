package _module2.les_10_161213._2_3_inheritance._shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void show() {
        System.out.println("I am Circle");
    }

    @Override
    public String toString() {
        return "Circle{" + getColor() +
                "radius= " + radius +
                '}';
    }
}
