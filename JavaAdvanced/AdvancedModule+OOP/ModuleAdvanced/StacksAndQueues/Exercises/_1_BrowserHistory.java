package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackHistory = new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")) {

            if (currentInput.equals("back")) {
                if (stackHistory.isEmpty() || stackHistory.size() == 1) {
                    System.out.println("no previous URLs");
                    currentInput = scanner.nextLine();
                    continue;
                } else {
                    stackHistory.pop();
                    System.out.println(stackHistory.peek());
                }
            } else {
                stackHistory.push(currentInput);
                System.out.println(stackHistory.peek());
            }

            currentInput = scanner.nextLine();
        }
    }
}
