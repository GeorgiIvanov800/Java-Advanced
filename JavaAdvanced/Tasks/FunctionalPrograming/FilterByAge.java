package FunctionalPrograming;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterByAge {
    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    //Write a program that reads an integer N on the first line. And on next N lines read pairs of "{name}, {age}". Then read three more lines:
    //•	Condition - "younger" or "older"
    //•	Age - Integer
    //•	Format - "name", "age" or "name age"
    //Depending on the condition, print the pairs in the right format.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split(", ");

            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person p = new Person(name, age);
            people.add(p);
        }

        String ageCondition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String outputFormat = scanner.nextLine();

        people = filterByAgeCondition(people, ageCondition.equals("younger") ? (p -> p.age <= ageFilter : p -> p.age >= ageFilter);
        people = filterByAgeCondition(people, getPredicate(ageCondition, ageFilter));
        Consumer<Person> printer = getPrinter(outputFormat);
        people.forEach(printer);
    }

    private static Consumer<Person> getPrinter(String outputFormat) {
        switch (outputFormat) {
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
                throw new IllegalArgumentException("Unknown format " + outputFormat);
        }
    }

    private static Predicate<Person> getPredicate(String ageCondition, int ageFilter) {
        switch (ageCondition) {
            case "younger":
                return p -> p.age <= ageFilter;
            case "older":
                return p -> p.age >= ageFilter;
            default:
                throw new IllegalArgumentException("Invalid parameters for age predicate, " + ageCondition + " " + ageFilter);
        }
    }

    public static List<Person> filterByAgeCondition(List<Person> people, Predicate<Person> predicate) {
        // "younger" or "older"
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
