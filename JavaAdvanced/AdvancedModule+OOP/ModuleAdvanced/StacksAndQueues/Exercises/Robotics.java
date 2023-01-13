package ModuleAdvanced.StacksAndQueues.Exercises;

import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String robotsInput = scanner.nextLine(); // ROB-15;SS2-10;NX8000-3
        String[] robotsData = robotsInput.split(";");
        Map<String, Integer> robots = getRobotsMap(robotsData);
        Map<String, Integer> robotsWorkingTime = getRobotsWorkingTimeMap(robotsData);

        String startTime = scanner.nextLine(); //8:00:00
        int startTimeInSecond = getStartTimeInSeconds(startTime);

        ArrayDeque<String> queueProducts = new ArrayDeque<>();
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            queueProducts.offer(product);
            product = scanner.nextLine();
        }
        
        while (!queueProducts.isEmpty()) {
            String currentProduct = queueProducts.poll();
            startTimeInSecond++;
            // reduce the time for processing on all the robots which are working
            decreaseWorkingTime(robotsWorkingTime);
            boolean isTaken = false;
            // check which robot is free -> working time = 0;
            for (var robot : robotsWorkingTime.entrySet()) {
                if (robot.getValue() == 0) { // this robot is free -> so the robot started to work on the product
                    System.out.println(robot.getKey() + " - " + currentProduct + "[" + getStartTime(startTimeInSecond) + "]");
                    robotsWorkingTime.put(robot.getKey(), robots.get(robot.getKey()));
                    isTaken = true;
                    break;
                }
            }

            if (!isTaken) {
                queueProducts.offer(currentProduct);
            }
        }
        

    }

    private static void decreaseWorkingTime(Map<String, Integer> robotsWorkingTime) {
        for (var robot : robotsWorkingTime.entrySet()) {
            if (robot.getValue() > 0) { // he is working
                robotsWorkingTime.put(robot.getKey(), robot.getValue() - 1);
            }
        }
    }

    private static Map<String, Integer> getRobotsWorkingTimeMap(String[] robotsData) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String robotData : robotsData) {
            //robotData = "ROB-15" -> split("-") -> ["ROB", "15"]
            String robotName = robotData.split("-")[0];
            robots.put(robotName, 0);
        }
        return robots;
    }

    private static int  getStartTimeInSeconds(String startTime) {
        int hours = Integer.parseInt(startTime.split(":")[0]);
        int min = Integer.parseInt(startTime.split(":")[1]);
        int sec = Integer.parseInt(startTime.split(":")[2]);
        // make the time in seconds
        return hours * 3600 + min * 60 + sec;
    }

    private static LinkedHashMap<String, Integer> getRobotsMap(String[] robotsData) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String robotData : robotsData) {
            //robotData = "ROB-15" -> split("-") -> ["ROB", "15"]
            String robotName = robotData.split("-")[0];
            int processingTime = Integer.parseInt(robotData.split("-")[1]);
            robots.put(robotName, processingTime);
        }
        return robots;
    }

    private static String getStartTime(int startTimeInSeconds) {
        // sec -> "hh:mm:ss"
        int hours = startTimeInSeconds / 3600;
        int min = startTimeInSeconds % 3600 / 60;
        int sec = startTimeInSeconds % 60;

        return String.format("%02d:%02d:%02d",hours, min, sec);
    }
}
