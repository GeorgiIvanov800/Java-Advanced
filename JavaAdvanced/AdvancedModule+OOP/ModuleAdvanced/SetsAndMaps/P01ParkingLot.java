package ModuleAdvanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> carsNumber = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String command = tokens[0];
            String carNumber = tokens[1];

            switch (command) {
                case "IN":
                    carsNumber.add(carNumber);
                    break;
                case "OUT":
                    carsNumber.remove(carNumber);
                    break;
                default:
                    System.out.println("Unknown Command");
            }

            input = scanner.nextLine();
        }
        if (carsNumber.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String cars : carsNumber) {
                System.out.println(cars);
            }
        }
    }
}
