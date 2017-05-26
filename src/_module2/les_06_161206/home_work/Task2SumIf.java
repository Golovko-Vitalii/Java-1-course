package _module2.les_06_161206.home_work;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 1)Метод СУММЕСЛИ. double sumIf(double []a, String param)
 * который суммирует только те числа из массива, которые
 * удовлетворяют условию,задаваемому через строку param.
 * Варианты тестирования метода:
 * double x = sumIf(b,”>0”);
 * сумма положительных чисел
 * double x = sumIf(b,”<0”);
 * сумма отрицательных чисел
 * double x = sumIf(b,”>=10000”);
 * сумма больших либо равных 10000
 */
public class Task2SumIf {
    public static void main(String[] args) {
        println("Введите сколько чисел в массиве, целое число");
        int aLenght; String str=input();
        if (chkInt(str)) {
            if (Integer.parseInt(str)>= 1){
                aLenght = Integer.parseInt(str);
                double a [] = new double[aLenght];
                println("Введите "+aLenght+" чисел массива, вещественные, например -12.45 :");
                for (int i = 0; i < aLenght; i++) {
                    System.out.println("Input number "+(i+1));
                    str=input();
                    if (chkDouble(str)){a[i] = Double.parseDouble(str);}
                    else {break;}
                }
                println("Введите параметр сравнения,");
                println("Например '>', '>=', '<', '<=', '='");
                str=input();
                println("Введите вещественное число n, например -115.1405, где числа из массива,");
                println("которые удовлетворяют условию a[i]" + str + "n суммируются.");
                str+=" "+input();
                println("");
                println("Сумма эл-тов массива");
                println(Arrays.toString(a));
                println("удовлетворяющих условию a[i] "+str+";");
                println("sum = "+sumIf(a, str));
            }
            else {println("Некоректный ввод, размер массива быть больше 0 :"); println(str+"<=0");}
        }
    }

    static void println (String s){System.out.println(s);}

    static String input (){Scanner scanner = new Scanner(System.in);return scanner.next();}

    static boolean chkInt (String s)
    {
        try {int i = Integer.parseInt(s); return true;}
        catch (NumberFormatException e){println("Некоректный ввод, это не целое число"+" = "+e);return false; }
    }

    static boolean chkDouble (String s)
    {
        try {double i = Double.parseDouble(s); return true;}
        catch (NumberFormatException e){println("Некоректный ввод, это не вещественное число"+" = "+e);return false; }
    }

    static double sumIf(double []a, String param) {
        double sum = 0;
        String[] parts = param.split(" ");
        String s1=parts[0], s2=parts[1];
        if (chkDouble(s2)){
            double n = Double.parseDouble(s2);
        switch (s1) {
            case ">": {
                for (double v : a) {
                    if (v>n) sum+=v;
                }
                return sum;
            }
            case ">=": {
                for (double v : a) {
                    if (v>=n) sum+=v;
                }
                return sum;
            }
            case "<": {
                for (double v : a) {
                    if (v<n) sum+=v;
                }
                return sum;
            }
            case "<=": {
                for (double v : a) {
                    if (v<=n) sum+=v;
                }
                return sum;
            }
            case "=": {
                for (double v : a) {
                    if (v==n) sum+=v;
                }
                return sum;
            }
            default: {
                println("Неверный параметр сравнения! " + s1 + " Выберите '>', '>=', '<', '<=', '='");
                return Double.NaN;
            }
        }
    }
    else {
            println("Неверный параметр сравнения n! --" + s2 + " --");
            return Double.NaN;
        }
    }
}
