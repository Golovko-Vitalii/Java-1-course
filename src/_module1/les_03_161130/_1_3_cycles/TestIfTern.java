package _module1.les_03_161130._1_3_cycles;

import java.util.Scanner;

public class TestIfTern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        int a = scanner.nextInt();
        System.out.println("b=");
        int b = scanner.nextInt();

        int max,min;

        max = (a>b)?a:b;
        min = (a>b)?b:a;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
