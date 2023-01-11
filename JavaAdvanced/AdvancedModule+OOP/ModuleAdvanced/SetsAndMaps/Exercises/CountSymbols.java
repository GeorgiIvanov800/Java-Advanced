package ModuleAdvanced.SetsAndMaps.Exercises;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    //Write a program that reads some text from the console and counts the occurrences of each character in it.
    // Print the results in alphabetical
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (!symbolMap.containsKey(symbol)) {
                symbolMap.put(symbol, 1);
            } else {
                symbolMap.put(symbol, symbolMap.get(symbol) + 1);
            }
        }

        for (var entry : symbolMap.entrySet()) {
            System.out.printf("%s: %d time/s%n",entry.getKey(), entry.getValue());
        }
    }
}
