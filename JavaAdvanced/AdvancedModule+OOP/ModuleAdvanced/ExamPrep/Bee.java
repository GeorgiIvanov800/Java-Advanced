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

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            //before the move -> .
            territory[beeRow][beeCol] = '.';
            if (command.equals("right") && beeCol != size - 1) {
                beeCol++;
            } else if (command.equals("left") && beeCol != 0) {
                beeCol--;
            } else if (command.equals("down") && beeRow != size - 1) {
                beeRow++;
            } else if (command.equals("up") && beeRow != 0) {
                beeRow--;
            } else {
                System.out.println("The bee is lost");
            }
            //after the move -> 'B'
            territory[beeRow][beeCol] = 'B';
            command = scanner.nextLine();
        }


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
