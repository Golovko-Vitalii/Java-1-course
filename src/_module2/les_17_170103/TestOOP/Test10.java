package _module2.les_17_170103.TestOOP;

public class Test10 {
    static class X {
        static String x = Y.y;
    }
    static class Y {
        static String y = X.x;
    }
    public static void main(String[] args) {
        Y.y = "0";
        System.out.println(X.x);
    }
}