package ModuleAdvanced.FunctionalPrograming.Exercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//On the first line, you get a list of all the people that are coming. On the next lines, until you get the "Party!" command,
// you may be asked to double or remove all the people that apply to the given criteria
public class _10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> partyPeople = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            //TODO:
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            Predicate<String> predicate = getPredicate(commandParts);
            switch (command) {
                case "Double":
                    List<String> peopleToAddAgain = new ArrayList<>();
                    partyPeople.stream().filter(predicate).forEach(person -> peopleToAddAgain.add(person));
                    partyPeople.addAll(peopleToAddAgain);
                    break;
                case "Remove":
                    partyPeople.removeIf(predicate);
                    break;
                default:
                    System.out.println("Unknown command");
            }


            input = scanner.nextLine();
        }
        if (partyPeople.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(partyPeople);
            String result = String.join(", " , partyPeople) + " are going to the party!";
            System.out.println(result);

        }
    }

    public static Predicate<String> getPredicate(String[] commandParts) {
        String filterName = commandParts[1];
        String filterCriteria = commandParts[2];
        Predicate<String> predicate = null;

        switch (filterName) {
            case "StartsWith":
                return predicate = name -> name.startsWith(filterCriteria);
            case "EndsWith":
                return predicate = name -> name.endsWith(filterCriteria);
            case "Length":
                return predicate = name -> name.length() == Integer.parseInt(filterCriteria);
            default:
                System.out.println("Unknown command");
        }
        return predicate;
    }
}
