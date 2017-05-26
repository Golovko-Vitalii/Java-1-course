package _module3.les_20_170106._3_2_1_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableTest {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("AB");
        list.add("CD");
        list.add("EF");
        List <String> unmodList = Collections.unmodifiableList(list);
        //unmodList.add("D"); //error- nelza modifitsirowat etot class!!!
        //unmodList.set(0,"D"); //error
        // Внимание! Из исходного списка можно поменять!
        list.set(0,"CHANGED!"); //!!! changes unmodList
        System.out.println("unmodList = " + unmodList);
        // 100% unmodified:
        List <String> unmodList2 = Collections.unmodifiableList(
                new ArrayList<>(list));
        //peresozdaet nowyj AL s new ssylkami na osnowe lista
        list.set(0,"CHANGED AGAIN!");//not changes unmodList2!
        System.out.println("list = " + list);
        System.out.println("unmodList2 = " + unmodList2);
    }
}
