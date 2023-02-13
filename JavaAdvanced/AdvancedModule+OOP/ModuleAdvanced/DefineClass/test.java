package ModuleAdvanced.DefineClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    private static List<String> text2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> text = input.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Integer> counters = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            counters.add(0);
        }
        int counterQ = 0;
        int counterR = 0;
        int counterT = 0;
        int counterL = 0;
        int counterM = 0;
        int counterN = 0;
        int counterV = 0;
        int counterA = 0;

        for (char currentSymbol : text) {
            if (currentSymbol == ('Q')) {
                counterQ++;
                counters.set(0, counters.get(0) + 1);
            } else if (currentSymbol == ('R')) {
                counterR++;
                counters.set(1, counters.get(1) + 1);
            } else if (currentSymbol == ('T')) {
                counterT++;
                counters.set(2, counters.get(2) + 1);
            } else if (currentSymbol == ('L')) {
                counterL++;
                counters.set(3, counters.get(3) + 1);
            } else if (currentSymbol == ('M')) {
                counterM++;
                counters.set(4, counters.get(4) + 1);
            } else if (currentSymbol == ('N')) {
                counterN++;
                counters.set(5, counters.get(5) + 1);
            } else if (currentSymbol == ('V')) {
                counterV++;
                counters.set(6, counters.get(6) + 1);
            } else if (currentSymbol == ('A')) {
                counterA++;
                counters.set(7, counters.get(7) + 1);
            }
        }

        countSymbol(text2, counterQ, "Q");
        countSymbol(text2, counterR, "R");
        countSymbol(text2, counterT, "T");
        countSymbol(text2, counterL, "L");
        countSymbol(text2, counterM, "M");
        countSymbol(text2, counterN, "N");
        countSymbol(text2, counterV, "V");
        countSymbol(text2, counterA, "A");

        text2.stream().forEach(e -> System.out.print(e));


    }


    private static void countSymbol(List<String> text, int count, String symbol) {

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
