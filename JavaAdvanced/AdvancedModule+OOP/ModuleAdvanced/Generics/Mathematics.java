package ModuleAdvanced.Generics;

public interface Mathematics<T extends Number> {
    int multiplyBy2(T number);

    int multiplyBy2(Number number);
}
