package _module2.les_17_170103.TestOOP;

public class Test15 {
    String test(short s) { return "one"; }
    String test(short... s) { return "many"; }
}
class A2 {
    public static void main(String[] args) {
        short x = 7;
        System.out.println(new Test15().test(x));
    }
}