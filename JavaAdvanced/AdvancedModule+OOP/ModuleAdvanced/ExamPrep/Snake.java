package ModuleAdvanced.ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snake {
    public static int snakeRow;
    public static int snakeCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        int foodEaten = 0;
        boolean isSnakeWithinLimits = true;

        char[][] field = new char[matrixSize][matrixSize];
        List<Integer> lairCoordinates = new ArrayList<>();

        fillField(scanner, field);
        findLairs(field, lairCoordinates);


        while (isSnakeWithinLimits && foodEaten < 10) {
            String command = scanner.nextLine();


        }


    }





    private static void fillField(Scanner scanner, char[][] field) {
        for (int row = 0; row < field.length; row++) {
            String input = scanner.nextLine();
            field[row] = input.toCharArray();
            if (input.contains("S")) {
                snakeRow = row;
                snakeCol = input.indexOf("S");
            }
        }
    }

    private static void findLairs(char[][] field, List<Integer> lairCoordinates) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field.length; col++) {
                if (field[row][col] == 'B') {
                    lairCoordinates.add(row);
                    lairCoordinates.add(col);
                }
            }
        }
    }
}
