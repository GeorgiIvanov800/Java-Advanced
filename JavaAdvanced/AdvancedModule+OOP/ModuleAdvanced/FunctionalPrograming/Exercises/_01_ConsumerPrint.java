package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

//Write a program that reads a collection of strings, separated by one or more whitespaces,
// from the console and then prints them onto the console. Each string should be printed on a new line.
public class _01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Consumer<String> printNames = name -> System.out.println(name);
        Arrays.stream(input).forEach(printNames);

/*
        Consumer<String[]> printArray = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };
*/
    }
}
