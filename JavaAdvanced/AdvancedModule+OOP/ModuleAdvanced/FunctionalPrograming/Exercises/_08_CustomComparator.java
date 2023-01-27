package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a custom comparator that sorts all even numbers before all odd ones in ascending order.
public class _08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(ele -> Integer.parseInt(ele)).collect(Collectors.toList());

        //Comparator<List<Integer>> sortNumbers = list -> list.sort(num -> num % 2 = 0);
    }
}
