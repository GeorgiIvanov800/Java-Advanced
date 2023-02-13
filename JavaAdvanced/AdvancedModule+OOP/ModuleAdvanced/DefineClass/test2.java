package ModuleAdvanced.DefineClass;

import java.util.*;
import java.util.stream.Collectors;

public class test2 {
    private static List<String> text2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> text = input.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        List<Integer> counters = new ArrayList<>();
        Map<String, Integer> patternt = new LinkedHashMap<>();
        patternt.put("Q", 0);
        patternt.put("R", 0);
        patternt.put("T", 0);
        patternt.put("L", 0);
        patternt.put("M", 0);
        patternt.put("N", 0);
        patternt.put("V", 0);
        patternt.put("A", 0);
        for (int i = 1; i <= 8; i++) {
            counters.add(0);
        }


        for (char currentSymbol : text) {
            if (currentSymbol == ('Q')) {
                patternt.put("Q",patternt.get("Q") + 1);
                counters.set(0,counters.get(0) + 1);
            } else if (currentSymbol == ('R')) {
                counters.set(1,counters.get(1) + 1);
            } else if (currentSymbol == ('T')) {
                counters.set(2,counters.get(2) + 1);
            } else if (currentSymbol == ('L')) {
                counters.set(3,counters.get(3) + 1);
            } else if (currentSymbol == ('M')) {
                counters.set(4,counters.get(4) + 1);
            } else if (currentSymbol == ('N')) {
                counters.set(5,counters.get(5) + 1);
            } else if (currentSymbol == ('V')) {
                counters.set(6,counters.get(6) + 1);
            } else if (currentSymbol == ('A')) {
                counters.set(7,counters.get(7) + 1);
            }
        }
        System.out.println();

//        countSymbol(text2,counterQ,"Q");
//        countSymbol(text2,counterR,"R");
//        countSymbol(text2,counterT, "T");
//        countSymbol(text2,counterL,"L");
//        countSymbol(text2,counterM,"M");
//        countSymbol(text2,counterN,"N");
//        countSymbol(text2,counterV,"V");
//        countSymbol(text2,counterA,"A");

        text2.stream().forEach(e -> System.out.print(e));


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
