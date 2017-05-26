package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListTest {
    public static void main(String[] args) {
        //list, backed by array
        List<Integer> list0 = Arrays.asList(33,55,66);//cannot add elements!!!
        //list.add(1);//error!
        list0.set(0,11); // ok
        System.out.println(list0);
        //array -> ArrayList
        Integer [] arr = {33,55,66,77,88};
        // list, backed by array :
        List<Integer> list = Arrays.asList(arr);//не изменяемый//construktor
        // cannot add elements
        //list.add(5);//нельзя
        list.set(0,1);//ok
        System.out.println(list);
        System.out.println(list.getClass());
        // Array -> ArrayList
        List <Integer> list2 = new ArrayList<>(Arrays.asList(arr));//настоящий Array List, можно изменять
        list2.add(0,99);
        System.out.println(list2);
        System.out.println(list2.getClass());
        list.set(0,0);
        System.out.println(list);
        System.out.println(list2);

        //sublist - 55,66,77
        List <Integer> sublist = list2.subList(2,5);//ne vklu4aja
        System.out.println("sublist = " + sublist);
        sublist.set(0,1000);// changes list2
        sublist.add(100000);
        System.out.println("list2 = " + list2);

        list2.subList(2,5).clear();//del so 2 po 5
        System.out.println("list2 = " + list2);

        // ArrayList -> Array
        Integer [] array1 = list2.toArray(new Integer[list2.size()]); // list2.size() or 0// or new Integer[0]
        list2.set(2,0);
        System.out.println("toArray(new Integer[list2.size()]) = "+Arrays.toString(array1));
        System.out.println("list2 = " + list2);

        Object [] array2= list2.toArray();
        list2.set(1,0);
        System.out.println("toArray() = "+Arrays.toString(array2));

    }
}
