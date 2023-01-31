package ModuleAdvanced.SetsAndMaps.Exercises;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> usersMap = new TreeMap<>();

        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");
            String ipParts = inputParts[0];
            String userNameParts = inputParts[2];
            String userName = userNameParts.substring(5);
            String ip = ipParts.substring(3);


            if (!usersMap.containsKey(userName)) {
                usersMap.put(userName, new LinkedHashMap<>());
            }
            if (!usersMap.get(userName).containsKey(ip)) {
                usersMap.get(userName).put(ip, 1);
            } else {
                int ipAttacksCounter = usersMap.get(userName).get(ip);
                usersMap.get(userName).put(ip, ipAttacksCounter);
            }
            input = scanner.nextLine();
        }

        for (var attacker : usersMap.entrySet()) {
            System.out.printf("%s: %n", attacker.getKey());
            LinkedHashMap<String, Integer> attacks = attacker.getValue();
            StringBuilder sb = new StringBuilder();

            for (var singleIpAttack : attacks.entrySet()) {
                String formattedAttack = String.format("%s => %d, %n", singleIpAttack.getKey(), singleIpAttack.getValue());
                sb.append(formattedAttack);
            }
            String finalOutput = sb.substring(0, sb.length() - 4);
            finalOutput = finalOutput + ".";
            System.out.println(finalOutput);
        }
    }

}
