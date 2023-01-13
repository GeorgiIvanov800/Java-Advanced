package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;
//You have an empty sequence, and you will be given N commands. Each command is one of the following types:
//•	"1 X" - Push the element X into the stack.
//•	"2" - Delete the element present at the top of the stack.
//•	"3" - Print the maximum element in the stack.
public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numberStack = new ArrayDeque<>();
        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countCommands; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");
            String command = commandParts[0];

            switch (command) {
                case "1":
                    //add element into the stack
                    int element = Integer.parseInt(commandParts[1]);
                    numberStack.push(element);
                    break;
                case "2":
                    //delete the element at the top of the stack
                    numberStack.pop();
                    break;
                case "3":
                    int maxElement = 0;
                    for (Integer num : numberStack) {
                        if (num > maxElement) {
                            maxElement = num;
                        }
                    }
                    System.out.println(maxElement);
                    break;
                default:
                    System.out.println("Unknown command " + command);
            }
        }

    }
}
