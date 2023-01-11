package ModuleAdvanced.FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        //Write a program that reads one line of text from the console. Print the count of words that start with an Uppercase letter,
        // after that print all these words in the same order, as you found them in the text.
        Scanner scanner = new Scanner(System.in);
        Predicate<String> startsWithUppercase = w -> Character.isUpperCase(w.charAt(0));

        List<String> text = Arrays.stream(scanner.nextLine().split(" "))
                .filter(startsWithUppercase)
                .collect(Collectors.toList());

        System.out.println(text.size());
        System.out.println(String.join(System.lineSeparator(),text));

        Consumer<String> printer = System.out::println;
        System.out.println("-----------------------");
        text.forEach(printer);
    }
}
