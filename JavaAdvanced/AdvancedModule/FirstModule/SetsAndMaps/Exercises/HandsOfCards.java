package FirstModule.SetsAndMaps.Exercises;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HandsOfCards {
    //You are given a sequence of people and for every person what cards he draws from the deck. The input will be separate lines in the format:
    //"{personName}: {PT, PT, PT,… PT}"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, HashSet<String>> players = new LinkedHashMap<>();

        while (!command.equals("JOKER")) {
            String[] commandTokens = command.split(": ");
            String name = commandTokens[0];
            String[] cards = commandTokens[1].split(", ");

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }

            for (String card : cards) {
                players.get(name).add(card);
            }

            command = scanner.nextLine();
        }

        for (var player : players.entrySet()) {
            String playerName = player.getKey();
            int point = calculatePoints(player.getValue());
            System.out.printf("%s: %d%n", playerName, point);
        }
    }

    private static int calculatePoints(HashSet<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            char type = card.charAt(card.length() - 1);

            int cardPoints = getPower(power) * getType(type);
            points += cardPoints;
        }
        return points;
    }

    private static int getPower(String power){
        switch (power) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power);
        }
    }

    private static int getType(char type){
        switch (type) {
            case 'S':
                return 4;
            case 'H':
                return 3;
            case 'D':
                return 2;
            case 'C':
                return 1;
            default:
                return 0;
        }
    }
}
