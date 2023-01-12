package ModuleAdvanced.StacksAndQueues.Exercises;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"5 2 13"
        int n = scanner.nextInt(); // count element which  have to add in the stack
        int s = scanner.nextInt(); // count elements which have to be removed from the stack
        int x = scanner.nextInt(); // num to check if it exists in the stack

        //new stack
        ArrayDeque<Integer> stackNums = new ArrayDeque<>();

        //add the elements in the stackNums
        for (int count = 1; count <= n; count++) {
            stackNums.push(scanner.nextInt());
        }

        // remove elements from the stackNums
        for (int count = 0; count < s; count++) {
            stackNums.pop();
        }
        //if the stack is empty print 0
        if (stackNums.isEmpty()){
            System.out.println("0");
            return;
        }

        //check if the num exists in the stack and print it if not print the smallest element
        if (stackNums.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stackNums));
        }
    }
}
