package _module2.les_06_161206.syntax1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел. На консоль вывести:
 * Найти первое число, в котором число различных цифр минимально.
 */
public class TaskB5 {
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
            println("Первое число, в котором число различных цифр минимально:");
            int index = chk(a);
            System.out.print("a[" + (index + 1) + "] = " + a[index] + "; ");
            System.out.println(" Число различных чисел = "+countDifInt(Integer.toString(Math.abs(a[index])).toCharArray()));
        } else {
            println("Error n < 0 !!!");
        }
    }

    static int chk(int[] a) {
        int index = 0, res1,res2;
        for (int j = 1; j < a.length ; j++) {
            res1=countDifInt(Integer.toString(Math.abs(a[index])).toCharArray());
            res2=countDifInt(Integer.toString(Math.abs(a[j])).toCharArray());
            if (res1>res2){
                index = j;
            }
        }
        return index;
    }

    static int countDifInt(char[] charArray) {
        int result = charArray.length;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < charArray.length ; j++) {
                if (charArray[j]==Integer.toString(i).charAt(0)){
                  result-=1;break;
                }
            }
        }
        return (charArray.length-result);
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

