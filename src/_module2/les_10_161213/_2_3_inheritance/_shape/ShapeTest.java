package _module2.les_10_161213._2_3_inheritance._shape;

public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("red",3,4,5);
        System.out.println(triangle);
        triangle.show();

        Rectangle rectangle = new Rectangle("red",2,5);
        System.out.println("rectangle = " + rectangle);
        rectangle.show();

        Circle circle = new Circle("green", 5);
        System.out.println("circle = " + circle);
        circle.show();

        Shape shape1, shape2, shape3;

        shape1 = new Circle("blue", 4);
        shape2 = new Rectangle("violet",1,2);
        shape3 = new Triangle("pink", 1,3,4);
        System.out.println("---polymorph---");// динамический полиморфизм

        shape1.show();// вызоветься метод не родителя, а объекта
        shape2.show();
        shape3.show();
    }
}
