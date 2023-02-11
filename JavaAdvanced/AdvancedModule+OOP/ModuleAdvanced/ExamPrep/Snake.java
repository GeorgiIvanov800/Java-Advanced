package ModuleAdvanced.ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snake {
    private static int snakeRow;
    private static int snakeCol;
    private static boolean isSnakeWithinLimits = true;
    private static int  foodEaten;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        

        char[][] field = new char[matrixSize][matrixSize];
        List<Integer> lairCoordinates = new ArrayList<>();
        
        fillField(scanner, field);
        findLairs(field, lairCoordinates);

        String command = scanner.nextLine();
        while (isSnakeWithinLimits && foodEaten < 10) {

            switch (command) {
                case "up":
                    moveSnake(field, snakeRow - 1, snakeCol, lairCoordinates);
                    break;
                case "down":
                    moveSnake(field, snakeRow + 1, snakeCol, lairCoordinates);
                    break;
                case "left":
                    moveSnake(field, snakeRow, snakeCol - 1, lairCoordinates);
                    break;
                case "right":
                    moveSnake(field, snakeRow, snakeCol + 1, lairCoordinates);
                    break;

            }
            command = scanner.nextLine();
           // System.out.println("<==================>");
            //printMatrix(field);
            //System.out.println("<==================>");


        }

        if (!isSnakeWithinLimits) {
            System.out.println("Games over!");
            System.out.println("Food eaten: " + foodEaten);
            printMatrix(field);
        } else {
            System.out.println("You won! You fed the snake.\n Food eaten: " + foodEaten);
            printMatrix(field);
        }


    }

    private static void moveSnake(char[][] field, int nextRow, int nextCol, List<Integer> coordinates) {
        
        if (!isInBounds(field, nextRow, nextCol)) {
            isSnakeWithinLimits = false;
            field[snakeRow][snakeCol] = '.';
            return;
        }
        
        if (field[nextRow][nextCol] == '*') {
            foodEaten++;
        } else if (field[nextRow][nextCol] == 'B') {
            field[snakeRow][snakeCol] = '.';

            field[coordinates.get(0)][coordinates.get(1)] = '.';
            field[coordinates.get(2)][coordinates.get(3)] = 'S';
            snakeRow = coordinates.get(2);
            snakeCol = coordinates.get(3);
            return;
        }

        field[snakeRow][snakeCol] = '.';
        field[nextRow][nextCol] = 'S';
        snakeRow = nextRow;
        snakeCol = nextCol;

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

    private static boolean isInBounds(char[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
    }


    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
