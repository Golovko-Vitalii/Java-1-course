package _module3.les_21_170110._home_work;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/*Придумать, какой еще объект подходит для HashMap.
        Реализовать его самостоятельно*/
public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> wordsCount = new HashMap<>();
        wordsCount.put(1, "one");
        wordsCount.put(2, "two");
        wordsCount.put(3, "three");
        wordsCount.put(4, "four");
        wordsCount.put(5, "five");
        for (Map.Entry<Integer, String> entry : wordsCount.entrySet()) {
            int r = new Random().nextInt(5) + 1;
            if (entry.getKey() > r) System.out.println(entry.getValue() + " more then " + r);
            else System.out.println(entry.getValue() + " less or equal then " + r);
        }
    }
}
