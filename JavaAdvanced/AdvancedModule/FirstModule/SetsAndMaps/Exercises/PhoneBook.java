package FirstModule.SetsAndMaps.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    //Write a program that receives some info from the console about people and their phone numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phoneBook = new HashMap<>();

        while (!input.equals("search")) {
            String[] inputTokens = input.split("-");
            String name = inputTokens[0];
            String phoneNumber = inputTokens[1];
            phoneBook.put(name, phoneNumber);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")) {

            if (phoneBook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n",input);
            }

            input = scanner.nextLine();
        }
    }
}
