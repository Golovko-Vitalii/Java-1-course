package _module2.les_17_170103.TestOOP;

public class Test29 {
    public static void main(String[] args) {
        Foo2 f = new Bar2();
        f.add();
        System.out.println("a = " + f.a + ", " + ((Bar2) f).a);
    }
}

class Foo2 {
    public int a;

    public Foo2() {
        a = 0;
    }

    public void add() {
        a = a + 100;
        System.out.println("!!!");
    }
}

class Bar2 extends Foo2 {
    public int a;

    public Bar2() {
        a = 2;
    }

    @Override
    public void add() {
        a = a + 5;
    }
}
