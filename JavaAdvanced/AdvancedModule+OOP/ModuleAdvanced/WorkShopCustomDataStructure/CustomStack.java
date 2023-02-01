package ModuleAdvanced.WorkShopCustomDataStructure;

import java.util.NoSuchElementException;

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
public int pop() {
        if (this.size == 0) {
            throw new NoSuchElementException("Not going to happen there is no elements in the Stack");
        }
        int element = this.data[this.size - 1];
        this.data[this.size - 1] = 0;
        this.size--;

        if (this.size <= this.capacity / 4) {
            shrink();
        }

        return element;
}


    private void resize() {
        this.capacity *= 2;
        int[] copyArr = new int[this.capacity];

        System.arraycopy(this.data, 0, copyArr, 0, this.data.length);
        this.data = copyArr;
    }


    private void shrink() {
        this.capacity /= 2;
        int[] copyArr = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            copyArr[i] = this.data[i];
        }
        this.data = copyArr;
    }
}
