package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Write a program that reverses a collection of numbers and removes elements that are divisible by a given integer n.
public class _05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(ele -> Integer.parseInt(ele)).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        //1. Reverse the list
        Collections.reverse(numbersList);
        //2. Remove all elements divisible by 'n' (true / false)
        Predicate<Integer> checkDivision = number -> number % n == 0;
        //returns true -> n is divisible by the number
        //returns false -> n is not divisible by the number
        numbersList.removeIf(checkDivision);
        Consumer<List<Integer>> printList = list -> list.forEach(ele -> System.out.print(ele + " "));
        printList.accept(numbersList);
    }
}
