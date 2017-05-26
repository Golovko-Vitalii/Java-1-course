package _module2.les_17_170103.TestOOP;

public class Test4 {
    public static void main(String[] args) {
        Parent c = new Child();
        c.sop();
    }
}

class Parent {
    //private Parent() { // error!
    //}

    public static void sop() {
        System.out.println("Parent's static sop");
    }
}

class Child extends Parent {
    public static void sop() {
        System.out.println("Child'd static sop");
    }
}
