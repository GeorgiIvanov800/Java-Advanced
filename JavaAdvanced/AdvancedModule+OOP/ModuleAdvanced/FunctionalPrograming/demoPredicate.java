package ModuleAdvanced.FunctionalPrograming;

import java.util.function.Predicate;

public class demoPredicate {
    boolean isEven(int number) {
        return number % 2 == 0;   // instead of using this method we can use Predicate
    }
    public static void main(String[] args) {

        Predicate<Integer> isEven =
                number -> number % 2 == 0;
        System.out.println(isEven.test(6));
    }
}
