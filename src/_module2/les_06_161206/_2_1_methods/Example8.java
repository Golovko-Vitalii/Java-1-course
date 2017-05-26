package _module2.les_06_161206._2_1_methods;

public class Example8 {
    public static void main(String[] args) {
        System.out.println(Volume(Area(1.2),3));
    }
    static double Area (double r){
        return Math.PI*r*r;
    }
    static double Volume (double s, double h){
        return h*s;
    }
}
