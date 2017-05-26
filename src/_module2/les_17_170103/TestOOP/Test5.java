package _module2.les_17_170103.TestOOP;

class Test51 {
    Test51() {
        System.out.print("b ");
    }

    Test51(String name) {
        this();
        System.out.print("bn" + name);
    }
}

public class Test5 extends Test51 {
    Test5() {
        System.out.print("h ");
    }

    Test5(String name) {
        this();
        System.out.print("hn" + name);
    }

    public static void main(String[] args) {
        new Test5("x ");
    }
}
