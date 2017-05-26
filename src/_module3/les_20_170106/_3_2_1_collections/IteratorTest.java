package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        Iterator <Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        itr = list.iterator();
        while (itr.hasNext()){
            if (itr.next()==44) itr.remove();
        }

        System.out.println(list);
    }
}
