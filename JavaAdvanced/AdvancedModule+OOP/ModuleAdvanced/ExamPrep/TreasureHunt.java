package ModuleAdvanced.ExamPrep;

import java.util.Scanner;

public class TreasureHunt {

    private static int playerRow;
    private static int playerColl;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fieldSize = scanner.nextLine().split(" ");
        int n = Integer.parseInt(fieldSize[0]);
        int m = Integer.parseInt(fieldSize[1]);

        char[][] field = new char[n][m];

        for (int row = 0; row < field.length; row++) {
            String input = scanner.nextLine().replaceAll(" ","");
            field[row] = input.toCharArray();
            if (input.contains("Y")) {
                playerRow = row;
                playerColl = input.indexOf("Y");
            }
        }

        String movement = scanner.nextLine();

        while (!movement.equals("Finish")) {

                switch (movement) {
                    case "up":
                        movePlayer(field, playerRow - 1, playerColl);
                        break;
                    case "down":
                        movePlayer(field, playerRow + 1, playerColl);
                        break;
                    case "right":
                        movePlayer(field, playerRow, playerColl + 1);
                        break;
                    case "left":
                        movePlayer(field, playerRow, playerColl - 1);
                        break;
                }

            movement = scanner.nextLine();
        }
    }

    private static void movePlayer(char[][] field, int nextRow, int nextCol) {
        if (isInField(field, nextRow, nextCol)) {
            return;
        }

        if (field[nextRow][nextCol] == 'T') {
            return;
        }
        field[playerRow][playerColl] = '-';
        playerRow = nextRow;
        playerColl = nextCol;

    }

    private static boolean isInField(char[][] field, int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }
}
