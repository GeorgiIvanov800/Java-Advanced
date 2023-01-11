package FirstModule.SetsAndMaps.Exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] setSizes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int firstSize = setSizes[0];
        Set<Integer> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSize; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }

        int secondSize = setSizes[1];
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < secondSize; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        //keep only elements that are presence in the both sets
        firstSet.retainAll(secondSet);

        firstSet.forEach(element -> System.out.print(element + " "));


    }
}
