package ModuleAdvanced.DefineClass.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enginesCount = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();

        for (int i = 1; i <= enginesCount; i++) {
            //"{Model} {Power} {Displacement} {Efficiency}
            // required: model, power
            //optional: displacement, efficiency

            String[] engineData = scanner.nextLine().split("\\s+");

            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            int displacement = 0;
            String efficiency = null;

            if (engineData.length == 4) {
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3) {
                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = Integer.parseInt(engineData[2]);
                } else {
                    efficiency = engineData[2];
                }
            }

            //model, power, displacement, efficiency
            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);
        }

        //CARS
        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int carCount = 1; carCount <= carsCount; carCount++) {
            //"{Model} {Engine} {Weight} {Color}
            String[] carData = scanner.nextLine().split("\\s+");
            //required:
            String carModel = carData[0];
            String engineModel = carData[1];
            //optional:
            int weight = 0;
            String color = null;

            if (carData.length == 4) {
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length == 3) {
                if (Character.isDigit(carData[2].charAt(0))) {
                    weight = Integer.parseInt(carData[2]);
                }else {
                    color = carData[2];
                }
            }
            Engine carEngine = null;
            for (Engine engine : engines) {
                if (engineModel.equals(engine.getModel())) {
                    carEngine = engine;
                    break;
                }
            }
            Car car = new Car(carModel, carEngine, weight, color);
            System.out.print(car.toString());
        }
    }
}
