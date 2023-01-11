package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream( scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int countToPush = input[0]; // number of elements to push
        int countToPop = input[1]; // number of elements to pop
        int elementToSearch = input[2]; // element to look for

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countToPush; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }

        if (stack.contains(elementToSearch)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(stack));
        }
            /*System.out.println(stack.stream().min(Integer::compare).get());

            System.out.println(stack.stream().mapToInt(e -> e).min().getAsInt());

            int minElement = Integer.MAX_VALUE;
            for (Integer integer : stack) {                                     !other ways to find the min value!
                if (integer < minElement) {
                    minElement = integer;
                }
            }
            System.out.println(minElement);*/
    }
}
