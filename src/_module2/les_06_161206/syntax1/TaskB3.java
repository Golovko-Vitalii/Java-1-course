package _module2.les_06_161206.syntax1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел. На консоль вывести:
 * Найти первое число, цифры в котором идут в строгом порядке возрастания.
 */
public class TaskB3 {
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
            println("Первое число, цифры в котором идут в строгом порядке возрастания:");
            for (int i = 0; i < a.length; i++) {
                if (chk(i, a)) {
                    System.out.print("a[" + (i + 1) + "] = " + a[i] + "; ");
                    break;
                }
            }
        } else {
            println("Error n < 0 !!!");
        }
    }

    static boolean chk(int i, int[] a) {
        char[] charArray = Integer.toString(Math.abs(a[i])).toCharArray();
        if (charArray.length != 1){
            for (int j = 1; j < charArray.length; j++) {
                if (charArray[j]>charArray[j-1]){}
                else {return false;}
            } return true;
        }
            else {return true;}
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

