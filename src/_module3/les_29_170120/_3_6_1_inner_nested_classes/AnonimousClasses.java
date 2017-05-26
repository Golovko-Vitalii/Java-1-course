package _module3.les_29_170120._3_6_1_inner_nested_classes;

public class AnonimousClasses {
    public static void main(String[] args) {
        // 1 inherit from class StringT

        B b = new B(2) {// 1)class "" extends StringT, 2) new **
            void m2() {
                System.out.println("m2");
            }
            @Override
            void m() {
                System.out.println("m of anonymous class");
            }
        };
        b.m();
        //b.m2("");

        // 2 implement interface
        C c = new C() {// 1) class "" implements C, 2)new ""

            @Override
            public void c() {
                System.out.println("method c in anonymous class");
            }
        };
        c.c();
    }
}

class B {
    int b;

    public B(int b) {
        this.b = b;
    }

    void m() {
    }
}

interface C {
    void c();
}

