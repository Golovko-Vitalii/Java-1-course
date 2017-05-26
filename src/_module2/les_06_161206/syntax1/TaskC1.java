package _module2.les_06_161206.syntax1;
/*Ввести с консоли n целых чисел. На консоль вывести:
        •	Четные и нечетные числа.*/
import java.util.Arrays;
import java.util.Scanner;

public class TaskC1 {
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
            println("Четные:");
            for (int i : a) {
                if (chkParity(i)) System.out.print(i + ", ");
            }
            println("");
            println("Нечетные:");
            for (int i : a) {
                if (!chkParity(i)) System.out.print(i + " ");
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
    static boolean chkParity (int a){
        if (a%2==0) return true;
        else return false;
    }
}
