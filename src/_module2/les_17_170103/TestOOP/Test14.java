package _module2.les_17_170103.TestOOP;

public class Test14 {
    String test(short s) { return "one"; }
    String test(short... s) { return "many"; }
}
class A1 {
    public static void main(String[] args) {
        System.out.println(new Test14().test((short)7));
    }
}
