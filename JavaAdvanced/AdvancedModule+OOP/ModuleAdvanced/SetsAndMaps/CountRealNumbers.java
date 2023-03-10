package ModuleAdvanced.SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble)
                .forEach(key -> {

                    map.putIfAbsent(key, 0);
                    int oldCount = map.get(key);
                    int newCount = oldCount + 1;
                    map.put(key, newCount);

/*
                   if (map.containsKey(key)) {
                        //+1 for the value
                        int oldCount = map.get(key);
                        int newCount = oldCount + 1;
                        map.put(key, newCount);
                    } else {
                        map.put(key, 1);
                    }
*/
                });

        for (var entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
