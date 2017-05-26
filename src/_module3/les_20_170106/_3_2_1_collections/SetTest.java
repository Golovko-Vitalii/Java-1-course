package _module3.les_20_170106._3_2_1_collections;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(333);
        list.add(555);
        list.add(555);
        System.out.println("list= " + list);

        Set <Integer> set = new HashSet<>(list);
        System.out.println("set = " + set);
        set.add(99);
        set.add(999);
        System.out.println("set = " + set);

        for (Integer integer : set) {
            System.out.print(integer + " ");
        }

        System.out.println();
        set.remove(99);
        System.out.println("set = " + set);

        System.out.println("has 555? " +set.contains(555) );

        Set <Integer> set1 = new HashSet<>(Arrays.asList(555,333));
        System.out.println("set1 = " + set1);
        set.removeAll(set1);//ot seta - set1
        System.out.println("after removeAll, set = " + set);
        System.out.println(set.removeAll(Collections.emptySet()));//pustoe mnozhestwo


        //[1,2,3,4,5]   -> [3,5,2,4,1]  s pom set
        //while(size = Arrays.length)
        //(LinkedHashSet)
    }
}
