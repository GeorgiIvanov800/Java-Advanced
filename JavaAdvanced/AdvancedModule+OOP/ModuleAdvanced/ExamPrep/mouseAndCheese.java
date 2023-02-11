package ModuleAdvanced.ExamPrep;

import java.util.Scanner;

public class mouseAndCheese {
    private static int rowws = 0;
    private static int colls = 0;
    private static int eatenCheese = 0;
    private static boolean mouseIsinField = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            field[i] = scanner.nextLine().toCharArray();
            if (line.contains("M")) {
                rowws = i;
                colls = line.indexOf("M");
            }
        }



        String command = scanner.nextLine();

        while (!command.equals("end") && mouseIsinField) {

            switch (command) {
                case "up":
                    moveMouse(field, rowws - 1, colls);
                    break;
                case "down":
                    moveMouse(field, rowws + 1, colls);
                    break;
                case "left":
                    moveMouse(field, rowws, colls - 1);
                    break;
                case "right":
                    moveMouse(field, rowws, colls + 1);
                    break;

            }

            command = scanner.nextLine();
        }

        if (!mouseIsinField) {
            System.out.println("Where is the mouse?");
        }

        if (eatenCheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!", eatenCheese);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more", 5 - eatenCheese);
        }

        print2dArray(field);
    }

    private static void moveMouse(char[][] field, int nextRow, int nextCol) {

        if (!isInBounds(field, nextRow, nextCol)) {
            mouseIsinField = false;
            return;
        }

        if (field[nextRow][nextCol] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextCol] == 'B') {

        }

        field[rowws][colls] = '-';
        field[nextRow][nextCol] = 'M';
        rowws = nextRow;
        colls = nextCol;
    }

    private static boolean isInBounds(char[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
    }


    public static void print2dArray(char[][] field) {
        for (char[] arr : field) {
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
