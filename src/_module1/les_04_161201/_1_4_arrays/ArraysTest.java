package _module1.les_04_161201._1_4_arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
       int [] a = new int [10];  //1
       int [] b = {1,2,3,4,5};   //2
       int [] c;                 //3
       c = new int [] {1,2,3,4};
       // печать массива:
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));

    }
}
