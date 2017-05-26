package _module3.les_21_170110._3_2_2_set_map;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(555);
        list.add(333);
        list.add(555);
        list.add(111);
        System.out.println("list = " + list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("set = " + set);
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        System.out.println();
        set.remove(99);
        System.out.println("set = " + set);
        System.out.println("has 555? " + set.contains(555));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(555, 123));
        System.out.println("set1 = " + set1);
        System.out.println("after removeAll set1, set = " + set.removeAll(set1));
        System.out.println("set = " + set);
        System.out.println("after removeAll {333,111} , set = " +
                set.removeAll(new HashSet<>(Arrays.asList(333, 111))));
        System.out.println("set = " + set);
        Set<Object> set3 = new HashSet<>(Arrays.asList(555, 123));
        set3.add(Collections.emptySet());
        System.out.println(set3.removeAll(Collections.emptySet()));
        //Homework
        //[1,2,3,4,5] -> [3,5,2,4,1] c помощью set
        //LinkedHashSet
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("hashSet = " + hashSet);
        hashSet.clear();
        while (hashSet.size() < 5) hashSet.add(new Random().nextInt(5) + 1);
        System.out.println("hashSet + random = " + hashSet);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("linkedHashSet = " + linkedHashSet);
        linkedHashSet.clear();
        while (linkedHashSet.size() < 5) linkedHashSet.add(new Random().nextInt(5) + 1);
        System.out.println("linkedHashSet + random = " + linkedHashSet);
    }
}
