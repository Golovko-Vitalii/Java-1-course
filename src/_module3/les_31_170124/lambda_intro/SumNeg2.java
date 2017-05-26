package _module3.les_31_170124.lambda_intro;

import java.util.function.Predicate;

public interface SumNeg2 {
    public static void main(String[] args) {
        int[] a = {-10, -20, 10, 20, -30, 30};
        Predicate<Integer> neg = i -> i < 0;
        System.out.println(sumIf(a, neg));

    }

    public static int sumIf(int[] input, Predicate<Integer> filter) {//предикат
        int s = 0;
        for (int i : input) {
            if (filter.test(i)) s += i;//test(int)
        }
        return s;
    }
}
