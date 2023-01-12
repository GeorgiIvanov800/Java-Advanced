package ModuleOOP.WorkinWithAbstraction.TrafficLights;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = Arrays.stream(scanner.nextLine().split(" ")).toList();

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color : colors) {
            Color currentColor = Color.valueOf(color);
            TrafficLight currentTrafficLight = new TrafficLight(currentColor);
            trafficLights.add(currentTrafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            //TODO:
            //change color
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
            //print trafficLight
        }
    }
}
