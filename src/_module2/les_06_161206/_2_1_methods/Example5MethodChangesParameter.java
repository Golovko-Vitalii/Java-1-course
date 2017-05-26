package _module2.les_06_161206._2_1_methods;

import java.util.Arrays;
import java.util.Random;

public class Example5MethodChangesParameter {
    public static void main(String[] args) {
        Random rn = new Random();
        int [] a = new int [7];
        int [] b = new int [7];
        for (int i = 0; i < a.length ; i++) {
            a[i] = rn.nextInt(20);
        }
        print(a);
        //b = sort(a);
        print(b);
        print(a);
        System.out.println();System.out.println();
        System.out.println(Arrays.toString(a));
        mySort(a);
        System.out.println(Arrays.toString(a));
    }
    static void print (int [] a){
        System.out.println();
        for (int k :a){
            System.out.print(k + " ");
        }
    }
    static int [] sort (int []a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = i; j < a.length; j++) {
                int temp;
                if (a[j]<a[i]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }

        }
        return a;
    }

    static void mySort (int [] b){
        Arrays.sort(b);
    }
}
