package _module2.les_06_161206._2_1_methods;

public class Example7 {
    public static void main(String[] args) {
        System.out.println(Volume(1.2,3));
    }
    static double Volume (double r, double h){
        return h*Area(r);
    }
    static double Area (double r){
        return Math.PI*r*r;
    }
}
