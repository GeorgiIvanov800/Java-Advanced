package ModuleOOP.AbstractClassAndInterface;

public class Ctizen implements  Person {

    private String name;
    private int age;

    public Ctizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
