package _module3.les_22_170111._3_2_3_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistic {//HashMap
    public static void main(String[] args) {
        Random ran = new Random(47);
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for (int i = 0; i < 10000; i++) {
            //Random int from 0 to 20
            int r = ran.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
