package _module3.les_23_170112._3_2_4_equals;

import java.util.ArrayList;
import java.util.HashSet;

public class TestEquals {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("bread", 10));
        list.add(new Product("bread", 10));
        System.out.println("list = " + list);
        System.out.println(list.contains(new Product("bread", 10)));// false, different objects

        HashSet<Product> set = new HashSet<>();
        set.add(new Product("bread", 10));
        set.add(new Product("bread", 10));
        System.out.println("set = " + set);
        System.out.println(set.contains(new Product("bread", 10)));

        System.out.println(new Product("bread", 10));
        System.out.println(new Product("bread", 10));
        // Рефлексивность a=a
        // Симметричность a=b => b=a
        // Рефлексивность a=b, b=c => a=c
        // time independent
        // null =/= obj
    }
}
