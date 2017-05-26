package _module2.les_06_161206._2_1_methods;

/**
 * Created by Vitalii on 14.12.2016.
 */
import java.util.Arrays;

/**
 * 2)Написать метод sumNegative. Вход: массив целых чисел
 * (в котором содержатся как отрицательные, так и положительные числа).
 * Выход: сумма отрицательных чисел из этого массива.
 */
public class Task2SumNegative {
    public static void main(String[] args) {
        int [] arr = {6,-5,4,-7,8,-9};
        System.out.println(Arrays.toString(arr));
        System.out.println(sumNegative1(arr));
    }

    static int sumNegative1(int[]a){
        int result=0;
        for (int number:a) {
            if (number<0) result+=number;
        }
        return result;
    }
}
