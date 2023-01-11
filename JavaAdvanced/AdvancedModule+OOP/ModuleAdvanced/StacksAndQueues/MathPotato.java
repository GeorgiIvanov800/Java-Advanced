package ModuleAdvanced.StacksAndQueues;

import java.util.*;

//Rework the previous problem by using a PriorityQueue so that a child is removed only on a composite (not prime) cycle (cycles start from 1).
//If a cycle is prime, print the child's name.
//As before, print the name of the child that is left last.
public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");

        int steps = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kids = new PriorityQueue<>();
        Collections.addAll(kids, names);
        int currentSteps = 1;

        while (kids.size() > 1) {
            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }
            if (isPrime(currentSteps)){
                System.out.println("Prime " + kids.peek());
            } else {
                String removedKid = kids.poll();
                System.out.println("Removed " + removedKid);
            }
            currentSteps++;
        }
        System.out.println("Last is " + kids.poll());

    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
