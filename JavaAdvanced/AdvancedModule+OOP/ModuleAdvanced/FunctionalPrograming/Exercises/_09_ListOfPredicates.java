package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

//Find all numbers in the range 1-N that is divisible by the numbers of a given sequence
public class _09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(ele -> Integer.parseInt(ele)).collect(Collectors.toList());

        BiFunction<Integer, List<Integer>, Boolean> isDivisible = ((number, list) -> {
           for (int numInList : list) {
               if (number % numInList != 0) {
                   return false;
               }
           }
               return true;
        });

        for (int number = 1; number <= n; number++) {
            if (isDivisible.apply(number, numbersList)) {
                System.out.print(number + " ");
            }
        }
    }

}
