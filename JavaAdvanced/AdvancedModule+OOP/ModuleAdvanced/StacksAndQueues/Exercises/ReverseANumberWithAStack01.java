package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
//Write a program that reads N integers from the console and reverses them
public class ReverseANumberWithAStack01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            numbersStack.push(numbers[i]);
        }

        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");
        }
    }
}
