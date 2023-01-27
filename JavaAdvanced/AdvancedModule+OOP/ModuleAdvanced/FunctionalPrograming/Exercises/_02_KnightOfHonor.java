package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

//Write a program that reads a collection of names as strings from the console and then appends
// "Sir" in front of every name and prints it back onto the console.
public class _02_KnightOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNames = scanner.nextLine().split("\\s+");

        Consumer<String[]> printArray = array -> {
            for (String name : array) {
                System.out.println("Sir " + name);
            }
        };

        printArray.accept(inputNames);
    }
}
