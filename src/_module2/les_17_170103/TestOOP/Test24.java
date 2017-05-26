package _module2.les_17_170103.TestOOP;

public class Test24 {
    public static void main(String[] args) {
        System.out.println(new Banana("Banana").getTasty());
    }
}

class Fruit {
    private String name;
    Fruit(){};

    Fruit(String name) {
        this.name = name;
    }

    String getTasty() {
        return this.name + " is quite OK";
    }
}

class Banana extends Fruit {
    private String name;

    Banana(String name) {
        //super(); //задается неявно
        this.name = name;
    }

    String getTasty() {
        return this.name + " is yummy!";
    }
}
