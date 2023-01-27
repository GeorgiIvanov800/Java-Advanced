package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
//Write a simple program that reads a set of numbers from the console and finds the smallest of the numbers using a simple Function

public class _03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>  numbersInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(element -> Integer.parseInt(element)).collect(Collectors.toList());

        //without functional programming
        //System.out.println(Collections.min(numbersInput));

        // using a Consumer
        Consumer<List<Integer>> printMinNum = list -> System.out.println(Collections.min(list));
        printMinNum.accept(numbersInput);

        //using a Function
        Function<List<Integer>, Integer> getMinNumber = list -> Collections.min(list);
        System.out.println(getMinNumber.apply(numbersInput));
    }
}
