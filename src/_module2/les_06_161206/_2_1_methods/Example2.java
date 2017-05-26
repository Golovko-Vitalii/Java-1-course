package _module2.les_06_161206._2_1_methods;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printsum(a,b);
    }
    static void printsum (int a, int b){
        System.out.println("(a+b) = " + (a+b));

    }
}
