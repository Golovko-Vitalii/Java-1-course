package _module3.les_20_170106._home_work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать новую коллекцию только для чтенияж
 */
public class Task1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("sf");
        list.add("ff");
        list.add("hf");
        list.add("kf");
        list.add(";f");
        System.out.println("list = " + list);
        List <String> unmodList = Collections.unmodifiableList(new ArrayList<>(list));
        try {
            unmodList.set(0,"0");
        } catch (Exception e) {
            System.out.println("can't change list set(0,\"0\")!");
        }
        try {
            unmodList.add("dd");
        } catch (Exception e) {
            System.out.println("can't add element to list add(\"dd\")!");
        }
        System.out.println("unmodList = " + unmodList);

    }
}

