package ModuleAdvanced.Generics.ArrayCreator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    public static <T> T[] create (Class<T> tClass, int length, T item) {

        T[] array = (T[]) Array.newInstance(tClass, length);

        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
}
