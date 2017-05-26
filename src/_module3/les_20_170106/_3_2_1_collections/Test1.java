package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(333);
        list.add(55);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(5);
        list.add(88);
        for (Integer n : list) {
            System.out.println(n);
        }
        list.add(5);
        System.out.println(list.indexOf(5));
        System.out.println(list);
        boolean noVar = list.isEmpty();
        System.out.println(noVar);
        System.out.println(list.set(0,123));//вернет значение перед записью
        System.out.println(list);
    }
}
