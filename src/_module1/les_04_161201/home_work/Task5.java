package _module1.les_04_161201.home_work;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int [] a = new int[10], a1 = new int[5], a2 = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Input number "+(i+1));
            a[i] = scanner.nextInt();
        }
        a1 = Arrays.copyOfRange(a,0,a.length/2);
        a2 = Arrays.copyOfRange(a,a.length/2,a.length);
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}


