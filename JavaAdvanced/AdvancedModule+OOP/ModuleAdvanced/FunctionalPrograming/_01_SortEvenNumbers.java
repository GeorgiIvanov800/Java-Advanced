package ModuleAdvanced.FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(", "))
                .map(elem -> Integer.parseInt(elem)).collect(Collectors.toList());
        numList.removeIf(num -> num % 2 != 0);
        String first = numList.stream().map(ele -> String.valueOf(ele))
                .collect(Collectors.joining(", "));
        System.out.println(first);

        System.out.println(numList.stream().sorted()
                .map(ele -> String.valueOf(ele)).collect(Collectors.joining(", ")));
    }

}
