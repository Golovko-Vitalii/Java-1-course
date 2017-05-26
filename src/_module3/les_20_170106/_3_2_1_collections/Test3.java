package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(555);
        list.add(555);
        System.out.println(list.subList(0,3));
        list.subList(1,3).clear();
        for (Integer integer : list) {
            System.out.println(integer);
        }
        list.add(20);
        list.add(20);
        list.add(20);
        list = Collections.unmodifiableList(new ArrayList<Integer>(list));
        System.out.println(list);
        try {
            list.subList(1,3).clear();
        } catch (Exception e) {
            System.out.println("can't clear sublist in unmodifiableList");
        }
        try {
            System.out.println(list.remove(0));
        } catch (Exception e) {
            System.out.println("can't remove unmodifiableList");
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
