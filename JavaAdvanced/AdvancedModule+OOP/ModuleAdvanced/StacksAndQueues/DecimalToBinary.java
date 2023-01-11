package ModuleAdvanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
//        13 -> ???? -> 1101
//        13 / 2 = 6 -> 1   |
//        6 / 2 = 3 ->  0   |
//        3 / 2 = 1 ->  1   |
//        1 / 2 = 0 ->  1   |

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackBits = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());

        if (num < 0) {
            System.out.println("Cannot handle negative integers");
            return;
        }
        if (num == 0) {
            System.out.println(0);
            return;
        }

        while (num > 0) {
            int bit = num % 2;
            stackBits.push("" + bit);

            num = num / 2;
        }
        while (!stackBits.isEmpty()) {
            System.out.print(stackBits.pop());
        }
    }
}
