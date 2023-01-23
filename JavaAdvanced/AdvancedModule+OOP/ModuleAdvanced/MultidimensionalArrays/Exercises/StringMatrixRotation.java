package ModuleAdvanced.MultidimensionalArrays.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//You are given a sequence of text lines. Assume these text lines form a matrix of characters (pad the missing positions with spaces to build a rectangular matrix).
// Write a program to rotate the matrix by 90, 180, 270, 360,… degrees.
// Print the result at the console as a sequence of strings after receiving the "END" command.
public class StringMatrixRotation {
    public static void main(String[] args) {
        //Read input?
        Scanner scanner = new Scanner(System.in);
        String rotationInput = scanner.nextLine();

        //create matrix
        int maxColumnLength = Integer.MIN_VALUE;
        String input = scanner.nextLine();
        List<String> words = new ArrayList<>();

        while (!input.equals("END")) {

            int currentLength = input.length();

            if (currentLength > maxColumnLength) {
                maxColumnLength = currentLength;
            }
            words.add(input);
            input = scanner.nextLine();
        }
        int rows = words.size();
        int cols = maxColumnLength;
        char[][] matrix = new char[words.size()][maxColumnLength];
        //fill matrix
        for (int row = 0; row < matrix.length; row++) {
            String currentWord = words.get(row);
            for (int col = 0; col < matrix[row].length; col++) {
                if (col < currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        //rotate and print
        int angle = Integer.parseInt(rotationInput.split("[()]")[1]);
        int angleOfRotation = angle % 360;
        printMatrix(matrix, rows, cols, angleOfRotation);

    }

    private static void printMatrix(char[][] matrix, int rows, int cols, int angleOfRotation) {
        switch (angleOfRotation) {
            case 0:
                //do not rotate
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                //rotate right
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                //rotate upside down
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                //rotate left
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
