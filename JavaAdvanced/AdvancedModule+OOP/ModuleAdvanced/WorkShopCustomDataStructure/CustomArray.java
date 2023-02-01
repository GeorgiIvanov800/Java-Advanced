package ModuleAdvanced.WorkShopCustomDataStructure;

public class CustomArray {
    //bool contains(int element) - Checks if the list contains the given element returns (True or False)
    //void add(int firstIndex, int secondIndex) - Adds element at the specific index, the element at this index gets shifted to the right alongside any following elements, increasing the size
    //void forEach(Consumer<Integer> consumer) - Goes through each one of the elements in the list

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

    private void shiftLeft(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[data[i]] = this.data[i + 1];
        }
        this.data[this.size - 1] = 0;
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
