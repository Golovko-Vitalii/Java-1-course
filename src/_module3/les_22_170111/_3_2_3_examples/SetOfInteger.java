package _module3.les_22_170111._3_2_3_examples;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    public static void main(String[] args) {
        Random ran = new Random(47);
        Set <Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 50; i++) {
            intset.add(ran.nextInt(30));
        }
        System.out.println("intset = " + intset);
    }
}
