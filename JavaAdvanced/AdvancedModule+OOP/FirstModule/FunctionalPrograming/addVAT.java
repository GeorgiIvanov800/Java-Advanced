package FirstModule.FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class addVAT {
    //Write a program that reads one line of Double prices separated by ", ". Print the prices with added VATs for all of them.
    //Format them to the 2nd digit after the decimal point. The order of the prices must remain the same.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<Double, Double> addVat = p -> p * 1.20;
        Consumer<Double> print = d -> System.out.printf("%.2f%n", d);

        UnaryOperator<Double> addVat = p -> p * 1.20;

        System.out.print("Price with VAT:");
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(print);


    }
}
