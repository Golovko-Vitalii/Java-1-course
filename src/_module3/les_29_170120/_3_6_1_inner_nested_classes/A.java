package _module3.les_29_170120._3_6_1_inner_nested_classes;

public class A {
    int x, y;
    String s;

    public A() {

    }

    void m(int xx, int yy) {
        class Point {//local class
            int x, y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
        Point p = new Point(xx, yy);
        int z = p.x + p.y;
    }
}
