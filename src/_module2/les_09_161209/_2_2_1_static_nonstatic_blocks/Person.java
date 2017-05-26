package _module2.les_09_161209._2_2_1_static_nonstatic_blocks;

public class Person {
    //static ... одна переменная на весь класс
    private static int id;
    //private static int id=10000;
    static  int getId(){ return id;}

    //static block вызывается во время загрузки класса
    static {
        id = 10000;
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");

    }

    private  String name;
    //nonstatic block вызывается перед вызовом конструктора во время создания объекта
    {
        id++;
        System.out.println("non-static block 1");
    }
    {
        System.out.println("non-static block 2");

    }

    public Person(){
        int id =0;
        //id++;
        System.out.println("constr 1");
    }

// alt+insert конструктор
    public Person(String name) {
        System.out.println("constr 2");
        //id++;
        this.name = name;
    }
}
