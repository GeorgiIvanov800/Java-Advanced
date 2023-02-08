package ModuleAdvanced.ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int matrixSize = Integer.parseInt(scanner.nextLine());
       String[] commands = scanner.nextLine().split(",");

       char[][]matrix = new char[matrixSize][matrixSize];

       int sapperRow = 0;
       int sapperCol = 0;
       int bombCounter = 0;

        for (int row = 0; row < matrixSize; row++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());
            for (int col = 0; col < characterList.size(); col++) {
                char currentChar = characterList.get(col);
                if (currentChar == 's') {
                    sapperRow = row;
                    sapperCol = col;
                } else if (currentChar == 'B') {
                    bombCounter++;
                }
                matrix[row][col] = currentChar;
            }
        }

        
    }
}
