package ModuleAdvanced.ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Bombs01 {
    private static Map<String, Integer> createdBombs = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> bombEffectQueue = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> bombCasingStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(ele -> bombCasingStack.push(ele));
        boolean filledPouch = false;

        createdBombs.put("Cherry Bombs", 0);
        createdBombs.put("Datura Bombs", 0);
        createdBombs.put("Smoke Decoy Bombs", 0);

        while (!bombCasingStack.isEmpty() && !bombEffectQueue.isEmpty()) {
            int effect = bombEffectQueue.peek();
            int casing = bombCasingStack.pop();
            int sum = effect + casing;


            switch (sum) {
                case 40:
                    createdBombs.put("Datura Bombs", createdBombs.get("Datura Bombs") + 1);
                    bombEffectQueue.poll();
                    break;
                case 60:
                    createdBombs.put("Cherry Bombs", createdBombs.get("Cherry Bombs") + 1);
                    bombEffectQueue.poll();
                    break;
                case 120:
                    createdBombs.put("Smoke Decoy Bombs", createdBombs.get("Smoke Decoy Bombs") + 1);
                    bombEffectQueue.poll();
                    break;
                default:
                    bombCasingStack.push(casing - 5);
            }

            filledPouch = createdBombs.entrySet().stream().allMatch(ele -> ele.getValue() >= 3);

            if (filledPouch)
                break;
        }

        String resultEffect = bombEffectQueue.isEmpty() ? "empty"
                : bombEffectQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));

        String resultCassing = bombCasingStack.isEmpty() ? "empty"
                : bombCasingStack.stream().map(String::valueOf).collect(Collectors.joining(", "));

        if (filledPouch) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
            System.out.println("Bomb Effects: " + resultEffect);
            System.out.println("Bomb Casings: " + resultCassing);
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
            System.out.println("Bomb Effects: " + resultEffect);
            System.out.println("Bomb Casings: " + resultCassing);
        }

        createdBombs.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


    }
}
