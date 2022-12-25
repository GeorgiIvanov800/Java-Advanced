package SetsAndMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demoMaps {
    public static void main(String[] args) {
        // Maps -> HashMap, LinkedHashMap, TreeMap
        Map<Integer, String> map = new HashMap<>();

        // 3 ways to iterate a map


        //iterate only the KEYS
        Set<Integer> integers =  map.keySet();


        //iterate keys and values
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        // Iterate values (don't use unless necessary) -> very slow operations
        Collection<String> values = map.values();

    }
}
