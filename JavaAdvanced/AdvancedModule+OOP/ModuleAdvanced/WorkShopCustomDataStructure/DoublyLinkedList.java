package ModuleAdvanced.WorkShopCustomDataStructure;

import java.util.NoSuchElementException;

public class DoublyLinkedList {



//int removeLast() – removes the element at the end of the collection
//void forEach() – goes through the collection and executes a given action
//int[] toArray() – returns the collection as an array
static class ListNode {
        int element;
        ListNode next;
        ListNode prev;

        public ListNode(int element) {
            this.element = element;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int size;


// void addFirst(int element) – adds an element at the beginning of the collection
    public void addFirst(int element) {
        ListNode newNode = new ListNode(element);

        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

//void addLast(int element) – adds an element at the end of the collection
    public void addLast(int element) {
        ListNode newNode = new ListNode(element);

        if (this.size == 0) {
            this.head = this.tail = newNode;
        } else {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }


//int get(int index) - Returns the element at the specified position in this list
    public int get(int index) {
        validateIndex(index);


        if (index <= this.size / 2 ) {
            ListNode currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.element;
        } else {
            ListNode currentNode = this.tail;
            for (int i = this.size - 1; i > index ; i--) {
                currentNode = currentNode.prev;
            }
            return currentNode.element;
        }
    }


//int removeFirst() – removes the element at the beginning of the collection
    public int removeFirst() {
        checkEmpty();
        int fistElement = this.head.element;
        this.head = this.head.next;

        if (this.head == null) {
            //Single element
            this.tail = null;
        } else {
            this.head.prev = null;
        }
        this.size--;
        return fistElement;
    }

//int removeLast() – removes the element at the end of the collection
    public int removeLast() {

    int element = this.tail.element;
    this.tail = this.tail.prev;

    if (this.tail == null) {
        this.head = null;
    } else {
        this.tail.next = null;
    }

    this.size--;
    return element;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("What the hell are you thinking index is out of BOUNDS!");
        }
    }
    private void checkEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("Node is empty");
        }
    }
}

