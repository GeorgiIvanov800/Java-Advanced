package ModuleAdvanced.WorkShopCustomDataStructure;

public class Main {
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();

        customArray.add(5);
        customArray.add(8);
        customArray.add(3);
        customArray.add(1);


        System.out.println();
        customArray.insert(3, 100);


        System.out.println();
    }
}
