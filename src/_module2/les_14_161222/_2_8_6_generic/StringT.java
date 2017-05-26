package _module2.les_14_161222._2_8_6_generic;

public class StringT {
    public static <T> T foo() {
        try {
            return (T) new Integer(42);
        } catch (ClassCastException e) {
            return (T) "habr";
        }
    }
    public static void main(String[] args) {
        //System.out.println(StringT.<String>foo());//ClassCastException
        System.out.println(Integer.toString(StringT.foo()));//ok!
    }
}
