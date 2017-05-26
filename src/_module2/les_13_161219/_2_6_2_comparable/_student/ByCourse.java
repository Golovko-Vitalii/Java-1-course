package _module2.les_13_161219._2_6_2_comparable._student;

import java.util.Comparator;

public class ByCourse implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        return s1.getCourse()-s2.getCourse();
    }
}
