package ModuleAdvanced.ExamPrep;

import java.util.Scanner;

public class mouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            field[i] = scanner.nextLine().toCharArray();
        }


        print2dArray(field);
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
