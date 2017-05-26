package _module3.les_29_170120.builder_pattern;

public class ItemBuilderTest {
    public static void main(String[] args) {

        Item item =
                Item.newBuilder().setA(42).setC('C').setE(true).build();

        System.out.println(item);
        System.out.println(item.getClass());//prowerka

    }
}
