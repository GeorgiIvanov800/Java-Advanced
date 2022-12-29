package FunctionalPrograming;

import java.util.function.Consumer;

public class demoConsumer {
    public static void main(String[] args) {
        Consumer<String> print = message -> System.out.println(message);
        print.accept("Hello");
    }
    void print(String message) {
        System.out.println(message);
    }
}
