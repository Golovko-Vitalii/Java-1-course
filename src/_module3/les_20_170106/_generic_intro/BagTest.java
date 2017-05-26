package _module3.les_20_170106._generic_intro;

public class BagTest {
    public static void main(String[] args) {
        Bag <Integer> bagInt = new Bag<>(new Integer(5));
        //Bag <Integer> bagInt = new Bag<>(5); // или автоматическая упаковка, можно и так написать

        bagInt.setValue(10);
        System.out.println("bagInt = " + bagInt);

        //bagInt.setValue("A"); // ошибка, компилятор проверяет входящий тип

        Integer a = bagInt.getValue();// good!!! no visile casting
        System.out.println("a = " + a);

    }
}
