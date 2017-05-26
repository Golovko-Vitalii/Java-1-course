package _module2.les_06_161206.syntax1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел. На консоль вывести:
 * k-ое наименьшее значение
 */
public class TaskB6 {
    public static void main(String[] args) {
        String s;
        int[] a;
        println("Введите размерность массива, целое число:");
        s = inputStr();
        chkInt(s);
        int n = Integer.parseInt(s);

        println("Введите индекс k для наименьшего значения, целое число 0 < k <= "+n+" :");
        s = inputStr();
        chkInt(s);
        int k = Integer.parseInt(s);

        if (n > 0) {
            if (k<=n&&k>0) {
                a = new int[n];
                println("Введите " + n + " чисел массива:");
                for (int i = 0; i < n; i++) {
                    s = inputStr();
                    chkInt(s);
                    a[i] = Integer.parseInt(s);
                }
                println("Массив: " + Arrays.toString(a));
                println("k-ое наименьшее значение, где k = " + k + " :");
                method(k, a);
            } else{println("Error 0 < k <= n !!!");}
        } else {
            println("Error n < 0 !!!");
        }
    }

    static void method (int k, int[] a) {
        Arrays.sort(a);
        System.out.print("a[" + (k) + "] = " + a[k-1] + "; ");
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

