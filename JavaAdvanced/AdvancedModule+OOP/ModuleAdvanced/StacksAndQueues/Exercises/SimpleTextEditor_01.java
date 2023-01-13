package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;
//You are given an empty text. Your task is to implement 4 types of commands related to manipulating the text:
//•	"1 {string}" - appends [string] to the end of the text.
//•	"2 {count}" - erases the last [count] elements from the text.
//•	"3 {index}" - returns the element at position [index] from the text.
//•	"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.
public class SimpleTextEditor_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int commandNUmber = 1; commandNUmber <= n; commandNUmber++) {
            String command = scanner.nextLine();

            if (command.startsWith("1")) {
                // command = "1 {string}"
                textStack.push(currentText.toString());
                String textToAppend = command.split("\\s+")[1];
                currentText.append(textToAppend);

            } else if (command.startsWith("2")) {
                // command = "2 {count}"
                textStack.push(currentText.toString());
                int count = Integer.parseInt(command.split("\\s+")[1]);
                //delete last count symbols
                currentText.delete(currentText.length() - count,currentText.length());
            } else if (command.startsWith("3")) {
                // command = "3 {position}"
                int position = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(currentText.charAt(position - 1));
            } else if (command.startsWith("4")) {
                //!!!!!!!!!
                if (!textStack.isEmpty()) {
                    String last = textStack.pop();
                    currentText = new StringBuilder(last);
                }
            }
        }
    }
}
