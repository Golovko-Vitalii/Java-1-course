package _module3.les_21_170110._3_2_2_set_map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println("set = " + set);
        for (Integer i : set) {
            System.out.println("for i from set = " + i);
        }
        Iterator<Integer> iterSet = set.iterator();
        while (iterSet.hasNext()) {
            System.out.println("iterSet.next() = " + iterSet.next());
        }
        while (iterSet.hasNext()) {//нужно создать новый итератор на сете
            System.out.println("iterSet.next() = " + iterSet.next());
        }
        set.remove(1);
        System.out.println("set = " + set);
        set.clear();
        System.out.println("set = " + set);
        set.add(123);
        set.add(333);
        System.out.println("set = " + set);
        System.out.println("set.contains(123) = " + set.contains(123));
        Set<Integer> set2 = new HashSet<>();
        System.out.println(set2.add(123));
        set2.add(1);
        set2.add(new Integer(1));//проверяет по hash Integer
        set2.add(789);
        set2.add(new Integer(789));
        set2.add(null);
        set2.add(null);
        System.out.println("set2 = " + set2);
        System.out.println(set.removeAll(set2));
        System.out.println("after set.removeAll(set2) = " + set);
        for (Integer i : set2) {
            System.out.println("fori set2 i = " + i);
        }
    }
}
