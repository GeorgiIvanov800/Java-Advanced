package ModuleAdvanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OsPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasksStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(ele -> tasksStack.push(ele));

        ArrayDeque<Integer> threadQueue = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int taskValue = Integer.parseInt(scanner.nextLine());

        int task = tasksStack.peek();
        int thread = threadQueue.peek();

        while (task != taskValue) {

            if (thread >= task) {
                tasksStack.pop();
            }

            threadQueue.poll();


            task = tasksStack.peek();
            thread = threadQueue.peek();
        }
        System.out.printf("Thread with value %d killed task %d%n", threadQueue.peek(), taskValue);
        String leftThreads = threadQueue.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(leftThreads);
    }
}
