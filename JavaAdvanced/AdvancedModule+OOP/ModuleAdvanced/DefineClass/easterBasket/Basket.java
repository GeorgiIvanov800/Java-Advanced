package ModuleAdvanced.DefineClass.easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private String material;
    private int capacity;
    private List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Egg> getData() {
        return data;
    }

    public void setData(List<Egg> data) {
        this.data = data;
    }

    public void addEgg(Egg egg) {

        if (this.capacity > this.data.size()) {
            this.data.add(egg);
        }

    }

    public boolean removeEgg(String color) {
        return this.data.removeIf(egg -> egg.getColor().equals(color));
    }

    public Egg getStrongestEgg() {
        return this.data.stream().max(Comparator.comparing(Egg::getStrength)).get();
    }

    public Egg getEgg(String color) {
        return this.data.stream().filter(egg -> egg.getColor().equals(color))
                .findFirst().get();
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {
        StringBuilder bd = new StringBuilder();
        this.data.forEach(egg -> {
            bd.append(String.format("%s basket contains: %n",this.material));
            bd.append(System.lineSeparator());
            bd.append(egg.toString());
            bd.append(System.lineSeparator());
        });
        return bd.toString();
    }
}
