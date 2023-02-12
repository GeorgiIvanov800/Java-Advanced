package ModuleAdvanced.ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class lootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> loot = new ArrayList<>();

        ArrayDeque<Integer> firstBoxQueue = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(ele -> secondBoxStack.push(ele));

        while (!firstBoxQueue.isEmpty() && !secondBoxStack.isEmpty()) {
            int firstBoxItem = firstBoxQueue.peek();
            int secondBoxItem = secondBoxStack.peek();

            int sum = firstBoxItem + secondBoxItem;

            if (sum % 2 == 0) {
                firstBoxQueue.poll();
                secondBoxStack.pop();
                loot.add(sum);
            } else {
                secondBoxStack.pop();
                firstBoxQueue.offer(secondBoxItem);
            }
        }

        System.out.println();
    }
}
