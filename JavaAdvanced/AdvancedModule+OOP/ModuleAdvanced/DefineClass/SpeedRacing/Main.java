package ModuleAdvanced.DefineClass.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine()); // number of cars need to be tracked
        Map<String, Car> cars = new LinkedHashMap<>();
        // in the map -> car Model : Car Obj
        for (int i = 0; i < countCars; i++) {
            String[] data = scanner.nextLine().split("\\s+"); // car data
            //"{Model} {FuelAmount} {FuelCostFor1km}
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double priceFuelPerKm = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, priceFuelPerKm);
            cars.put(model, car);

        }


        String input = scanner.nextLine();

        while (!input.equals("End")) {
            //input = Drive {CarModel} {amountOfKm}

            String carModel = input.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(input.split("\\s+")[2]);

            //take which car will be driven
            Car carToDrive = cars.get(carModel);

            if (!carToDrive.drive(kmToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }

            input = scanner.nextLine();
        }

        for (var car : cars.values()) {
            System.out.println(car.toString());

        }

    }
}
