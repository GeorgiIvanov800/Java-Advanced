package ModuleAdvanced.ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {

    private static int playerRow;
    private static int playerColl;
    private static List<String> movements = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fieldSize = scanner.nextLine().split(" ");
        int n = Integer.parseInt(fieldSize[0]);
        int m = Integer.parseInt(fieldSize[1]);
        char[][] field = new char[n][m];
        int x = 0;
        int y = 0;

        for (int row = 0; row < field.length; row++) {
            String input = scanner.nextLine().replaceAll(" ","");
            field[row] = input.toCharArray();
            if (input.contains("Y")) {
                playerRow = row;
                playerColl = input.indexOf("Y");
            }
            if (input.contains("X")) {
                x = row;
                y = input.indexOf("X");
            }
        }

        String movement = scanner.nextLine();

        while (!movement.equals("Finish")) {


                switch (movement) {
                    case "up":
                        movePlayer(field, playerRow - 1, playerColl, movement);
                        break;
                    case "down":
                        movePlayer(field, playerRow + 1, playerColl, movement);
                        break;
                    case "right":
                        movePlayer(field, playerRow, playerColl + 1, movement);
                        break;
                    case "left":
                        movePlayer(field, playerRow, playerColl - 1, movement);
                        break;
                }

            movement = scanner.nextLine();
        }
        if (field[playerRow][playerColl] == 'X' ) {
            System.out.println("I've found the treasure!");
            System.out.println("The right path is " + String.join(", ", movements));
        } else {
            System.out.println("The map is fake!");
        }
    }

    private static void movePlayer(char[][] field, int nextRow, int nextCol, String movement) {

        if (!isInField(field, nextRow, nextCol)) {
            return;
        }

        if (field[nextRow][nextCol] == 'T') {
            return;
        }

        //field[playerRow][playerColl] = '-';
        //field[nextRow][nextCol] = 'Y';
        playerRow = nextRow;
        playerColl = nextCol;
        movements.add(movement);

    }

    private static boolean isInField(char[][] field, int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }
}
