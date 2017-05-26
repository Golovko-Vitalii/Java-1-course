package _module3.les_31_170124.lambda_intro;

public class SumNegative {
    public static void main(String[] args) {
        int[] a = {-10, -20, 10, 20, -30, 30};
        MyFilter neg = n -> n < 0;
        MyF pos = n -> n < 0;
        System.out.println("sumNegativ(i) = " + sumNegativ(a, neg));
        Func upper = s -> s.toUpperCase();
        String str = upper.apply("abcd");
        System.out.println("str = " + str);
    }

    public static int sumNegativ(int[] input, MyFilter filter) {
        int s = 0;
        for (int i : input) {
            if (filter.test(i)) s += i;//test(int)
        }
        return s;
    }

}
