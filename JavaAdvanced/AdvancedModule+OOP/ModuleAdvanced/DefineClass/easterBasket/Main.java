package ModuleAdvanced.DefineClass.easterBasket;

public class Main {
    public static void main(String[] args) {
        Egg egg = new Egg("red", 5, "circle");
        //System.out.println(egg.toString());
        Basket basket = new Basket("wood",10);
        basket.addEgg(egg);
    }
}
