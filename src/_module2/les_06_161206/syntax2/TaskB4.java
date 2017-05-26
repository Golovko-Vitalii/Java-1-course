package _module2.les_06_161206.syntax2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив целых чисел A. Найти суммы положительных и
 * отрицательных элементов массива, используя функцию определения суммы.
 */
public class TaskB4 {
    static int sumNegative = 0,sumPositive=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива, целое число > 0");
        String s = scanner.next();
        if (chkInt(s)){
            int n = Integer.parseInt(s);
            if (n>0){
                int[] a = new int[n];
                fillRandomArray(a);
                System.out.println(Arrays.toString(a));
                sumArray(a);
                System.out.println("Сумма отрицательных = "+sumNegative+
                        "; Сумма положительных = "+sumPositive+";");
            }
            else System.out.println("Размер массива не может быть меньше 1 !!!");
        }
    }
static int [] fillRandomArray (int [] a){
    for (int i = 0; i < a.length; i++) {
        if (i%2==0) // четные позиции массива будут положительными 0 < a[i] <= 150
        a[i]=(int)(Math.random()*120-150);
        else // нечетные позиции массива будут отрицательными -150 <= a[i] < 0
            a[i]=(int)(Math.random()*120+150);
    }
    return a;
    }
    static void sumArray (int [] a){
    for (int i = 0; i < a.length; i++) {
        if (a[i]>0) sumPositive+=a[i];
        else sumNegative+=a[i];
    }
    }
    static boolean chkInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(("Некоректный ввод, это не целое число" + " = " + e));
            return false;
        }
    }
}
