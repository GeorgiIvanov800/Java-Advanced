package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPlants = Integer.parseInt(scanner.nextLine());
        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stackPlants = new ArrayDeque<>();

        int[] days = new int[plants.length];

        stackPlants.push(0);

        for (int i = 1; i < plants.length; i++) {
            int maxDays = 0;

            while (stackPlants.size() > 0 && plants[stackPlants.peek()] >= plants[i]) {

                maxDays = Integer.max(days[stackPlants.pop()], maxDays);
            }

            if (stackPlants.size() > 0) {
                days[i] = maxDays + 1;
            }

            stackPlants.push(i);
        }

        System.out.printf("%d", Arrays.stream(days).max().getAsInt());
    }
}
