package _module3.les_23_170112._3_2_4_invert_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMapMethod {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jan", 123);
        map.put("feb", 29);
        map.put("mar", 56);
        map.put("apr", 30);
        map.put("may", 56);
        map.put("jun", 123);
        System.out.println(invertMap(map));
    }

/*    static  Map<Integer, ArrayList<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, ArrayList<String>> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            String key = entry.getKey();
            if (!map2.containsKey(value)) map2.put(value, new ArrayList<>());
            List<String> tmp = map2.get(value);
            tmp.add(key);
        }
        return map2;
    }
}*/

    static <K, V> Map<K, List<V>> invertMap(Map<V, K> map) {
        Map<K, List<V>> map2 = new HashMap<>();
        for (Map.Entry<V, K> entry : map.entrySet()) {
            K value = entry.getValue();
            V key = entry.getKey();
            if (!map2.containsKey(value)) map2.put(value, new ArrayList<>());
            map2.get(value).add(key);
        }
        return map2;
    }
}
