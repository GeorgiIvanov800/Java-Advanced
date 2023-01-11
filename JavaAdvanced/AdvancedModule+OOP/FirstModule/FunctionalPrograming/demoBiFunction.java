package FirstModule.FunctionalPrograming;

import java.util.function.BiFunction;

public class demoBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> sum = (x, y) -> "Sum is" + (x + y);
        //two input parameters
        //Analogically can use -> BiConsumer, BiPredicate
    }
}
