package _module2.les_11_161214._2_4_stringbuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        long before, after;
        before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append("Hello");
        }
        after=System.currentTimeMillis();
        System.out.println(after-before);
        sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            sb.append("Hello");
        }
        after=System.currentTimeMillis();
        System.out.println(after-before);
        sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            sb.append("Hello");
        }
        after=System.currentTimeMillis();
        System.out.println(after-before);
        sb = new StringBuilder(3000000);
        before = System.currentTimeMillis();
        for (int i = 0; i < 3000000; i++) {
            sb.append("Hello");
        }
        after=System.currentTimeMillis();
        System.out.println(after-before);
    }
}
