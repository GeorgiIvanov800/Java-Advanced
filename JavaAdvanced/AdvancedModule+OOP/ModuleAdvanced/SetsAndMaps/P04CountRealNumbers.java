package ModuleAdvanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> occurrences = new LinkedHashMap<>();

        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            double current = Double.parseDouble(number);
            if (occurrences.containsKey(current)) {
                int count = occurrences.get(current);
                occurrences.put(current, count + 1);
            } else {
                occurrences.put(current, 1);
            }
        }
        for (var entry : occurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
