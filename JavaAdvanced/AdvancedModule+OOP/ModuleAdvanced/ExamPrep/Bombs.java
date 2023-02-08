package ModuleAdvanced.ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(",");
        char[][] field = new char[input][input];

        int sapperRow = 0;
        int sapperCol = 0;
        int bombCounter = 0;
        int bombsFound = 0;

        for (int row = 0; row < field.length; row++) {
            String line = scanner.nextLine();
            field[row] = line.toCharArray();

            if (line.contains("s")) {
                sapperRow = row;
                sapperCol = line.indexOf("s");
            }

            if (line.contains("B")) {
                bombCounter++;
            }
        }

        for (int i = 0; i < command.length; i++) {
            String commandName = command[i];

            switch (commandName) {
                case "up":
                    if (sapperRow != 0) {
                        sapperRow--;
                    }
                    break;
                case "down":
                    if (sapperRow != field.length - 1) {
                        sapperRow++;
                    }
                    break;
                case "right":
                    if (sapperCol != field.length - 1) {
                        sapperCol++;
                    }
                    break;
                case "left":
                    if (sapperCol != 0) {
                        sapperCol--;
                    }
                    break;
            }

            if (field[sapperRow][sapperCol] == 'B') {
                System.out.println("You found a bomb!");
                bombsFound++;
            } else if (field[sapperRow][sapperCol] == 'e') {
                System.out.printf("END! %d bombs left on the field%n", bombCounter - bombsFound);
            }

        }
    }

    private static boolean isInBounds(char[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
    }
}
