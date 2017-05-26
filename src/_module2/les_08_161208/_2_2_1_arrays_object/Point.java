package _module2.les_08_161208._2_2_1_arrays_object;

/**
 * point
 * double x
 * double y
 * <p>
 * constr...
 * getters...
 * <p>
 * toString метод
 * <p>
 * compare(p1,p2)
 */
public class Point {
    private double x, y;



    static double distance(Point p1, Point p2) {// method style procedur
        //double dx= p1.getX()-p2.getX();
        //double dy= p1.getY()-p2.getY();
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double distanceTo(Point point) {// method style oop
        Integer.compare(4, 3);
        Integer n = 5;
        n.compareTo(5);
        //n.compare(8,9);
        double dx = this.x - point.x;
        System.out.println("this.x = "+this.x);
        double dy = y - point.y;
        System.out.println("this.y = "+this.y);
        return Math.sqrt(dx * dx + dy * dy);

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /*public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }*/
}
