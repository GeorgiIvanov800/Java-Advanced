package ModuleAdvanced.MultidimensionalArrays.Exercises;

import java.util.Scanner;


public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensionsInput = scanner.nextLine(); //"3 4"
        int rows = Integer.parseInt(dimensionsInput.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensionsInput.split("\\s+")[1]);
        String[][] matrix = new String[rows][cols];
        //filling the matrix
        fillMatrix(matrix, scanner);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            //command validation
            //valid
            if (validateCommand(command, rows, cols)) {
                String[] commandParts = command.split("\\s+");
                int row1 = Integer.parseInt(commandParts[1]); // >= 0 && < count rows
                int col1 = Integer.parseInt(commandParts[2]);
                int row2 = Integer.parseInt(commandParts[3]);
                int col2 = Integer.parseInt(commandParts[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                printMatrix(matrix, rows, cols);
            }
            //not valid
            else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }


    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            //scanner.nextLine() -> "1 2 3"
            //scanner.nextLine().split(" ") -> ["1", "2", "3"]
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }

    private static boolean validateCommand(String command, int rows, int cols) {
        //true -> if command is valid
        // false -> if command is not valid
        // command = "swap row1 col1 row2 col2"
        String[] commandParts = command.split("\\s+"); // "swap 1 3 4 6".split("\\s+") -> ["swap", "1", "3", "4", "6"]
        //1. count command parameters -> 5
        if (commandParts.length != 5) {
            return false;
        }

        //2. command starts with the word "swap"
        if (!commandParts[0].equals("swap")) {
            return false;
        }

        //3. if rows and cols given by the command are valid index in the matrix
        int row1 = Integer.parseInt(commandParts[1]); // >= 0 && < count rows
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) {
            return false;
        }
        return true;
    }
    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
