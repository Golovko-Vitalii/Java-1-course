package _module2.les_14_161222._2_8_interfaces_with_generic;

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,7);
        Complex c2 = new Complex(5,3);
        Complex c3 = new Complex(1,1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c1+(c2-c3) = "+c1.plus(c2.minus(c3)));
        System.out.println("(c1+c2)-c3 = "+c1.plus(c2).minus(c3));
        System.out.println("c1*(c2+c3) = "+c1.mult(c2.plus(c1)));
        System.out.println("c1*c2+c3 = "+c1.mult(c2).plus(c1));
        System.out.println("(c2+c3)/c1 = "+(c3.plus(c2)).divide(c1));

    }
}
