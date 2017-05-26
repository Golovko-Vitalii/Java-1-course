package _module1.les_04_161201.home_work;

import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Длина массива = ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*a.length*10);
        }
        System.out.println(Arrays.toString(a));
        int [] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[a.length-1-i];
        }
        System.out.println(Arrays.toString(b));
    }
}
