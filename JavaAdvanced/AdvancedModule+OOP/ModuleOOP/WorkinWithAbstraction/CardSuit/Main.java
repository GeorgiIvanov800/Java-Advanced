package ModuleOOP.WorkinWithAbstraction.CardSuit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Card Suits:");
//        Arrays.stream(CardSuits.values()).forEach
//                (cardSuits -> System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuits.ordinal(), cardSuits.name()));
//        System.out.println("Card Ranks:");
//        for (CardRanks cardRank : CardRanks.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
//        }

        Scanner scanner = new Scanner(System.in);
        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine()); //CardRanks.TWO
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardSuits, cardRanks);

        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardRanks(), card.getCardSuits(), card.getPower());

    }
}
