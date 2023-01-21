package ModuleAdvanced.SetsAndMaps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//Read a list of integers and print the largest 3 of them. If there are less than 3, print all of them.
public class LargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(toList());
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            count++;
            if (count > 3) {
                break;
            }
            System.out.print(numbers.get(i) + " ");
        }
    }
}
