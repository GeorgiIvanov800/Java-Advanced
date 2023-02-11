package ModuleAdvanced.ExamPrep;

import java.util.Scanner;

public class Snake {
    public static int snakeRow;
    public static int snakeCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[matrixSize][matrixSize];

        int lairFirstRow = -1, lairFirstCol = -1,
                lairSecondRow = -1, lairSecondCol = -1;


        for (int row = 0; row < field.length; row++) {
            int lairCounter = 0;
            String input = scanner.nextLine();
            field[row] = input.toCharArray();
            if (input.contains("S")) {
                snakeRow = row;
                snakeCol = input.indexOf("S");
            }

            if (input.contains("B") && lairCounter == 0) {
                lairFirstRow = row;
                lairFirstCol = input.indexOf("B");
                lairCounter++;
            } else {
                lairSecondRow = row;
                lairSecondCol = input.indexOf("B");
            }

        }

        int foodEaten = 0;
        boolean isSnakeWithinLimits = true;

        while (isSnakeWithinLimits && foodEaten < 10) {
            String command = scanner.nextLine();


        }


    }
}
