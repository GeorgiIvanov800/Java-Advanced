package ModuleAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // count rows and cols
        char[][] matrix = new char[n][n];
        int cheeseCounter = 0;
        for (int row = 0; row < matrix.length; row++) {
            String rowContent = scanner.nextLine(); // "M--"
            char[] rowSymbols = rowContent.toCharArray();
            matrix[row] = rowSymbols;
        }
        //find out on which position is the mouse
        int mouseRow = -1;
        int mouseCol = -1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'M') {
                    mouseRow = row;
                    mouseCol = col;
                    break;
                }
            }
        }

        String direction = scanner.nextLine();
        while (!direction.equals("end")) {
            matrix[mouseRow][mouseCol] = '-';

            //direction -> up, down, left, right
            switch (direction) {
                case "up":
                    mouseRow--;
                    break;
                case "down":
                    mouseRow++;
                    break;
                case "left":
                    mouseCol--;
                    break;
                case "right":
                    mouseCol++;
                    break;
                default:
                    System.out.println("Unknown command: " + direction);
            }

            //before making any movement need to validate the index
            if (mouseCol < 0 || mouseCol >= n || mouseRow < 0 || mouseRow >= n) {
                System.out.println("Where is the mouse?");
                break;
            }

            //check what is on the field on which the mouse is going to
            if (matrix[mouseRow][mouseCol] == 'c') {
                cheeseCounter++;

            } else if (matrix[mouseRow][mouseCol] == 'B') {
                continue;
            }

            matrix[mouseRow][mouseCol] = 'M';

            direction = scanner.nextLine();
        }
        if (cheeseCounter >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheeseCounter);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - cheeseCounter);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
