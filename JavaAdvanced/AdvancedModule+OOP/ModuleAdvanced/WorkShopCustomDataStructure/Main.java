package ModuleAdvanced.WorkShopCustomDataStructure;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(2);
        stack.push(4);
        stack.push(66);
        stack.push(23);
        stack.push(99);

        stack.forEach(ele -> System.out.print(ele + " "));


    }
}
