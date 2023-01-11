package FirstModule.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split("\\s+");

        for (int i = expressionParts.length - 1; i >= 0; i--) {
            stack.push(expressionParts[i]);
        }

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second = Integer.parseInt(stack.pop());
            int result = 0;


            switch (operation) {
                case "-":
                    result = first - second;
                    break;
                case "+":
                    result = first + second;
                    break;
                default:
                    System.out.println("Unknown operation" + operation);
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
