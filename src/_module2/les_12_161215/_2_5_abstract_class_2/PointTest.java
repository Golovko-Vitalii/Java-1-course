package _module2.les_12_161215._2_5_abstract_class_2;

public class PointTest {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        points[0] = new Point1D("red", 1);
        points[1] = new Point2D("green", 1, 2);
        points[2] = new Point3D("blue", 1, 2, 3);
        //points[3] = new Point("black");// cannot, abstact class
        //new Point("black");// cannot, abstact class

        for (int i = 0; i < points.length; i++) {
            //((Point1D)points[i]).show();
            points[i].show(); // после создания пустышки
        }
    }
}
