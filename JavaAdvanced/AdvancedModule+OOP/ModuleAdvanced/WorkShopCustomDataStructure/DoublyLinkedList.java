package ModuleAdvanced.WorkShopCustomDataStructure;

public class DoublyLinkedList {


//int get(int index) - Returns the element at the specified position in this list
//int removeFirst() – removes the element at the beginning of the collection
//int removeLast() – removes the element at the end of the collection
//void forEach() – goes through the collection and executes a given action
//int[] toArray() – returns the collection as an array
    class ListNode {
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

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("What the hell are you thinking index is out of BOUNDS!");
        }
        ListNode currentNode = this.head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.element;
    }
}

