package _module2.les_14_161222._2_8_interface_generic;

public class NumbTest {
    public static void main(String[] args) {

        Numb a = new Numb(5);
        Numb b = new Numb(7);
        Numb c = new Numb(4);

        Numb d = a.plus(b).minus(c);
        System.out.println(d);

        d = a.plus(b).mult(c);
        System.out.println(d);

        d = (a.plus(b)).mult(c);
        System.out.println(d);

        d = a.plus(b.mult(c));
        System.out.println(d);

        System.out.println();
    }
}
