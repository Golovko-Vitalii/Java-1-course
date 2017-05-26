package _module2.les_09_161209._2_2_1_static_nonstatic_blocks;

public class PersonTest {
    static {
        System.out.println("Hello before void main");
    }
    public static void main(String[] args) {
        System.out.println(Person.getId());
        Person p1 = new Person("Bob");
        Person p2 = new Person("Jack");
        Person p3 = new Person();
        System.out.println(Person.getId());
    }
}
