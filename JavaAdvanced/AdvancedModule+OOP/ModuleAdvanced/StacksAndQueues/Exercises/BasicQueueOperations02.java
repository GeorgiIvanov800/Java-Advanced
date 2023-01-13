package ModuleAdvanced.StacksAndQueues.Exercises;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
//You will be given an integer N representing the number of elements to enqueue (add), an integer S representing the number of elements to dequeue
// (remove/poll) from the queue, and finally, an integer X, an element that you should check whether is present in the queue.
// If it is - prints true on the console, if it is not - print the smallest element currently present in the queue.
public class BasicQueueOperations02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]); // count elements to add in the queue
        int s = Integer.parseInt(input[1]); // count elements to remove from the queue
        int x = Integer.parseInt(input[2]); // element to look for if it is present in the queue
        ArrayDeque<Integer> elementsQueue = new ArrayDeque<>();
        int[] elements = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < elements.length; i++) {
            elementsQueue.offer(elements[i]);
        }

        for (int count = 1; count <= s; count++) {
                elementsQueue.poll();
        }

        if (elementsQueue.contains(x)) {
            System.out.println("true");
        } else {
            int smallestElement = Integer.MAX_VALUE;
            for (Integer element : elementsQueue) {
                if (element < smallestElement) {
                    smallestElement = element;
                }
            }
            if (elementsQueue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(smallestElement);
            }
        }

    }
}
