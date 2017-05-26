package _module2.les_11_161214._2_4_stringbuilder;

public class StringTest {
    public static void main(String[] args) {
        String s = "";
        long before, after;
        before = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s = s+ "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        s = "";
        before = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            s = s+ "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        s = "";
        before = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            s = s+ "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        s = "";
        before = System.currentTimeMillis();
        for (int i = 0; i < 40000; i++) {
            s = s+ "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);
    }


}
