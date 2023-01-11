package ModuleAdvanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryTask {
    public static void main(String[] args) {
        // stack vs list

        // X vs Y    -> O(?) x      compare      O(?) y

        // N 2 ^ 32

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String nextNavigation = scanner.nextLine();
        String currentURL = "blank";


        while (!nextNavigation.equals("Home")) {

            if (nextNavigation.equals("back")) {
                if (!history.isEmpty()) {
                    currentURL = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    nextNavigation = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentURL.equals("blank")) {
                    history.push(currentURL);
                }
                currentURL = nextNavigation;
            }
            System.out.println(currentURL);
            nextNavigation = scanner.nextLine();
        }
    }
}
