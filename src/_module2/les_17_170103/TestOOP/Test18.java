package _module2.les_17_170103.TestOOP;

class Base2 {
    static {
        System.out.println("Static");
    }
    public Base2(String s) {
        System.out.println("Base " + s);
    }
}
public class Test18 extends Base2 {
    private static final String str = "Constructor";
    public Test18() {
        super(str);
        System.out.println("Sub " + str);
    }
    public static void main(String[] args) {
        Base2 b = new Test18();
    }
}
