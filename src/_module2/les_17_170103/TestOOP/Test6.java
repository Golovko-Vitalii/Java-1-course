package _module2.les_17_170103.TestOOP;

public class Test6 {
    public static void main(String[] args) {
        Test6 t = new Test6();
        t.start();
    }

    void start() {
        int x = 7;
        alter(x);
        System.out.println(x);
    }

    void alter(int x) {
        x = x + 2;
    }
}
