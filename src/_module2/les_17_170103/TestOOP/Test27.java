package _module2.les_17_170103.TestOOP;

class Hello {
    protected static String h = "Hello";
}

public class Test27 extends Hello{
    public static void main(String[] args) {
        h += " world!";
        System.out.println(h);
    }
}
