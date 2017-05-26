package _module2.les_17_170103.TestOOP;

public class Test25 {
    public static void main(String[] args) {
        System.out.println(new Banana2("Banana").getTasty());
    }
}
class Fruit2 {
    private String name;
    Fruit2(String name) {
        this.name = name;
    }
    String getTasty() {
        return this.name + " is quite OK";
    }
}
class Banana2 extends Fruit2 {
    private String name;
    Banana2(String name) {
        super(name);
        this.name = name;
    }
    String getTasty() {
        return this.name + " is yummy!";
    }
}
