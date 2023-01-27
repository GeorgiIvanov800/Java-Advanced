package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
//Write a program that is using a custom function  to find the smallest integer in a sequence of integers and print the index of that element.

public class _07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(ele -> Integer.parseInt(ele)).collect(Collectors.toList());

        //int minElement = Collections.min(numbersList);
        //list -> print the most right (last index of the smallest number in the list)

//        Consumer<List<Integer>> printLastIndexOfMinElement = list -> System.out.println(list.lastIndexOf(minElement));
//        printLastIndexOfMinElement.accept(numbersList);

        Function<List<Integer>, Integer> getLastIndexOfMinElement = list -> list.lastIndexOf(Collections.min(list));
        System.out.println(getLastIndexOfMinElement.apply(numbersList));
    }
}
