package ModuleAdvanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Extend "Browser History" with a "forward" instruction, which visits URLs that were navigated away from by "back".
//Each forward instruction visits the next most recent such URL. If normal navigation happens,
// all potential forward URLs are removed until a new back instruction is given if the forward instruction can't be executed, print
//"no next URLs".
public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextNavigation = scanner.nextLine();
        String currentURL = "blank";

        Deque<String> stackHistory = new ArrayDeque<>();
        Deque<String> queueHistory = new ArrayDeque<>();

        while (!nextNavigation.equals("Home")) {

            if (nextNavigation.equals("forward")) {
                if (!queueHistory.isEmpty()) {
                    currentURL = queueHistory.poll();
                } else {
                    System.out.println("no next URLs");
                    nextNavigation = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentURL.equals("blank")) {
                    queueHistory.offer(currentURL);
                }
            }



            if (nextNavigation.equals("back")) {
                if (!stackHistory.isEmpty()) {
                    currentURL = stackHistory.pop();
                } else {
                    System.out.println("no previous URLs");
                    nextNavigation = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentURL.equals("blank")) {
                    stackHistory.push(currentURL);
                }
                currentURL = nextNavigation;
            }
            System.out.println(currentURL);

           nextNavigation = scanner.nextLine();
        }

    }
}
