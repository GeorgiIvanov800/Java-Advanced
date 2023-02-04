package ModuleAdvanced.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();
        MapContainer<String, Integer> map = new MapContainer<>();

        map.addItem("Gosho", 26);
        System.out.println();
    }
}
