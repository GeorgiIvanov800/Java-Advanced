package ModuleAdvanced.FunctionalPrograming;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Integer> parse = s -> Integer.parseInt(s);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(element -> parse.apply(element))
                .collect(Collectors.toList());
        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + numbers.stream().mapToInt(e -> e).sum());
    }
}
