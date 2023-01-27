package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a custom comparator that sorts all even numbers before all odd ones in ascending order.
public class _08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(ele -> Integer.parseInt(ele)).collect(Collectors.toList());
        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).toArray(Integer[] :: new);
        Comparator<Integer> comparator = (num1, num2) -> {
            //compare logic
            if (num1 % 2 == 0 && num2 % 2 != 0) {
                //num1 is odd
                //num2 is even
                return -1;
            } else if (num1 % 2 != 0 & num2 % 2 == 0) {
                //num1 even
                //num2 odd
                return 1;
            } else {
                return num1.compareTo(num2);
            }
        };
        Arrays.sort(numbers, comparator);
        Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));


    }
}
