package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

//On the first line, you are given a list of numbers. On the next lines you are passed different commands that you need to apply to all numbers in the list
// "add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1; "print" -> prints all numbers on a new line.
// The input will end with an "end" command, after which the result must be printed.
public class _04_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(element -> Integer.parseInt(element)).collect(Collectors.toList());

        String command = scanner.nextLine();
        Function<List<Integer>, List<Integer>> addCommand = list -> list.stream().map(number -> number += 1).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiplyCommand = list -> list.stream().map(number -> number *= 2).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> subtractCommand = list -> list.stream().map(number -> number -= 1).collect(Collectors.toList());

        Consumer<List<Integer>> printNumbers = list -> list.forEach(ele -> System.out.print(ele + " "));

        while (!command.equals("end")) {

            switch (command) {
                case "add":     //add -> + 1 every element in the list -> and return the list with the new modification
                    numbersInput = addCommand.apply(numbersInput);
                    break;
                case "multiply":  // multiply -> * 2 every element in the list
                    numbersInput = multiplyCommand.apply(numbersInput);
                    break;
                case "subtract":  // - 1 on every element
                    numbersInput = subtractCommand.apply(numbersInput);
                    break;
                case "print":   // prints the elements on a new line
                    printNumbers.accept(numbersInput);
                    System.out.println();
                    break;
                default:
                    System.out.println("Unknown command " + command);
            }

            command = scanner.nextLine();
        }
    }
}
