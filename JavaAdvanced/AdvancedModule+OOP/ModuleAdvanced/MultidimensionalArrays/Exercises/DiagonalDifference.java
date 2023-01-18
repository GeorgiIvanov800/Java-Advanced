package ModuleAdvanced.MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);
        int firstDiagonal = getSumElementOnPrimaryDiagonal(matrix);
        int secondDiagonal = getSumElementsOnSecondaryDiagonal(matrix);
        //print difference between the two diagonals
        System.out.println(Math.abs(firstDiagonal - secondDiagonal));


    }

    private static int getSumElementsOnSecondaryDiagonal(int [][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                 if (col == matrix.length - row - 1) {
                     //element is on the secondary diagonal
                     sum += matrix[row][col];
                 }
            }

        }

        return sum;
    }

    private static int getSumElementOnPrimaryDiagonal(int [][] matrix) {
        int sum = 0;
        //all elements in the matrix -> sum these elements that on the primary diagonal (col == row)
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) {
                    // element is on the primary diagonal
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
