package _module1.les_04_161201._1_4_arrays;

import java.util.Arrays;

public class ArraysTestFor {
    public static void main(String[] args) {
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        //output
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //copy
        int [] aCopy = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            aCopy[i] = a[i];
        }
        System.out.println(Arrays.toString(aCopy));
        //копирует ссылки из а в aCopy2 и меняет значения в а
        int [] aCopy2 = a;
        aCopy2[0] = 10000;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(aCopy2));
    }
}
