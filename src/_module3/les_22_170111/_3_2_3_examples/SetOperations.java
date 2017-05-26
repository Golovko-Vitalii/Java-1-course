package _module3.les_22_170111._3_2_3_examples;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set <String> set1 = new HashSet<String>();
        set1.addAll(Arrays.asList("A B C D E F G H I J K L".split(" ")));
        set1.add("M");
        System.out.println("set1 = " + set1);
        System.out.println("set1.contains(\"H\") = "+set1.contains("H"));
        System.out.println("set1.contains(\"N\") = "+set1.contains("N"));
        Set <String> set2 = new HashSet<String>();
        set2.addAll(Arrays.asList("H I J K L".split(" ")));
        System.out.println("set2 = " + set2);
        System.out.println("set1.containsAll(set2) = "+set1.containsAll(set2));
        set1.remove("H");
        System.out.println("set1 = " + set1);
        System.out.println("set1.containsAll(set2) = "+set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set2 removed from set1 = " + set1);
        set1.addAll(Arrays.asList("X Y Z".split(" ")));
        System.out.println("set1 = " + set1);
    }
}
