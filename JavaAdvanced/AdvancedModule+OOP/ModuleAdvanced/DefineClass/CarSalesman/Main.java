package ModuleAdvanced.DefineClass.CarSalesman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enginesCount = Integer.parseInt(scanner.nextLine());

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


        }
    }
}
