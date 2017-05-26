package _module2.les_06_161206.syntax1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел. На консоль вывести:
 * Наибольший общий делитель и наименьшее общее кратное этих чисел.
 */
public class TaskB2 {
    public static void main(String[] args) {
        String s;
        int[] a;
        println("Введите размерность массива, целое число:");
        s = inputStr();
        chkInt(s);
        int n = Integer.parseInt(s);
        if (n > 0) {
            a = new int[n];
            println("Введите " + n + " чисел массива:");
            for (int i = 0; i < n; i++) {
                s = inputStr();
                chkInt(s);
                a[i] = Integer.parseInt(s);
            }
            println("Массив: " + Arrays.toString(a));
            println("НОД: "+gcd(a));
            println("НОК: "+lcm(a));
        } else {
            println("Error n < 0 !!!");
        }
    }

    private static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input)
    {
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
        return result;
    }

    private static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input)
    {
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }

    static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    static void println(String s) {
        System.out.println(s);
    }

    static boolean chkInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            println("Некоректный ввод, это не целое число" + " = " + e);
            return false;
        }
    }
}
