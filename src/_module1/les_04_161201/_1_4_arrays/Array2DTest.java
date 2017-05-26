package _module1.les_04_161201._1_4_arrays;

import java.util.Arrays;

public class Array2DTest {
    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[1][2]=5;
        System.out.println(Arrays.toString(a));
        /*System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));*/
        System.out.println();
        //fill with 1..12
        for (int i = 0, k=0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=++k;
            }
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println();
        //print variant 1
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
        //print variant 2
        System.out.println();
        System.out.println(Arrays.deepToString(a));
        int [][][] a3 = new int[3][3][3];
        System.out.println();
        System.out.println(a3);
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.deepToString(a3));
    }
}
