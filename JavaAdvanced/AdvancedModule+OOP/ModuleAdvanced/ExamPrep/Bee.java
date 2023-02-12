package ModuleAdvanced.ExamPrep;

import java.util.Scanner;

public class Bee {
    static int beeRow;
    static int beeCol;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        char[][] territory = new char[size][size];

        for (int row = 0; row < territory.length; row++) {
            String input = scanner.nextLine();
            territory[row] = input.toCharArray();
            if (input.contains("B")) {
                beeRow = row;
                beeCol = input.indexOf("B");
            }
        }

        printMatrix(territory);
        System.out.println();
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
