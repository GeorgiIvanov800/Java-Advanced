package ModuleAdvanced.WorkShopCustomDataStructure;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }


public void push(int element) {
    if (this.size == this.capacity) {
        resize();
    }
    this.data[this.size] = element;
    this.size++;
}



    private void resize() {
        this.capacity *= 2;
        int[] copyArr = new int[this.capacity];

        System.arraycopy(this.data, 0, copyArr, 0, this.data.length);
        this.data = copyArr;
    }
}
