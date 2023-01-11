package FirstModule.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Deque<Integer> indices = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                indices.push(i);
            } else if (input.charAt(i) == ')') {
                int openBracketIndex = indices.pop();

                String expression = input.substring(openBracketIndex, i + 1);
                System.out.println(expression);
            }
        }
    }
}
