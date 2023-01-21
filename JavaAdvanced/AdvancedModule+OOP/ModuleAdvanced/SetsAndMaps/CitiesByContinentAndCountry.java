package ModuleAdvanced.SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Map<String(continent), Map<String(country), ListM<String>(city)>

        Map<String, Map<String, List<String >>> map = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            String continent = data[0];
            String country = data[1];
            String city = data[2];

            map.putIfAbsent(continent,new LinkedHashMap<>());
            Map<String, List<String>> countryWithCities = map.get(continent);
            countryWithCities.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countryWithCities.get(country);
            cities.add(city);
        }

        map.entrySet()
                .forEach(entry -> {
                    String continent = entry.getKey();
                    Map<String, List<String>> countryWithCitites = entry.getValue();

                    System.out.println(continent + ":");

                    countryWithCitites.entrySet().forEach(countryEntry -> {
                        System.out.println("  " + countryEntry.getKey() + " -> " + String.join(", ",countryEntry.getValue()));
                    });

                });
    }
}
