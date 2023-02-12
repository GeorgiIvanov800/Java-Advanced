package ModuleAdvanced.ExamPrep;

import java.util.Scanner;

public class Bee {
   private static int beeRow;
    private static int beeCol;
    private static int flowers;

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
                territory[beeRow][beeCol] = '.';
                System.out.println("The bee got lost!");
                break;
            }

            if (territory[beeRow][beeCol] == 'f') {
                flowers++;
            } else if (territory[beeRow][beeCol] == 'O') {
                continue;
            }

            //after the move -> 'B'
            territory[beeRow][beeCol] = 'B';
            command = scanner.nextLine();
        }

        if (flowers < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - flowers);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowers);
        }
        printMatrix(territory);

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
