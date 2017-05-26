package _module3.les_21_170110._3_2_2_set_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("key1", 10);
        map1.put("key2", 11);
        map1.put("key3", 12);
        System.out.println(map1.get("key1"));
        map1.remove("key2");
        System.out.println(map1.size());
        Set<String> strings = map1.keySet();//get map keys throu set
        for (String s : strings) {
            System.out.println(s);
        }
        for (String s : map1.keySet()) {
            System.out.println(s);
        }
        // values 1
        for (Integer i : map1.values()) {
            System.out.println(i);
        }
        //values 2
        for (String k : map1.keySet()) {
            System.out.println(map1.get(k));
        }
        // couple 1
        for (Map.Entry<String, Integer> i : map1.entrySet()) {
            System.out.println(i);
        }
        // couple 2
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        // check map for containings key an value
        System.out.println("map1.containsKey(\"key1\") = " + map1.containsKey("key1"));
        System.out.println("map1.containsValue(11) = " + map1.containsValue(11));
        System.out.println(Integer.MAX_VALUE);
        //Map <Integer,String> map2 = new HashMap<>(Integer.MAX_VALUE/2,0.75);//max capacity = Integer.MAX_VALUE/2
        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            map2.put(i, Integer.toString(i));
            System.out.println(map2.get(i));
        }
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry);
        }
    }
}
