package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(new Integer(111));//boxing
        list.add(222);
        list.add(444);
        list.add(555);
        list.add(555);
        list.add(555);
        list.add(2,333);
        System.out.println("1 list = " + list);
        int a = list.get(3);
        System.out.println("a = " + a);
        list.remove(3);
        System.out.println("2 list = " + list);
        list.remove(new Integer(555));// для удаления элемента нужен боксинг
        System.out.println("3 list = " + list);
        list.removeIf(i -> i==555);
        System.out.println("4 list = " + list);

        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();
        list.set(0,999);
        System.out.println("5 list = " + list);

        System.out.println("indexOf 333 = "+list.indexOf(333));

        List <Integer> list1 = new ArrayList<>(list.subList(1,2));
        System.out.println("list1 = " + list1);
    }
}
