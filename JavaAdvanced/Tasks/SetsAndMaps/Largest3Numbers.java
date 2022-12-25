package SetsAndMaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // print sorted numbers using streams and limit them only to 3 numbers
        //Example if the input contains -> 10 30 15 20 50 5
        // output should be only consist of three number sorted in descending order

        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
