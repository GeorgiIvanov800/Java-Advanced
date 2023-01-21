package ModuleAdvanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        String[] inputOne = scanner.nextLine().split(" ");
        for (int i = 0; i < inputOne.length; i++) {
            deckOne.add(Integer.parseInt(inputOne[i]));
        }

        String[] inputTwo = scanner.nextLine().split(" ");
        for (int i = 0; i < inputTwo.length; i++) {
            deckTwo.add(Integer.parseInt(inputTwo[i]));
        }


        int step = 1;

        while (!deckOne.isEmpty() && !deckTwo.isEmpty()) {
            //fight logic
            if (step >= 50) {
                break;
            }
            Integer fighterOne = deckOne.iterator().next();
            Integer fighterTwo = deckTwo.iterator().next();
            deckOne.remove(fighterOne);
            deckTwo.remove(fighterTwo);

            if (fighterOne > fighterTwo) {
                deckOne.add(fighterOne);
                deckOne.add(fighterTwo);
            } else {
                //<=
                deckTwo.add(fighterOne);
                deckTwo.add(fighterTwo);
            }

            step++;
        }

        if (deckOne.isEmpty()) {
            System.out.println("Second player win!");
        } else if (deckTwo.isEmpty()) {
            System.out.println("First player win!");
        }
    }
}
