package SetsAndMaps.Exercises;

import java.util.*;

public class PeriodicTable {
    //are given an 'n' number of chemical compounds. You need to keep track of all chemical elements used in the compounds
    // and at the end print all unique ones in ascending order.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompounds = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < numberOfCompounds; i++) {
            String[] elementsInput = scanner.nextLine().split("\\s+");
            Collections.addAll(elements, elementsInput);
        }

        String result = String.join(" ",elements);
        System.out.println(result);

    }
}
