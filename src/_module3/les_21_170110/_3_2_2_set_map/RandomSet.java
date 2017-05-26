package _module3.les_21_170110._3_2_2_set_map;

import java.util.*;

/**
 * Реализовать генератор случайных перестановок
 * элементов типа Integer, используя HashSet
 */
public class RandomSet {
    public static void main(String[] args) {
        int n = 5;
        Set<Integer> set = new HashSet<>();
        Random r = new Random();
        while (set.size() < n) {
            set.add(r.nextInt(n) + 1);
        }
        System.out.println(set);
        //-----------------------------
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        Collections.shuffle(list);
        System.out.println(list);
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);

    }
}
