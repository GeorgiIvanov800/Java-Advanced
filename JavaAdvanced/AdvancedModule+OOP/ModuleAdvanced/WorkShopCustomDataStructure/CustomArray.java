package ModuleAdvanced.WorkShopCustomDataStructure;

import java.util.function.Consumer;

public class CustomArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;


    public CustomArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    //void add(int element) - Adds the given element to the end of the list
    public void add(int element) {
        //increase the capacity if needed.
        if (this.size == this.capacity) {
            resize();
        }

        this.data[this.size] = element;
        this.size++;
    }

    //int get(int index) - Returns the element at the specified position in this list
    public int get(int index) {
        checkIndex(index);
        return this.data[index];
    }


    //int remove(int index) - Removes the element at the given index
    public int remove(int index) {
        checkIndex(index);
        int element = this.data[index];

        this.data[index] = 0;
        shiftLeft(index);

        return element;
    }

    //bool contains(int element) - Checks if the list contains the given element returns (True or False)
    public boolean contain(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }


    /*
    void insert(int firstIndex, int secondIndex)
    Adds element at the specific index,
    the element at this index gets shifted to the right alongside any following elements, increasing the size
    */
    public void insert(int index, int element) {
        checkIndex(index);
        if (index == this.size - 1) {
            add(this.data[this.size - 1]);
            this.data[this.size - 2] = element;
        } else {
            if (this.size == this.capacity) {
                resize();
            }
            shiftRight(index);
            this.size++;
            this.data[index] = element;
        }
    }

    //void forEach(Consumer<Integer> consumer) - Goes through each one of the elements in the list
    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    private void shiftRight(int index) {
        for (int i = this.size; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    private void shiftLeft(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.size - 1] = 0;
        this.size--;
        if (this.size <= this.capacity / 4) {
            shrink();
        }
    }

    private void shrink() {
        this.capacity /= 2;
        int[] copyArr = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            copyArr[i] = this.data[i];
        }
        this.data = copyArr;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException
            (String.format("HEY HEY CAREFUL MATE Index %d is out of bounds with length %d WHAT THE HELL ARE YOU THINKING", index, this.size));
        }
    }


    private void resize() {
        this.capacity *= 2;
        int[] copyArr = new int[this.capacity];

        for (int i = 0; i < this.data.length; i++) {
            copyArr[i] = this.data[i];
        }
        this.data = copyArr;
    }
}
