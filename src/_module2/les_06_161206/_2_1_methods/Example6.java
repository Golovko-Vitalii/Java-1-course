package _module2.les_06_161206._2_1_methods;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random rn = new Random();
        int [] a = new int [7];
        int [] b = new int [7];
        for (int i = 0; i < a.length ; i++) {
            a[i] = rn.nextInt(20);
        }
        print(a);
        b = sort(a);
        print(b);
        print(a);
    }
    static void print (int [] a){
        System.out.println();
        for (int k :a){
            System.out.print(k + " ");
        }
    }
    static int[] sort (int [] a){
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        for (; ; )
        {
            int sum = 0;
            for (int i = 0; i < b.length - 1 ; i++)
            {
                int temp;
                if (b[i] > b [i+1])
                {
                        temp = b[i];
                        b[i] = b [i+1];
                        b[i+1] = temp;
                        sum++;
                }
            }
            if (sum == 0) break;
        }
        return b;
    }

}
