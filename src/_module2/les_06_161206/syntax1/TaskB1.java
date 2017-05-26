package _module2.les_06_161206.syntax1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел. На консоль вывести:
 * Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
 */
public class TaskB1 {
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
            println("Трехзначные числа, в десятичной записи которых нет одинаковых цифр:");
            for (int i = 0; i < a.length; i++) {
                chk(i, a);
            }
        } else {
            println("Error n < 0 !!!");
        }
    }

    static void chk(int i, int[] a) {
        char[] charArray = Integer.toString(a[i]).toCharArray();
        if (charArray.length == 3 &&
                charArray[0] != charArray[1] &&
                charArray[0] != charArray[2] &&
                charArray[1] != charArray[2])
            System.out.print("a[" + (i + 1) + "] = " + a[i] + "; ");
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

