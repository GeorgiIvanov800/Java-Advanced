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
        cookedFoods.put("Fruit pie", 0);
        cookedFoods.put("Pastry", 0);

        //sum first from queue with first from stack
        while (!liquids.isEmpty() && !ingredients.isEmpty()) {

            int sum = liquids.peek() + ingredients.peek();
            String cookedFood;
            switch (sum) {
                case 25:
                    cookedFood = "Bread";
                    break;
                case 50:
                    cookedFood = "Cake";
                    break;
                case 75:
                    cookedFood = "Fruit pie";
                    break;
                case 100:
                    cookedFood = "Pastry";
                    break;
                default:
                    cookedFood = null;
            }
            liquids.poll();
            int lastIngredient = ingredients.pop();

            if (cookedFood != null) {
                int newVal = cookedFoods.get(cookedFood) + 1;
                cookedFoods.put(cookedFood, newVal);
            } else {
                ingredients.push(lastIngredient + 3);
            }
        }
        boolean allFoodAreCooked = cookedFoods.entrySet().stream().allMatch(e -> e.getValue() > 0);
        if (allFoodAreCooked) {

        } else {

        }
        cookedFoods.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        //check the sum according to the table and do the correct thing

        //Check and print output


    }
}
