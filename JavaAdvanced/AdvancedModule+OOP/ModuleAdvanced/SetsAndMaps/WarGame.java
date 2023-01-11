package ModuleAdvanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;
public class WarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        String[] split = scanner.nextLine().split("\\s+");
        Stream<String> stream = Arrays.stream(split);
        IntStream intStream = stream.map(Integer::parseInt);
        */

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));


        int rounds = 0;

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            rounds++;
            if (rounds == 50) {
                break;
            }

            Iterator<Integer> firstIterator = firstDeck.iterator();

            int firstCard = firstIterator.next();
            firstIterator.remove();

            Iterator<Integer> secondIterator = secondDeck.iterator();

            int secondCard = secondIterator.next();
            secondIterator.remove();

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if (secondCard > firstCard) {
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }

        }

        if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (secondDeck.size() > firstDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
