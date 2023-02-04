package ModuleAdvanced.Generics;

import java.util.List;

public class JarOfPickles extends Jar<Pickle>{
    private List<Pickle> data;
    public void addItem(Pickle item) {
        this.data.add(item);
    }
}
