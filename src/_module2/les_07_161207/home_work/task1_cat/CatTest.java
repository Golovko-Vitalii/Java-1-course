package _module2.les_07_161207.home_work.task1_cat;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boss", "black", 6.5);
        Cat cat2 = new Cat("Jo", "grey", 4.5);
        Cat cat3 = new Cat("Liza", "white", 2.5);

        cat1.sound();
        System.out.println(cat1.toString());
        cat2.sound();
        System.out.println(cat2);
        cat3.sound();
        System.out.println(cat3);

        cat3.setWeight(15);
        System.out.println(cat3);

        System.out.println("cat3.getColor() = " + cat3.getColor());

    }
}
