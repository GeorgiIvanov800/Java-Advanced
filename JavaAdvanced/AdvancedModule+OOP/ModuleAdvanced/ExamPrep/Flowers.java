package ModuleAdvanced.ExamPrep;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(ele -> liliesStack.push(ele));

        ArrayDeque<Integer> rosesQueue = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int wreathCount = 0;
        int otherFlowers = 0;

        while (!liliesStack.isEmpty() && !rosesQueue.isEmpty()) {
            int lily = liliesStack.pop();
            int rose = rosesQueue.poll();

            int sum = lily + rose;

            while (sum > 15) {
                lily -= 2;
                sum = lily + rose;
            }

            if (sum == 15) {
                wreathCount++;
            } else if (sum < 15) {
                otherFlowers += sum;
            }
        }

        int leftoverWreaths = otherFlowers / 15;
        wreathCount +=  leftoverWreaths;

        if (wreathCount >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!%n", wreathCount);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!%n", 5 - wreathCount);
        }
    }
}
