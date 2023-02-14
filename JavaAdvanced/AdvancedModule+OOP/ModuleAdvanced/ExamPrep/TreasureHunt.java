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
        System.out.println();
    }
}
