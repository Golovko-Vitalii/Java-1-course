package _module3.les_23_170112._3_2_4_invert_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class InvertTask {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("jan", 31);
        map1.put("feb", 28);
        map1.put("mar", 31);
        map1.put("apr", 30);
        map1.put("may", 31);
        map1.put("jun", 30);
        System.out.println("map1 = " + map1);
        Map<Integer, ArrayList<String>> map2 = new HashMap<>();//  {}

        /* Set <Integer> uniqValues = new HashSet<>(map.values());  //[28,30,31]
        for (Integer uniqValue : uniqValues) { // { 28=[], 30=[], 31=[] }
            map2.put(uniqValue,new ArrayList<>());
        }*/

        Map<Integer, ArrayList<String>> map3 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) { // "feb"=28
            // 1
            ArrayList<String> strings = new ArrayList<>();
            if (map2.containsKey(entry.getValue())) strings = map2.get(entry.getValue());
            strings.add(entry.getKey());
            map2.put(entry.getValue(), new ArrayList<>(strings));
            // 2
            Integer days = entry.getValue();  //28
            String month = entry.getKey();   //"feb"
            if (!map3.containsKey(days)) map3.put(days, new ArrayList<>());
            List<String> tmp = map3.get(days);
            tmp.add(month);        //{ 28=[feb], 30=[], 31=[] }
        }
        System.out.println("map2 = " + map2);
        System.out.println("map3 = " + map3);
    }
}
