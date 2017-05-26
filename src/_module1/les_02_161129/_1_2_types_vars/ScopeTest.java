package _module1.les_02_161129._1_2_types_vars;

public class ScopeTest {
    public static void main(String[] args) {
        int x;
        {
            //int x; //error! already defined!
            int y;
            x = 50;
            y = 20;
        }
        System.out.println(x); //50
        //y = 4; // error! not defined yet!
        x = 55;
        System.out.println(x); //55
        int y; //ok
        //System.out.println(y);
        {
            int a0,x0,y0;
            a0 = 5;
            System.out.println("a0 = " + a0);
            x0 = a0++;
            System.out.println("x0 = " + x0);
            System.out.println("a0 = " + a0);
            y0 = ++a0;
            System.out.println("a0 = " + a0);
            System.out.println("x0 = " + x0);
            System.out.println("y0 = " + y0);
            int i = 1, i1 = 1;
            i = i++;
            System.out.println("i = " + i);
            i1 = ++i1;
            System.out.println("i1 = " + i1);
            System.out.println(Math.log10(3));
        }
    }
}
