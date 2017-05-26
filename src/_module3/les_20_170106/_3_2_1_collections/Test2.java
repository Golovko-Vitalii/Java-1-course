package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(33);
        list.add(555);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
