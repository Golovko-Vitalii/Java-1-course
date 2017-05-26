package _module2.les_17_170103.TestOOP;

class Base1 {
    static {
        System.out.println("Static");
    }
    public Base1(String s) {
        System.out.println("Base " + s);
    }
}
public class Test17 extends Base1 {
    //private final String str = "Constructor";
    private static final String str = "Constructor";
    public Test17() {
        super(str);
        System.out.println("Sub " + str);
    }
    public static void main(String[] args) {
        Base1 b = new Test17();
    }
}