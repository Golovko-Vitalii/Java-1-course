package _module3.les_18_170104._3_1_1_exception;

import java.util.Scanner;

public class TestException3_ {
    public static void main(String[] args) {
        String input;        int a=0;       boolean ok = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числo a=");
        do {
            input = sc.next();
            try {
                a = Integer.parseInt(input);
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("try again!");
            }
        } while (!ok);
        int b = 0;
        ok = false;
        System.out.print("Введите числo b=");
        do {
            input = sc.next();
            try {
                b = Integer.parseInt(input);
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("try again!");
            }
        } while (!ok);
        try {
            System.out.println("a/b=" + (double)a / b);
        } catch (ArithmeticException e) {
            System.out.println("a/b=Infinity");// del na 0
        }
    }
}
