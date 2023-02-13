package ModuleAdvanced.DefineClass;

import java.util.*;
import java.util.stream.Collectors;

public class test2 {
    private static List<String> outputText = new ArrayList<>();
    private static Map<String, Integer> pattern = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> inputText = input.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        for (char currentSymbol : inputText) {
            String symbol = String.valueOf(currentSymbol);

            if (!pattern.containsKey(symbol)) {
                pattern.put(symbol, 1);
            } else {
                pattern.put(symbol, pattern.get(symbol) + 1);
            }
        }

        pattern.entrySet().stream().forEach(ele -> System.out.println(ele.getKey() + " -> " + ele.getValue()));
        System.out.println("<------------->");
        fillList(outputText, pattern);
        outputText.stream().forEach(e -> System.out.print(e));
        System.out.println();

    }


    private static void fillList(List<String> outputText, Map<String, Integer> pattern) {
        for (var entry : pattern.entrySet()) {

            String symbol = entry.getKey();
            int count = entry.getValue();

            if (count >= 4) {
                outputText.add("$");
                outputText.add(String.valueOf(count));
                outputText.add(symbol);
            } else {
                for (int j = 0; j < count; j++) {
                    outputText.add(symbol);
                }
            }
        }
    }

}
