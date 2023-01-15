package ModuleAdvanced.MultidimensionalArrays;

import java.util.Scanner;

public class P02PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];

        fillingMatrix(scanner, rows, cols, matrix);

        int search = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search) {
                    isFound = true;
                    System.out.println(i + " " + j);
                }
            }
        }


        if (!isFound) {
            System.out.println("not found");
        }
    }




    private static void fillingMatrix(Scanner scanner, int rows, int cols, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[] columnData = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(columnData[col]);
            }
        }
    }

}
