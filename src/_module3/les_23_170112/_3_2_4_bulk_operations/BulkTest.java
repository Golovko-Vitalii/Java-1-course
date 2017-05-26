package _module3.les_23_170112._3_2_4_bulk_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkTest {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4));
        List<Integer> listB = new ArrayList<>(Arrays.asList(3, 4, 5, 5, 6, 7, 8));
        List<Integer> listC, listD, listE;
        listC = new ArrayList<>(listA);
        //listD = listA.add(new Integer (0));// error boolean
        //listA.removeAll(listB); // boolean result, mutable list A
        //System.out.println("listA = " + listA); // пересечение A\listB
        listC.removeAll(listB); // boolean result, mutable list A
        System.out.println("listA = " + listA);
        System.out.println("listB = " + listB);
        System.out.println("listC = A \\ listB = " + listC);

        listD = new ArrayList<>(listA);
        listD.retainAll(listB);
        System.out.println("listD = A intersect listB = " + listD);

        listE = new ArrayList<>(listA);
        listE.addAll(listB);
        System.out.println("listE = A + listB = " + listE);
    }
}
