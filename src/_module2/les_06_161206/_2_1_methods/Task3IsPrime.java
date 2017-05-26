package _module2.les_06_161206._2_1_methods;

import java.util.Scanner;

public class Task3IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int a = scanner.nextInt();
        System.out.println("Is simple = " + isPrime1(a));
        System.out.println("Is simple = " + isPrime2(a));
        System.out.println("Is simple = " + isPrime3(a));
    }
    static boolean isPrime1 (int a){
        int count=0;
        //проверить, делится ли число n без остатка на i от 2 до n-1
        for (int i = 1; i < a; i++) {
            count++;
            if (a%i == 0 &&  i != 1) {
                System.out.println(count);
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
    static boolean isPrime2(long n){
        int count=0;
        if (n%2==0) {System.out.println(count); return false;}
        //проверить, делится ли число n без остатка на i от 3 до n-1
        for (int i = 3; i < n; i+=2) {
            count++;
            if (n%i==0){System.out.println(count); return false;}
        }
        System.out.println(count);
        return true;

    }
    static boolean isPrime3(long n){
        //делим до корня из числа, см.книгу javamethods авт.Седжик
        int count=0;
        int m =(int) Math.sqrt(n);
        if (n%2==0) {System.out.println(count); return false;}
        //проверить, делится ли число n без остатка на i+=2 от 3 до m
        for (int i = 3; i <= m; i+=2) {
            count++;
            if (n%i==0){System.out.println(count); return false;}
        }
        System.out.println(count);
        return true;

    }
}
