package _module2.les_17_170103.TestOOP;

public class Test28 {
    public static void main(String[] args) {
        Foo f = new Bar();
        f.add();
        System.out.println("a = " + f.a);
    }
}

class Foo {
    public int a;

    public Foo() {
        a = 0;
    }

    public void add() {
        a = a + 100;
    }
}

class Bar extends Foo {
    public int a;

    public Bar() {
        a = 2;
    }

    @Override
    public void add() {
        a = a + 5;
    }
}
