package _module2.les_06_161206.syntax1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести с консоли n целых чисел. На консоль вывести:
 * Элементы, которые равны полусумме соседних элементов.
 */
public class TaskC3 {
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
            println("Массив: "+ Arrays.toString(a));
            println("Элементы, которые равны полусумме соседних элементов:");
            for (int i = 1; i < a.length-1; i++) {
                chk(i,a);
            }
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
    static void chk (int i, int [] a){
        if (a[i]==((a[i-1]+a[i+1])/2)) System.out.print("a["+i+"] = "+a[i]+"; ");
    }
}
