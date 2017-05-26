package _module3.les_22_170111._3_2_2_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap <>();
        map.put("jan",31);map.put("feb", 28);
        map.put("mar",31);map.put("apr", 30);

        System.out.println(map.get("feb"));
        map.remove("apr");
        map.remove("apr",21);//не удалит, если по апрелю не 21
        System.out.println(map);
        // 1. мноество (set) ключей
        Set <String> keySet = map.keySet();
        System.out.println("keySet = " + keySet);
        // 2. коллекция значений
        Collection values = map.values();
        System.out.println(values);
        // 3. множество (set) ключ-значение (Entry)
        //class Entry{String key; Integer value;}
        Set <Map.Entry<String,Integer>> keyValues = map.entrySet();
        List<Map.Entry<String,Integer>>list=new ArrayList<>();
        //System.out.println("keyValues = " + keyValues);
        for (Map.Entry<String, Integer> kV : keyValues) {
            System.out.println(kV.getKey()+" = "+ kV.getValue());
            list.add(kV);
        }
        System.out.println("-первое попавшееся-"+keyValues.iterator().next());

        System.out.println("has key=jan ? "+map.containsKey("jan"));
        System.out.println("has value=28 ? "+map.containsValue(28));

        //" ".hashCode();
        System.out.println("jan".hashCode());
    }
}
