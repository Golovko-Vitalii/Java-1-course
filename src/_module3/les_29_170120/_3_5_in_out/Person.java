package _module3.les_29_170120._3_5_in_out;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private transient Info info; // поле не будет сериализовано

    // нельзя использовать для не сериализованных классов,
    // все классы должны быть  implements Serializable
    public Person(String name, int age, Info info) {
        this.name = name;
        this.age = age;
        this.info = info;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info=" + info +
                '}';
    }
}
