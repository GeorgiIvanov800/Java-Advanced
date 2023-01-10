package FirstModule.MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            firstMatrix[row] = scanner.nextLine()
                    .replaceAll("\\s+","")
                    .toCharArray();
        }

        char[][] secondMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            secondMatrix[row] = scanner.nextLine()
                    .replaceAll("\\s+","")
                    .toCharArray();
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstElement = firstMatrix[row][col];
                char secondElement = secondMatrix[row][col];
                char fillChar = firstElement == secondElement ? firstElement : '*';
                System.out.print(fillChar + " ");
            }
            System.out.println();
        }

    }
}
