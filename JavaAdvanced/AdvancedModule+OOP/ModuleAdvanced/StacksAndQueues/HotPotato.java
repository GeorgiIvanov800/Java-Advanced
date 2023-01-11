package ModuleAdvanced.StacksAndQueues;

import java.util.*;

//Create a program that simulates the game of Hot Potato. Print every kid that is removed from the circle.
// In the end, print the kid that is left last.
public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");

        int steps = Integer.parseInt(scanner.nextLine());

        Deque<String> kids = new ArrayDeque<>();
        Collections.addAll(kids, names);

        while (kids.size() > 1) {
            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }

            String removedKid = kids.poll();
            System.out.println("Removed " + removedKid);
        }
        System.out.println("Last is " + kids.poll());
    }
}
