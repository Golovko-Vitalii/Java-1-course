package _module2.les_12_161215._2_5_shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(2.75);
        shapes[1] = new Triangle(2,3,4);
        shapes[2] = new Square(2.25);
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Perimeter = "+shape.getPerimeter());
            System.out.println("Area = "+shape.getArea());
        }

    }
}
