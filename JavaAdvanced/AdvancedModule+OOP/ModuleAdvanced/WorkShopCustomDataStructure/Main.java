package ModuleAdvanced.WorkShopCustomDataStructure;

public class Main {
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();

        customArray.add(5);
        customArray.add(8);
        customArray.add(3);
        customArray.add(1);
        customArray.add(100);



        System.out.println(customArray.contain(5));
        System.out.println(customArray.contain(100));
        System.out.println(customArray.contain(101));
        customArray.remove(0);
        customArray.remove(0);


        System.out.println();
    }
}
