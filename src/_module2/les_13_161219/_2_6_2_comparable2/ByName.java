package _module2.les_13_161219._2_6_2_comparable2;

import java.util.Comparator;

public class ByName implements Comparator <Person>{
    /*@Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.getName().compareTo(p2.getName());
    }*/

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
