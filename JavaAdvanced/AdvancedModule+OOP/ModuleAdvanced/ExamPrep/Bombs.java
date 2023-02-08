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
                    
                    break;
                case "down":
                    break;
                case "right":
                    break;
                case "left":
                    break;
            }

        }
    }
}
