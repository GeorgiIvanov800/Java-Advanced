package ModuleAdvanced.ExamPrep;

import java.util.Scanner;

public class ReVolt {

    public static int playerRow;
    public static int playerCol;
    public static boolean hasWon = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int commandsCount = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String input = scanner.nextLine();
            matrix[row] = input.toCharArray();

            if (input.contains("f")) {
                playerRow = row;
                playerCol = input.indexOf("f");
            }

        }

        while (commandsCount-- > 0 && !hasWon) {
            String command = scanner.nextLine();

            switch (command) {
                case "up":
                    movePLayer(matrix, playerRow - 1, playerCol);
                    break;
                case "down":
                    movePLayer(matrix, playerRow + 1, playerCol);
                    break;
                case "left":
                    movePLayer(matrix, playerRow, playerCol - 1);
                    break;
                case "right":
                movePLayer(matrix, playerRow, playerCol + 1);
                    break;
            }


        }

        printMatrix(matrix);
    }


    private static void movePLayer(char[][] matrix, int nextRow, int nextCol) {

        if (isOutOfBounds(matrix, nextRow, nextCol)) {
            if (nextRow < 0 || nextRow >= matrix.length) {
                nextRow = nextRow < 0 ? matrix.length - 1 : 0;
            } else {
                nextCol = nextRow < 0 ? matrix[nextRow].length - 1 : 0;
            }
        }
        if (matrix[nextRow][nextCol] == 'T') {
            return;
        } else if (matrix[nextRow][nextCol] == 'B') {
            moveBonus(matrix);
        } else if (matrix[nextRow][nextCol] == 'F') {
            hasWon = true;
        }

        matrix[playerRow][playerCol] = '-';
        matrix[nextRow][nextCol] = 'f';
        playerRow = nextRow;
        playerCol = nextCol;
    }

    private static void moveBonus(char[][] matrix) {

        int nextRow = playerRow - 1;
        int nextCol = playerCol;

        if (isOutOfBounds(matrix, nextRow, nextCol)) {
            if (nextRow < 0 || nextRow >= matrix.length) {
                nextRow = nextRow < 0 ? matrix.length - 1 : 0;
            } else {
                nextCol = nextRow < 0 ? matrix[nextRow].length - 1 : 0;
            }
        }

         if (matrix[nextRow][nextCol] == 'F') {
            hasWon = true;
        }

        matrix[playerRow][playerCol] = '-';
        matrix[nextRow][nextCol] = 'f';
        playerRow = nextRow;
        playerCol = nextCol;
    }


    public static boolean isOutOfBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0 || c >= matrix[r].length;
    }


    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }
}
