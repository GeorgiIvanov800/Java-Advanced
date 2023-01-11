package FirstModule.FunctionalPrograming;

import java.util.Random;
import java.util.function.Supplier;

public class demoSupplier {
    public static void main(String[] args) {
        Supplier<Integer> genRandomInt =
                () -> new Random().nextInt(51);
        int rnd = genRandomInt.get();
    }

    int getRandomInt() {                // instead of using method we can se Supplier
        Random rnd = new Random();
        return rnd.nextInt();
    }
}
