package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

//        for (int index = 0; index < size; index++) {
//            System.out.print(matrix[index][index] + " ");
//        }
        int row = size - 1;
        int col = 0;

        while (isInBounds(row, col, matrix)) {
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
            System.out.println();
        }
    }

    private static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static boolean isOutOfBounds(int row, int col, int[][] matrix) {
        return !isInBounds(row, col, matrix);
    }
}
