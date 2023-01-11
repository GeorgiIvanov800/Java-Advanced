package FirstModule.SetsAndMaps.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String userName = scanner.nextLine();
            set.add(userName);
        }

        for (String userName : set) {
            System.out.println(userName);
        }
        System.out.println("------------------");

        set.forEach(e -> System.out.println(e));
    }
}
