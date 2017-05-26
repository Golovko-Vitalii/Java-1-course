package _module1.les_02_161129._1_2_types_vars;

import java.lang.Math;
public class MathTest {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = (int)Math.pow(x,y);
        System.out.println("z = " + z);
        System.out.println(Math.pow(x,y));
        System.out.println(Math.PI/2);
        System.out.println(Math.sin(Math.PI / 2));
        int a = 5;
        System.out.println("a/2="+a/2);// целочисленное деление
        System.out.println("a/2.0="+a/2.0); // 1 способ
        System.out.println("(double)a/2="+(double)a/2);// 2 способ
    }
}
