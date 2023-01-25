package ModuleAdvanced.FunctionalPrograming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class _04_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Double> parse = str -> Double.parseDouble(str);
        UnaryOperator<Double> addVat = d -> d * 1.2;
        Consumer<Double> print = number -> System.out.printf("%.2f%n", number);

        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", "))
                .map(ele -> parse.apply(ele))
                .map(price -> addVat.apply(price))
                .forEach(priceWithVat -> print.accept(priceWithVat));
    }
}
