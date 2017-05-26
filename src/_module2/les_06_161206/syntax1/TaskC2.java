package _module2.les_06_161206.syntax1;
/*
* Ввести с консоли n целых чисел. На консоль вывести:
* Наибольшее и наименьшее число.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        String s;int [] a;
        println("Введите размерность массива, целое число:");
        s = inputStr(); chkInt(s);
        int n= Integer.parseInt(s);
        if (n>0){
            a=new int[n];
            println("Введите " + n + " чисел массива:");
            for (int i = 0; i < n; i++) {
                s = inputStr(); chkInt(s);
                a[i] = Integer.parseInt(s);
            }
            println("Массив: "+Arrays.toString(a));
            println("Maximum: "+chkMaximum(a));
            println("Minimum: "+chkMinimum(a));
            System.out.println(Arrays.toString(a));
            /*chkSort(a);
            System.out.println(Arrays.toString(a));*/
        } else{println("Error n < 0 !!!");}
    }

    static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    static void println(String s) {
        System.out.println(s);
    }

    static boolean chkInt (String s)
    {
        try {int i = Integer.parseInt(s); return true;}
        catch (NumberFormatException e){println("Некоректный ввод, это не целое число"+" = "+e);return false; }
    }

    /*static void chkSort (int [] a){
        Arrays.sort(a);
    }*/

    static int chkMaximum (int [] a){
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max) max=a[i];
        }
        return max;
    }
    static int chkMinimum (int [] a){
        int min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]<min) min=a[i];
        }
        return min;
    }
}