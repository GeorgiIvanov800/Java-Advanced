package ModuleAdvanced.Generics;

import java.util.ArrayList;
import java.util.List;

public class Container <T>{
    private List<T> items;

    public Container() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public boolean removeItem(T item) {
        return this.items.remove(item);
    }
}
