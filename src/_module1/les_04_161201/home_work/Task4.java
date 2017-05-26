package _module1.les_04_161201.home_work;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int depth = scanner.nextInt()+1;
        System.out.println("depth = " + (depth-1));
        int [] [] a = new int[depth][];
        for (int i = 0; i < depth; i++) {
            a [i] = new int[i+1];
            a [i] [0] = 1;
            a [i] [a[i].length-1] = 1;
            for (int j = 0; j < i + 1; j++) {
                    if (a[i][j]!=1) {
                    a[i][j] = a [i-1] [j-1]+a[i-1][j] ;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
