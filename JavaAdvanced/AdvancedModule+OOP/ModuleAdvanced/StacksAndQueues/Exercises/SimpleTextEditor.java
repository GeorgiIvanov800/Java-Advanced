package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stackCommands = new ArrayDeque<>();
        ArrayDeque<String> removedElements = new ArrayDeque<>();

        for (int i = 0; i <= n; i++) {
            String rawCommand = scanner.nextLine();
            String[] commandArguments = rawCommand.split("\\s+");
            String commandType = commandArguments[0];

            switch (commandType) {
                case "1":
                    stackCommands.push(rawCommand);
                    executeAdd(commandArguments[1], text);
                    break;
                case "2":
                    stackCommands.push(rawCommand);
                    int countToDelete = Integer.parseInt(commandArguments[1]);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int j = text.length() - countToDelete; j < text.length(); j++) {
                        stringBuilder.append(text.charAt(j));
                    }
                    removedElements.push(stringBuilder.toString());
                    executeDelete(countToDelete, text);
                    break;
                case "3":
                    int index = Integer.parseInt(commandArguments[1]);
                    System.out.printf("%s%n", text.charAt(index - 1));
                    break;
                case "4":
                    String lastCommand = stackCommands.pop();
                    String[] lastCommandArguments = lastCommand.split("\\s+");
                    String lastCommandType = lastCommandArguments[0];
                    switch (lastCommandType) {
                        case "1":
                            //previous command was append
                            // now have to delete
                            int count = lastCommandArguments[1].length();
                            executeDelete(count, text);
                            break;
                        case "2":
                            //previous command was delete
                            // now have to append
                            String elementToAddBack = removedElements.pop();
                            executeAdd(elementToAddBack, text);
                            break;
                    }
                    break;
            }
        }
    }

    private static void executeDelete(int countToDelete, StringBuilder text) {
        for (int i = 1; i <= countToDelete; i++) {
            text.deleteCharAt(text.length() - 1);
        }
    }

    private static void executeAdd(String commandArgument, StringBuilder text) {
        text.append(commandArgument);
    }
}
