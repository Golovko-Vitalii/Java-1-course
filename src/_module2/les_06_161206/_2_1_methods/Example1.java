package _module2.les_06_161206._2_1_methods;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("sum(a,b) = " + sum(a,b));
    }
    static int sum (int a, int b){
        return a+b;
    }
}
