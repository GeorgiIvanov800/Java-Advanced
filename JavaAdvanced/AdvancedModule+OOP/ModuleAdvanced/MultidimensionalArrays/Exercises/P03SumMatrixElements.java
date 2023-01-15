package ModuleAdvanced.MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class P03SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] data = new int[rows][cols];

        for (int row = 0; row < data.length; row++) {
            String[] elements = scanner.nextLine().split(", ");
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = Integer.parseInt(elements[col]);
            }
        }
        int sum = 0;
        for (int[] row : data) {
            for (int cell : row) {
                sum += cell;
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
