package ModuleOOP.WorkinWithAbstraction.CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Card Suits:");
//        Arrays.stream(CardSuits.values()).forEach
//                (cardSuits -> System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuits.ordinal(), cardSuits.name()));
        System.out.println("Card Ranks:");
        for (CardRanks cardRank : CardRanks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }

    }
}
