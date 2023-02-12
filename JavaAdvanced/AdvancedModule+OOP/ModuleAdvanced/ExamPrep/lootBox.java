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

        System.out.println();
    }
}
