package ModuleAdvanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Write a program which takes filenames until the "print" command is received.
// Then as output, print the filenames in the order of printing.
// Some tasks may be canceled. If you receive "cancel" you have to remove the first file to be printed.
// If there is no current file to be printed, print "Printer is on standby".
public class PrinterQueues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<String> printerQueue = new ArrayDeque<>();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }

            } else {
                printerQueue.offer(input);
            }
            input = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
