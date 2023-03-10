package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long result = fib(n);
    }

    private static long fib(int n) {
        if (n < 1) {
            return 1;
        }
        return fib( n - 1) + fib(n - 2);
    }
}
