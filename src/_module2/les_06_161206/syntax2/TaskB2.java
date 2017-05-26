package _module2.les_06_161206.syntax2;

import java.util.Arrays;

/**
 * С помощью функции random() сгенерировать массив чисел от 0 до 50 и
 * определить количество четных и нечетных чисел в этом массиве. Для
 * определения четных и нечетных чисел использовать функцию.
 */
public class TaskB2 {
    static int countEven = 0;
    public static void main(String[] args) {
        int[] a = new int[50];
        fillRandomArray(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Even = "+chkParity(a)+"; Odd = "+(a.length-countEven)+";");
    }
static int [] fillRandomArray (int [] a){
    for (int i = 0; i < a.length; i++) {
        a[i]=(int)(Math.random()*a.length*10);
    }
    return a;
    }
static int chkParity (int [] a){

    for (int i = 0; i < a.length; i++) {
        if (a[i]%2==0) countEven++;
    }
    return countEven;
    }
}
