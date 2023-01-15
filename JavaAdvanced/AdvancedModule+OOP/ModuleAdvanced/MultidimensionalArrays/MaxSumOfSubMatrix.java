package ModuleAdvanced.MultidimensionalArrays;

import java.util.Scanner;
//Write a program that reads a matrix from the console.
// Then find the biggest sum of a 2x2 submatrix. Print the submatrix and its sum.
public class MaxSumOfSubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] table = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] columnData = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                table[i][j] = Integer.parseInt(columnData[j]);
            }
        }
        int maxSumTopLeftRow = -1;
        int maxSumTopLeftCol = -1;
        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < table.length - 1; row++) {
            for (int col = 0; col < table[row].length - 1; col++) {
                int currentSum = table[row][col] + table[row][col + 1]
                        + table[row + 1][col] + table[row + 1][col + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumTopLeftRow = row;
                    maxSumTopLeftCol = col;
                }
            }
        }

        System.out.println(table[maxSumTopLeftRow][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(table[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);
    }
}
