package _module2.les_12_161215._2_5_abstract_class_2;

public class Point3D extends Point2D {
    private double z;

    public Point3D(String color, double x, double y, double z) {
        super(color, x, y);
        this.z = z;
    }

    @Override
    public void show() {
        System.out.println("I am 3D point!");
    }
}
