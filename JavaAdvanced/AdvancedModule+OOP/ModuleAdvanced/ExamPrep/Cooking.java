package ModuleAdvanced.ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read input first line is queue second is stack

        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ele -> ingredients.push(ele));

        Map<String, Integer> cookedFoods = new TreeMap<>();
        cookedFoods.put("Bread", 0);
        cookedFoods.put("Cake", 0);
        cookedFoods.put("Fruit Pie", 0);
        cookedFoods.put("Pastry", 0);

        //sum first from queue with first from stack
        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int lastIngredient = ingredients.pop();
            int sum = liquids.poll() + lastIngredient;
            String cookedFood;

            switch (sum) {
                case 25:
                    cookedFood = "Bread";
                    break;
                case 50:
                    cookedFood = "Cake";
                    break;
                case 75:
                    cookedFood = "Fruit Pie";
                    break;
                case 100:
                    cookedFood = "Pastry";
                    break;
                default:
                    cookedFood = null;
                    break;
            }

            if (cookedFood != null) {
                int newVal = cookedFoods.get(cookedFood) + 1;
                cookedFoods.put(cookedFood, newVal);
            } else {
                ingredients.push(lastIngredient + 3);
            }
        }
        boolean allFoodAreCooked = cookedFoods.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (allFoodAreCooked) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        String remainingLiquids = liquids.isEmpty() ? "none" : liquids.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Liquids left: " + remainingLiquids);

        String remainingIngredients = ingredients.isEmpty() ? "none" : ingredients.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Ingredients left: " + remainingIngredients);


        cookedFoods.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
