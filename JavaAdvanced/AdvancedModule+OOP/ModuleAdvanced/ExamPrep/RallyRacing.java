package ModuleAdvanced.ExamPrep;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static ModuleAdvanced.MultidimensionalArrays.Exercises.MatrixShuffling.fillMatrix;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // matrix rows and cols
        String carNumber = scanner.nextLine(); // car number

        String[][] trace = new String[n][n];
        fillMatrix(trace, scanner);
        int km = 0;

        int currentRow = 0; // row on which is the car
        int currentCol = 0; // col on which is the car

        //find tunnels -> 2 tunnels
        // tunnel1 coordinates -> row, col
        // tunnel2 coordinates -> row, col
        // Array with 4 elements -> 1st element row tunnel1, 2nd element col tunnel1, 3rd element row tunnel2 , 4th element col tunnel2
        List<Integer> tunnelsCoordinate = new ArrayList<>();
        findTunnels(trace, tunnelsCoordinate);
        //start the race
        String direction = scanner.nextLine();
        int countTunnels = 0;

        while (!direction.equals("End")) {

            switch (direction) {
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
            }
            //currentRow, currentCol -> where is the car after the movement
            //what is on the index of  the car
            String movedPlace = trace[currentRow][currentCol]; // the place of the car in the trace
            if (movedPlace.equals(".")) {
                km += 10;
            } else if (movedPlace.equals("F")) {
                System.out.printf("Racing car %s finished the stage!%n", carNumber);
                km += 10;
                break;
            } else if (movedPlace.equals("T")) {
                //tunnel on the index
                countTunnels++;
                if (countTunnels == 1) {
                    // car should go out of the second tunnel
                    currentRow = tunnelsCoordinate.get(2);
                    currentCol = tunnelsCoordinate.get(3);
                    km += 30;
                    // we replace the tunnels with "."
                    trace[tunnelsCoordinate.get(0)][tunnelsCoordinate.get(1)] = "."; // replace the first tunnel with "."
                    trace[tunnelsCoordinate.get(2)][tunnelsCoordinate.get(3)] = "."; // replace the first tunnel with "."
                }

            }

            direction = scanner.nextLine();
        }

        if (direction.equals("End")) {
            System.out.printf("Racing car %s DNF.%n", carNumber);
        }
        System.out.printf("Distance covered %d km.%n", km);
        // we should replace the index on the trace on where the car is with "C"
        trace[currentRow][currentCol] = "C";
        printMatrix(trace);

    }

    private static void findTunnels(String[][] trace, List<Integer> tunnelsCoordinate) {
        for (int row = 0; row < trace.length; row++) {
            for (int col = 0; col < trace.length; col++) {
                if (trace[row][col].equals("T")) {
                    tunnelsCoordinate.add(row);
                    tunnelsCoordinate.add(col);
                }
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
