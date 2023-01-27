package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Check a name for its length and to return true if the length of the name is less or equal to the passed integer.
// You will be given an integer that represents the length you have to use. On the second line, you will be given a string array with some names.
// Print the names
public class _06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] namesInput = scanner.nextLine().split("\\s+");
        Predicate<String> checkLength = str -> str.length() <= length;
        Arrays.stream(namesInput).filter(checkLength).forEach(ele -> System.out.println(ele));
    }
}
