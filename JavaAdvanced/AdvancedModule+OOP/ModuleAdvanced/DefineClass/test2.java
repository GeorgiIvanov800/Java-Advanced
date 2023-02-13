package ModuleAdvanced.DefineClass;

import java.util.*;
import java.util.stream.Collectors;

public class test2 {
    private static List<String> text2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> text = input.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        Map<String, Integer> pattern = new LinkedHashMap<>();

        for (char currentSymbol : text) {
            String symbol = String.valueOf(currentSymbol);
           if (!pattern.containsKey(symbol)) {
               pattern.put(symbol, 1);
           } else {
               pattern.put(symbol, pattern.get(symbol) + 1);
           }
        }

        fillList(pattern);

        text2.stream().forEach(e -> System.out.print(e));
        System.out.println();

    }





    private static void fillList(Map<String, Integer> pattern) {
        for (var entry : pattern.entrySet()) {
            String symbol = entry.getKey();
            int count = entry.getValue();

            if (count >= 4) {
                text2.add("$");
                text2.add(String.valueOf(count));
                text2.add(symbol);
            } else {
                for (int j = 0; j < count; j++) {
                    text2.add(symbol);
                }
            }
        }
    }


    private static void countSymbol(List text, int count, String symbol) {

        for (int i = 1; i <= count; i++) {
            if (count >= 4) {
                text.add("$");
                String a = String.valueOf(count);
                text.add(a);
                text.add(symbol);
                break;
            } else {
                for (int j = 0; j < count; j++) {
                    text.add(symbol);

                }
                break;
            }
        }
    }
}
