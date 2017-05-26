package _module2.les_08_161208._2_2_1_arrays_object;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(0, 3);
        Point p2 = new Point(4, 0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Point.distance(p1, p2));
        System.out.println(p1.distanceTo(p2));
    }
}
