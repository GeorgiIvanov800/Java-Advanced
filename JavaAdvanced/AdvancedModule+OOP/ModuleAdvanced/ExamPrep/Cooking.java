package ModuleAdvanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
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
                    cookedFood = "Fruit Pie";
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

            } else {
                ingredients.push(lastIngredient + 3);
            }
        }

        //check the sum according to the table and do the correct thing

        //Check and print output


    }
}
