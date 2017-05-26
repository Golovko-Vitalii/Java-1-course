package _module2.les_09_161209._2_2_1_static_nonstatic;

public class isOlderThan {
    public static void main(String[] args) {
        Person p1 = new Person("Sam", 30);
        Person p2 = new Person("Max", 25);
        String s;
        if (Person.compareByAge(p1,p2)>0) {
            s = " is older than ";
        } else {
            s = " is younger than ";
        }
        System.out.println(p1.getName() + s + p2.getName());
        System.out.println(p1.isOlderThan(p2));
        System.out.println(p1.isOlderThan2(p2));
    }
}
