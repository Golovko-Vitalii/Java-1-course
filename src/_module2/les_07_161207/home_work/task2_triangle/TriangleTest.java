package _module2.les_07_161207.home_work.task2_triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,3,4);
        System.out.println("Площадь "+triangle+" = " +
                square(triangle.getA(),triangle.getB(),triangle.getC()));
        System.out.println("Площадь "+triangle+" = " +
                triangle.square(triangle.getA(),triangle.getB(),triangle.getC()));
    }
    static double square (double a, double b, double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
