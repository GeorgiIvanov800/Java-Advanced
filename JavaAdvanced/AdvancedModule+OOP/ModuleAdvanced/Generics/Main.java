package ModuleAdvanced.Generics;

import ModuleAdvanced.Generics.GenericScale.Scale;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(21, 11);
        System.out.println(scale.getHeavier());
    }
}
