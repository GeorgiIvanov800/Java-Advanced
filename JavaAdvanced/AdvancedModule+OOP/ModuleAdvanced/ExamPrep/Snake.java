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

        char[][] field = new char[matrixSize][matrixSize];
        List<Integer> lairCoordinates = new ArrayList<>();

        int lairFirstRow = -1, lairFirstCol = -1,
                lairSecondRow = -1, lairSecondCol = -1;


        for (int row = 0; row < field.length; row++) {
            String input = scanner.nextLine();
            field[row] = input.toCharArray();
            if (input.contains("S")) {
                snakeRow = row;
                snakeCol = input.indexOf("S");
            }
        }
        findLair(field, lairCoordinates);

        int foodEaten = 0;
        boolean isSnakeWithinLimits = true;

        while (isSnakeWithinLimits && foodEaten < 10) {
            String command = scanner.nextLine();


        }


    }

    private static void findLair(char[][] matrix, List<Integer> lairCoordinates) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 'B') {
                    lairCoordinates.add(row);
                    lairCoordinates.add(col);
                }
            }
        }
    }
}
