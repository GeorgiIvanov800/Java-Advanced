package ModuleAdvanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PastryShop {
    private static final int BISCUIT_VALUE = 25;
    private static final int CAKE_VALUE = 50;
    private static final int PASTRY_VALUE = 75;
    private static final int PIE_VALUE = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquidsQueue = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque:: new));

        ArrayDeque<Integer>  ingredientsStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).forEach(ele -> ingredientsStack.push(ele));


        int biscuitCount = 0;
        int cakeCount = 0;
        int pastryCount = 0;
        int pieCount = 0;

        while (!liquidsQueue.isEmpty() && !ingredientsStack.isEmpty()) {
            int liquid = liquidsQueue.poll();
            int ingredient = ingredientsStack.pop();
            int sum = liquid + ingredient;

            switch (sum) {
                case BISCUIT_VALUE:
                    biscuitCount++;
                    break;
                case CAKE_VALUE:
                    cakeCount++;
                    break;
                case PASTRY_VALUE:
                    pastryCount++;
                case PIE_VALUE:
                    pieCount++;
                default: ingredientsStack.push(ingredient + 3);
            }
        }

        if (biscuitCount > 0 && cakeCount > 0 && pieCount > 0 && pastryCount > 0) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        String remainingIngridients =  ingredientsStack.stream().map(String::valueOf)
                        .collect(Collectors.joining(", "));
        System.out.print("Liquids left: ");
        if (liquidsQueue.isEmpty()) {
            System.out.print("none");
            System.out.println();
        } else {
            System.out.println("Ingredients left: " + remainingIngridients);
        }

        
    }
}
